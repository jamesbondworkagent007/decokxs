package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35842oFs {
    public final C35839oFp AEQbTJ;
    public final C35849oFz AYXKKw;
    public final C35843oFt EZpvd;
    public final C35841oFr KWHzl;
    public final C35840oFq OLrzqt;
    public final C35844oFu copydefault;

    @yCM
    public C35842oFs(@NotNull C35843oFt c35843oFt, @NotNull C35840oFq c35840oFq, @NotNull C35844oFu c35844oFu, @NotNull C35849oFz c35849oFz, @NotNull C35841oFr c35841oFr, @NotNull C35839oFp c35839oFp) {
        Intrinsics.checkNotNullParameter(c35843oFt, "");
        Intrinsics.checkNotNullParameter(c35840oFq, "");
        Intrinsics.checkNotNullParameter(c35844oFu, "");
        Intrinsics.checkNotNullParameter(c35849oFz, "");
        Intrinsics.checkNotNullParameter(c35841oFr, "");
        Intrinsics.checkNotNullParameter(c35839oFp, "");
        this.EZpvd = c35843oFt;
        this.OLrzqt = c35840oFq;
        this.copydefault = c35844oFu;
        this.AYXKKw = c35849oFz;
        this.KWHzl = c35841oFr;
        this.AEQbTJ = c35839oFp;
    }

    public final OKMessage OLrzqt(@NotNull SendMessageRequest sendMessageRequest, @NotNull OKConversation oKConversation, GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(sendMessageRequest, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        SendMessageRequestParam sendMessageRequestParamCopydefault = sendMessageRequest.copydefault();
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.ImageOrGif) {
            return this.OLrzqt.copydefault((SendMessageRequestParam.ImageOrGif) sendMessageRequestParamCopydefault, oKConversation);
        }
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Text) {
            return this.EZpvd.EZpvd((SendMessageRequestParam.Text) sendMessageRequestParamCopydefault, oKConversation, groupInfo);
        }
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Voice) {
            return this.AYXKKw.KWHzl((SendMessageRequestParam.Voice) sendMessageRequestParamCopydefault, oKConversation);
        }
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Video) {
            return this.copydefault.copydefault((SendMessageRequestParam.Video) sendMessageRequestParamCopydefault, oKConversation);
        }
        if (sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.Sticker) {
            return this.KWHzl.OLrzqt((SendMessageRequestParam.Sticker) sendMessageRequestParamCopydefault, oKConversation);
        }
        if (!(sendMessageRequestParamCopydefault instanceof SendMessageRequestParam.File)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.AEQbTJ.EZpvd((SendMessageRequestParam.File) sendMessageRequestParamCopydefault, oKConversation);
    }
}
