package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35848oFy {
    public final C35846oFw AEQbTJ;
    public final C35838oFo EZpvd;
    public final C35845oFv KWHzl;
    public final C35835oFl OLrzqt;
    public final C35836oFm copydefault;
    public final oFC gEmmrt;

    @yCM
    public C35848oFy(@NotNull C35836oFm c35836oFm, @NotNull C35838oFo c35838oFo, @NotNull oFC ofc, @NotNull C35845oFv c35845oFv, @NotNull C35846oFw c35846oFw, @NotNull C35835oFl c35835oFl) {
        Intrinsics.checkNotNullParameter(c35836oFm, "");
        Intrinsics.checkNotNullParameter(c35838oFo, "");
        Intrinsics.checkNotNullParameter(ofc, "");
        Intrinsics.checkNotNullParameter(c35845oFv, "");
        Intrinsics.checkNotNullParameter(c35846oFw, "");
        Intrinsics.checkNotNullParameter(c35835oFl, "");
        this.copydefault = c35836oFm;
        this.EZpvd = c35838oFo;
        this.gEmmrt = ofc;
        this.KWHzl = c35845oFv;
        this.AEQbTJ = c35846oFw;
        this.OLrzqt = c35835oFl;
    }

    public final OKMessageContent EZpvd(@NotNull SendMessageRequestParam sendMessageRequestParam) {
        Intrinsics.checkNotNullParameter(sendMessageRequestParam, "");
        if (sendMessageRequestParam instanceof SendMessageRequestParam.ImageOrGif) {
            return this.EZpvd.EZpvd((SendMessageRequestParam.ImageOrGif) sendMessageRequestParam);
        }
        if (sendMessageRequestParam instanceof SendMessageRequestParam.Text) {
            return this.gEmmrt.KWHzl((SendMessageRequestParam.Text) sendMessageRequestParam);
        }
        if (sendMessageRequestParam instanceof SendMessageRequestParam.Voice) {
            return this.copydefault.OLrzqt((SendMessageRequestParam.Voice) sendMessageRequestParam);
        }
        if (sendMessageRequestParam instanceof SendMessageRequestParam.Video) {
            return this.KWHzl.OLrzqt((SendMessageRequestParam.Video) sendMessageRequestParam);
        }
        if (sendMessageRequestParam instanceof SendMessageRequestParam.Sticker) {
            return this.AEQbTJ.OLrzqt((SendMessageRequestParam.Sticker) sendMessageRequestParam);
        }
        if (sendMessageRequestParam instanceof SendMessageRequestParam.File) {
            return this.OLrzqt.AEQbTJ((SendMessageRequestParam.File) sendMessageRequestParam);
        }
        throw new NoWhenBranchMatchedException();
    }
}
