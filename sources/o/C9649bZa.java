package o;

import com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaTxResult;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.solana.GenerateRawTransactionBean;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9649bZa extends AbstractC9595bYZ {
    public final C9413bVC AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9649bZa(@NotNull C9413bVC c9413bVC) {
        super(c9413bVC);
        Intrinsics.checkNotNullParameter(c9413bVC, "");
        this.AEQbTJ = c9413bVC;
    }

    public static /* synthetic */ void generateNewBlockhash$default(C9649bZa c9649bZa, InterfaceC58257yxq interfaceC58257yxq, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        c9649bZa.copydefault((InterfaceC58257yxq<ResponseData<SolanaTxResult>>) interfaceC58257yxq, str, z, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull final InterfaceC58257yxq<ResponseData<SolanaTxResult>> interfaceC58257yxq, @NotNull java.lang.String str, boolean z, boolean z2) {
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        Intrinsics.checkNotNullParameter(str, "");
        C54892xZe c54892xZe = C54892xZe.KWHzl;
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        java.lang.String data = ((SolanaContractSignData) this.AEQbTJ.QVsKAR()).getData();
        if (data == null) {
            data = "";
        }
        SolanaSignInfo solanaSignInfoAkhnZx = this.AEQbTJ.AkhnZx();
        java.lang.String recentBlockhash = solanaSignInfoAkhnZx != null ? solanaSignInfoAkhnZx.getRecentBlockhash() : null;
        if (recentBlockhash == null) {
            recentBlockhash = "";
        }
        int iQwvEab = this.AEQbTJ.QwvEab();
        java.lang.String str2 = iQwvEab != 2 ? iQwvEab != 3 ? iQwvEab != 4 ? iQwvEab != 7 ? null : "invest" : "nft" : "dex" : "dapp";
        java.lang.Integer numValueOf2 = z ? java.lang.Integer.valueOf(C33129mqd.AhwBna(CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.OLrzqt()))) : null;
        if (z) {
            SolanaSignInfo solanaSignInfoAkhnZx2 = this.AEQbTJ.AkhnZx();
            numValueOf = java.lang.Integer.valueOf(C33129mqd.AhwBna(solanaSignInfoAkhnZx2 != null ? solanaSignInfoAkhnZx2.getComputeUnitPrice() : null));
        } else {
            numValueOf = null;
        }
        c54892xZe.OLrzqt(applicationAEQbTJ, data, recentBlockhash, str2, java.lang.Boolean.valueOf(z2), str, numValueOf2, numValueOf, new android.webkit.ValueCallback() { // from class: o.bZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9649bZa.OLrzqt(interfaceC58257yxq, this, (java.lang.String) obj);
            }
        });
    }

    public static final void OLrzqt(InterfaceC58257yxq interfaceC58257yxq, C9649bZa c9649bZa, java.lang.String str) {
        java.lang.Boolean boolValueOf;
        java.lang.Object objM7377constructorimpl;
        if (str != null) {
            boolValueOf = java.lang.Boolean.valueOf(str.length() == 0);
        } else {
            boolValueOf = null;
        }
        C10856bwO.copydefault("SolanaSignContractHandler", 0, "初步解析 " + boolValueOf);
        if (str == null || str.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            interfaceC58257yxq.onSuccess(new ResponseData(-5000, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPositiveButtonIcon), null, null, null, null, 60, null));
            return;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((SolanaTxResult) C54907xZt.OLrzqt(SolanaTxResult.Companion.serializer(), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SolanaTxResult solanaTxResult = (SolanaTxResult) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        C10856bwO.copydefault("SolanaSignContractHandler", 0, "bean对象解析 " + (solanaTxResult == null));
        if (solanaTxResult == null) {
            interfaceC58257yxq.onSuccess(new ResponseData(-5005, null, null, null, null, null, 62, null));
        } else {
            interfaceC58257yxq.onSuccess(new ResponseData(-5001, null, null, null, solanaTxResult, null, 46, null));
        }
    }

    public final AbstractC58260yxt<ResponseData<SignedTx>> OLrzqt(@NotNull final java.lang.String str, final SolanaTxResult solanaTxResult) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<ResponseData<SignedTx>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C9649bZa.copydefault(str, solanaTxResult, this, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r12v6, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(java.lang.String str, SolanaTxResult solanaTxResult, final C9649bZa c9649bZa, final InterfaceC58257yxq interfaceC58257yxq) {
        java.lang.String from;
        java.lang.String str2;
        java.util.List<java.lang.String> bizId;
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        C54892xZe c54892xZe = C54892xZe.KWHzl;
        java.lang.String encodeStr = solanaTxResult != null ? solanaTxResult.getEncodeStr() : null;
        if (encodeStr == null) {
            encodeStr = "";
        }
        final java.lang.String strKWHzl = c54892xZe.KWHzl(str, encodeStr);
        C10856bwO.copydefault("SolanaSignContractHandler", 0, "generateRawTransaction final sign =  " + (strKWHzl == null || strKWHzl.length() == 0));
        if (strKWHzl.length() == 0) {
            interfaceC58257yxq.onSuccess(c9649bZa.copydefault(new SignedTx((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null)));
            return;
        }
        if (c9649bZa.AEQbTJ.QwvEab() == 5) {
            from = c9649bZa.AEQbTJ.htlTjW();
        } else {
            from = ((SolanaContractSignData) c9649bZa.AEQbTJ.QVsKAR()).getFrom();
            if (from == null) {
                str2 = "";
            }
            android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
            java.lang.String encodeTransactionStr = solanaTxResult != null ? solanaTxResult.getEncodeTransactionStr() : null;
            java.lang.String str3 = encodeTransactionStr != null ? "" : encodeTransactionStr;
            java.lang.String bizType = ((SolanaContractSignData) c9649bZa.AEQbTJ.QVsKAR()).getBizType();
            java.lang.String str4 = bizType != null ? "" : bizType;
            bizId = ((SolanaContractSignData) c9649bZa.AEQbTJ.QVsKAR()).getBizId();
            if (bizId == null) {
                bizId = yDY.AhwBna();
            }
            c54892xZe.AEQbTJ(applicationAEQbTJ, new GenerateRawTransactionBean(str3, strKWHzl, str2, str4, bizId), new android.webkit.ValueCallback() { // from class: o.bZc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    C9649bZa.copydefault(interfaceC58257yxq, c9649bZa, strKWHzl, (java.lang.String) obj);
                }
            });
        }
        str2 = from;
        android.app.Application applicationAEQbTJ2 = C9678baC.Companion.AEQbTJ();
        if (solanaTxResult != null) {
        }
        if (encodeTransactionStr != null) {
        }
        java.lang.String bizType2 = ((SolanaContractSignData) c9649bZa.AEQbTJ.QVsKAR()).getBizType();
        if (bizType2 != null) {
        }
        bizId = ((SolanaContractSignData) c9649bZa.AEQbTJ.QVsKAR()).getBizId();
        if (bizId == null) {
        }
        c54892xZe.AEQbTJ(applicationAEQbTJ2, new GenerateRawTransactionBean(str3, strKWHzl, str2, str4, bizId), new android.webkit.ValueCallback() { // from class: o.bZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9649bZa.copydefault(interfaceC58257yxq, c9649bZa, strKWHzl, (java.lang.String) obj);
            }
        });
    }

    public static final void copydefault(InterfaceC58257yxq interfaceC58257yxq, C9649bZa c9649bZa, java.lang.String str, java.lang.String str2) {
        boolean z = str2 == null || str2.length() == 0;
        C10856bwO.copydefault("SolanaSignContractHandler", 0, "generateRawTransaction final tx is empty = " + z + " : tx==null = " + Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) AbstractJsonLexerKt.NULL) + " ");
        if (str2 == null || str2.length() == 0 || Intrinsics.EZpvd((java.lang.Object) AbstractJsonLexerKt.NULL, (java.lang.Object) str2)) {
            interfaceC58257yxq.onSuccess(c9649bZa.copydefault(new SignedTx((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null)));
        } else {
            interfaceC58257yxq.onSuccess(c9649bZa.copydefault(new SignedTx(str2, str, (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null)));
        }
    }

    public final ResponseData<SignedTx> copydefault(SignedTx signedTx) {
        java.lang.String tx = signedTx.getTx();
        if (tx == null || tx.length() == 0) {
            return new ResponseData<>(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData<>(-5001, null, null, null, signedTx, null, 46, null);
    }
}
