package o;

import androidx.compose.material3.CalendarModelKt;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.okinc.core.util.SPUtils;
import com.okinc.im.usecase.share.CheckShareMessageAnimationUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35872oGv {
    public final CoroutineDispatcher copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C35872oGv(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oGv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.oGv$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.oGv$Activity$TaskDescription */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Activity {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.OLrzqt;
                }
                return taskDescription.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "TriggerAnimation(animationUrl=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: renamed from: o.oGv$Activity$Application */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Activity {
            public static final Application KWHzl = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2043454674;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Skip";
            }

            private Application() {
                super(null);
            }
        }
    }

    public final java.lang.Object copydefault(java.lang.String str, @NotNull Continuation<? super Activity> continuation) {
        return BuildersKt.withContext(this.copydefault, new CheckShareMessageAnimationUseCase$invoke$2(str, this, null), continuation);
    }

    public final java.lang.String AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null) {
            return map.get("animationCdnPath");
        }
        return null;
    }

    public final boolean OLrzqt() {
        java.lang.Long l = SPUtils.getLong("key_share_animation_last_played_time", 0L);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        Intrinsics.copydefault(l);
        return jCurrentTimeMillis - l.longValue() < (C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) ? SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US : CalendarModelKt.MillisecondsIn24Hours);
    }
}
