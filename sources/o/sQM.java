package o;

import com.okinc.okimcore.model.remote.ChannelResult;
import com.okinc.okimcore.model.remote.UserResult;
import com.okinc.okimcore.model.share.ShareResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQM {
    public static final ShareResult OLrzqt(@NotNull ChannelResult channelResult) {
        Intrinsics.checkNotNullParameter(channelResult, "");
        long channelId = channelResult.getChannelId();
        return new ShareResult(java.lang.String.valueOf(channelId), null, channelResult.isSuccess(), channelResult.getErrorCode(), channelResult.getErrorMsg());
    }

    public static final ShareResult KWHzl(@NotNull UserResult userResult) {
        Intrinsics.checkNotNullParameter(userResult, "");
        long userUid = userResult.getUserUid();
        return new ShareResult(null, java.lang.String.valueOf(userUid), userResult.isSuccess(), userResult.getErrorCode(), userResult.getErrorMsg());
    }
}
