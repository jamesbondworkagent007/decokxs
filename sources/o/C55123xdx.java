package o;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55123xdx extends ActivityResultContracts.PickVisualMedia {
    public static final ActionBar Companion = new ActionBar(null);
    public static boolean OLrzqt = true;

    /* JADX INFO: renamed from: o.xdx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xdx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean AEQbTJ() {
            return C55123xdx.OLrzqt;
        }

        public final void copydefault(boolean z) {
            C55123xdx.OLrzqt = z;
        }

        public final boolean copydefault() {
            int i = Build.VERSION.SDK_INT;
            return i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        }

        public final boolean EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return AEQbTJ() && copydefault(context) != null;
        }

        public final android.content.pm.ResolveInfo copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return context.getPackageManager().resolveActivity(new android.content.Intent(ActivityResultContracts.PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
        }

        public final boolean OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return AEQbTJ() && KWHzl(context) != null;
        }

        public final android.content.pm.ResolveInfo KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return context.getPackageManager().resolveActivity(new android.content.Intent(ActivityResultContracts.PickVisualMedia.GMS_ACTION_PICK_IMAGES), 1114112);
        }

        public final java.lang.String OLrzqt(@NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
            Intrinsics.checkNotNullParameter(visualMediaType, "");
            if (visualMediaType instanceof ActivityResultContracts.PickVisualMedia.ImageOnly) {
                return "image/*";
            }
            if (visualMediaType instanceof ActivityResultContracts.PickVisualMedia.VideoOnly) {
                return "video/*";
            }
            if (visualMediaType instanceof ActivityResultContracts.PickVisualMedia.SingleMimeType) {
                return ((ActivityResultContracts.PickVisualMedia.SingleMimeType) visualMediaType).getMimeType();
            }
            if (visualMediaType instanceof ActivityResultContracts.PickVisualMedia.ImageAndVideo) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia, androidx.activity.result.contract.ActivityResultContract
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull PickVisualMediaRequest pickVisualMediaRequest) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pickVisualMediaRequest, "");
        ActionBar actionBar = Companion;
        if (actionBar.copydefault()) {
            pUU.AEQbTJ("OKPickVisualMedia: isSystemPickerAvailable");
            return super.createIntent(context, pickVisualMediaRequest);
        }
        if (actionBar.EZpvd(context)) {
            pUU.AEQbTJ("OKPickVisualMedia: isSystemFallbackPickerAvailable");
            return super.createIntent(context, pickVisualMediaRequest);
        }
        if (actionBar.OLrzqt(context)) {
            pUU.AEQbTJ("OKPickVisualMedia: isGmsPickerAvailable");
            return super.createIntent(context, pickVisualMediaRequest);
        }
        pUU.AEQbTJ("OKPickVisualMedia: ACTION_OPEN_DOCUMENT");
        android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType(actionBar.OLrzqt(pickVisualMediaRequest.getMediaType()));
        if (intent.getType() != null) {
            return intent;
        }
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
        return intent;
    }
}
