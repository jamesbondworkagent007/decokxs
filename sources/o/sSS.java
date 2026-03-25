package o;

import androidx.core.view.ViewCompat;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sSS {
    public static /* synthetic */ android.text.SpannableStringBuilder toSpannable$default(OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i3 & 2) != 0) {
            i2 = -16776961;
        }
        return OLrzqt(oKStreamPlaceHolderMessage, i, i2);
    }

    public static final android.text.SpannableStringBuilder OLrzqt(@NotNull OKStreamPlaceHolderMessage oKStreamPlaceHolderMessage, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(oKStreamPlaceHolderMessage, "");
        return new sSV().OLrzqt(oKStreamPlaceHolderMessage, i, i2);
    }

    public static /* synthetic */ android.text.SpannableStringBuilder toSpannable$default(StreamPlaceHolderMessageData streamPlaceHolderMessageData, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i3 & 2) != 0) {
            i2 = -16776961;
        }
        return AEQbTJ(streamPlaceHolderMessageData, i, i2);
    }

    public static final android.text.SpannableStringBuilder AEQbTJ(@NotNull StreamPlaceHolderMessageData streamPlaceHolderMessageData, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(streamPlaceHolderMessageData, "");
        return new sSV().AEQbTJ(streamPlaceHolderMessageData, i, i2);
    }
}
