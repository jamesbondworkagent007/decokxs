package o;

import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply;
import com.okinc.wallet.core.sign.ton.TonProofData;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cdD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11918cdD extends AbstractC12442cmy {
    public final C11886ccY copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11918cdD(@NotNull C11886ccY c11886ccY) {
        super(c11886ccY);
        Intrinsics.checkNotNullParameter(c11886ccY, "");
        this.copydefault = c11886ccY;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(android.net.Uri.parse(this.copydefault.KWHzl().getUrl()).getHost());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.String url = (java.lang.String) objM7377constructorimpl;
        if (url == null) {
            url = this.copydefault.KWHzl().getUrl();
        }
        TonProofData tonProofData = new TonProofData(new TonProofData.ProofData(java.lang.System.currentTimeMillis() / ((long) 1000), url, this.copydefault.KWHzl().getPayload()), this.copydefault.htlTjW());
        java.lang.String strCopydefault = C54901xZn.OLrzqt.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), tonProofData);
        return strCopydefault.length() == 0 ? "" : AEQbTJ(tonProofData, strCopydefault);
    }

    public final java.lang.String AEQbTJ(TonProofData tonProofData, java.lang.String str) {
        KSerializer<TonProofReply> kSerializerSerializer = TonProofReply.Companion.serializer();
        java.lang.String name = this.copydefault.KWHzl().getName();
        long timestamp = tonProofData.getProofData().getTimestamp();
        byte[] bytes = tonProofData.getProofData().getDomain().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return C54907xZt.encodeToString$default(kSerializerSerializer, new TonProofReply(name, new TonProofReply.Proof(timestamp, new TonProofReply.Domain(bytes.length, tonProofData.getProofData().getDomain()), str, tonProofData.getProofData().getPayload())), false, 2, null);
    }
}
