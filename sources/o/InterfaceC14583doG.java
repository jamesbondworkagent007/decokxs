package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.doG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC14583doG extends InterfaceC14776dro {

    /* JADX INFO: renamed from: o.doG$Activity */
    public static final class Activity implements InterfaceC14583doG {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SeedPhraseOrPrivateKey";
        }

        private Activity() {
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.setPlaybackState);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.setQueue);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.OmPrLP);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
            }
            return drawable;
        }
    }

    /* JADX INFO: renamed from: o.doG$ActionBar */
    public static final class ActionBar implements InterfaceC14583doG {
        public static final ActionBar KWHzl = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SeedPhraseOrPrivateKey";
        }

        private ActionBar() {
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.onStop);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.onFastForward);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.OmPrLP);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
            }
            return drawable;
        }
    }

    /* JADX INFO: renamed from: o.doG$Application */
    public static final class Application implements InterfaceC14583doG {
        public static final Application KWHzl = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MPCWallet";
        }

        private Application() {
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.onSkipToPrevious);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.onPause);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.OFnBcz);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
            }
            return drawable;
        }
    }

    /* JADX INFO: renamed from: o.doG$TaskDescription */
    public static final class TaskDescription implements InterfaceC14583doG {
        public final SupportCloudType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, SupportCloudType supportCloudType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                supportCloudType = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(supportCloudType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SupportCloudType OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull SupportCloudType supportCloudType) {
            Intrinsics.checkNotNullParameter(supportCloudType, "");
            return new TaskDescription(supportCloudType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.copydefault == ((TaskDescription) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CloudBackup";
        }

        public TaskDescription(@NotNull SupportCloudType supportCloudType) {
            Intrinsics.checkNotNullParameter(supportCloudType, "");
            this.copydefault = supportCloudType;
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.MediaSessionCompat2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.onPlay);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.aJFbMH);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
            }
            return drawable;
        }
    }

    /* JADX INFO: renamed from: o.doG$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC14583doG {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HardwareWallet";
        }

        private StateListAnimator() {
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.onRemoveQueueItem);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public java.lang.String AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.lang.String string = context.getString(C13754dXa.FragmentManager.MediaSessionCompat1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.InterfaceC14776dro
        public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.fbC);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
            }
            return drawable;
        }
    }
}
