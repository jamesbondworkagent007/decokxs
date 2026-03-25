package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.FileProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC55124xdy {
    public static final Application Companion = Application.EZpvd;

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String[] strArr, Function1<? super android.net.Uri, Unit> function1);

    void KWHzl(@NotNull android.content.Context context, @NotNull android.net.Uri uri, Function1<? super android.net.Uri, Unit> function1, Function1<? super java.lang.String[], Unit> function12);

    void KWHzl(@NotNull android.content.Context context, Function1<? super android.net.Uri, Unit> function1, Function1<? super java.lang.String[], Unit> function12);

    /* JADX INFO: renamed from: o.xdy$Application */
    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }

        public final InterfaceC55124xdy EZpvd(@NotNull ActivityResultCaller activityResultCaller) {
            Intrinsics.checkNotNullParameter(activityResultCaller, "");
            return new C55077xdD(activityResultCaller);
        }

        public final java.io.File KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.io.File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null && (externalCacheDir = context.getCacheDir()) == null) {
                externalCacheDir = android.os.Environment.getExternalStorageDirectory();
            }
            return new java.io.File(externalCacheDir, "image_" + java.lang.System.currentTimeMillis() + ".jpg");
        }

        public final android.net.Uri copydefault(@NotNull android.content.Context context, @NotNull java.io.File file) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(file, "");
            android.net.Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".devapp.provider", file);
            if (uriForFile == null) {
                uriForFile = android.net.Uri.fromFile(file);
            }
            Intrinsics.copydefault(uriForFile);
            return uriForFile;
        }
    }

    /* JADX INFO: renamed from: o.xdy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xdy */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void pickImage$default(InterfaceC55124xdy interfaceC55124xdy, android.content.Context context, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pickImage");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                function12 = null;
            }
            interfaceC55124xdy.KWHzl(context, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xdy */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void takePicture$default(InterfaceC55124xdy interfaceC55124xdy, android.content.Context context, android.net.Uri uri, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takePicture");
            }
            if ((i & 2) != 0) {
                Application application = InterfaceC55124xdy.Companion;
                uri = application.copydefault(context, application.KWHzl(context));
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function12 = null;
            }
            interfaceC55124xdy.KWHzl(context, uri, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xdy */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void selectFile$default(InterfaceC55124xdy interfaceC55124xdy, android.content.Context context, java.lang.String[] strArr, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectFile");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC55124xdy.EZpvd(context, strArr, function1);
        }
    }
}
