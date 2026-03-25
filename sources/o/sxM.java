package o;

import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.okex.rating.bean.RatingMetadataResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class sxM {
    public static final C6808aWP copydefault(@NotNull RatingMetadataResponse ratingMetadataResponse) {
        Intrinsics.checkNotNullParameter(ratingMetadataResponse, "");
        RatingDisplayStatus status = ratingMetadataResponse.getStatus();
        if (status == null) {
            status = RatingDisplayStatus.Unknown;
        }
        return new C6808aWP(status);
    }
}
