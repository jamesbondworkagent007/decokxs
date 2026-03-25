package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;

/* JADX INFO: renamed from: o.xdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55115xdp {
    public abstract ActivityResultLauncher<PickVisualMediaRequest> OLrzqt();

    public final void EZpvd() {
        EZpvd(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE);
    }

    public final void KWHzl() {
        EZpvd(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE);
    }

    public final void AEQbTJ() {
        EZpvd(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE);
    }

    public final void EZpvd(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        try {
            OLrzqt().launch(PickVisualMediaRequestKt.PickVisualMediaRequest(visualMediaType));
        } catch (java.lang.Throwable th) {
            pUU.EZpvd("exception when launch PickVisualMediaRequest: " + th.getMessage());
        }
    }
}
