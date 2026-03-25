package o;

import androidx.core.net.UriKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.im.usecase.audio.GetOrDownloadPlayAudioResultUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import o.C36517ocU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35749oCg {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final android.content.Context AEQbTJ;
    public final C36517ocU KWHzl;

    @yCM
    public C35749oCg(@NotNull C36517ocU c36517ocU, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(c36517ocU, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = c36517ocU;
        this.AEQbTJ = context;
    }

    /* JADX INFO: renamed from: o.oCg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.oCg$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final android.net.Uri AEQbTJ;
        public final C35254nrp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, C35254nrp c35254nrp, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c35254nrp = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                uri = application.AEQbTJ;
            }
            return application.copydefault(c35254nrp, uri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35254nrp AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.net.Uri KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull C35254nrp c35254nrp, @NotNull android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(uri, "");
            return new Application(c35254nrp, uri);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlayAudioResult(message=" + this.OLrzqt + ", playUri=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull C35254nrp c35254nrp, @NotNull android.net.Uri uri) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(uri, "");
            this.OLrzqt = c35254nrp;
            this.AEQbTJ = uri;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C35254nrp c35254nrp, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        GetOrDownloadPlayAudioResultUseCase$execute$1 getOrDownloadPlayAudioResultUseCase$execute$1;
        OKMessage oKMessageOLrzqt;
        C35749oCg c35749oCg;
        C35254nrp c35254nrp2 = c35254nrp;
        if (continuation instanceof GetOrDownloadPlayAudioResultUseCase$execute$1) {
            getOrDownloadPlayAudioResultUseCase$execute$1 = (GetOrDownloadPlayAudioResultUseCase$execute$1) continuation;
            int i = getOrDownloadPlayAudioResultUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrDownloadPlayAudioResultUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getOrDownloadPlayAudioResultUseCase$execute$1 = new GetOrDownloadPlayAudioResultUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = getOrDownloadPlayAudioResultUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getOrDownloadPlayAudioResultUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            oKMessageOLrzqt = c35254nrp.OLrzqt();
            pUU.KWHzl("GetOrDownloadPlayAudio", "[" + oKMessageOLrzqt.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessageOLrzqt.getSeq() + "] onPlay");
            android.net.Uri uriOLrzqt = C44169sFw.OLrzqt(oKMessageOLrzqt, this.AEQbTJ);
            java.io.File file = uriOLrzqt != null ? UriKt.toFile(uriOLrzqt) : null;
            pUU.KWHzl("GetOrDownloadPlayAudio", "[" + oKMessageOLrzqt.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessageOLrzqt.getSeq() + "] onPlay, file=" + file);
            boolean z = file != null && file.exists();
            pUU.KWHzl("GetOrDownloadPlayAudio", "[" + oKMessageOLrzqt.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessageOLrzqt.getSeq() + "] onPlay, isAudioDownloaded=" + z);
            if (file == null || !z) {
                Job jobEZpvd = this.KWHzl.EZpvd(oKMessageOLrzqt);
                getOrDownloadPlayAudioResultUseCase$execute$1.L$0 = this;
                getOrDownloadPlayAudioResultUseCase$execute$1.L$1 = c35254nrp2;
                getOrDownloadPlayAudioResultUseCase$execute$1.L$2 = oKMessageOLrzqt;
                getOrDownloadPlayAudioResultUseCase$execute$1.label = 1;
                if (jobEZpvd.join(getOrDownloadPlayAudioResultUseCase$execute$1) == objCopydefault) {
                    return objCopydefault;
                }
                c35749oCg = this;
            } else {
                pUU.KWHzl("GetOrDownloadPlayAudio", "[" + oKMessageOLrzqt.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessageOLrzqt.getSeq() + "] onPlay, download already, play now");
                return new Application(c35254nrp2, uriOLrzqt);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OKMessage oKMessage = (OKMessage) getOrDownloadPlayAudioResultUseCase$execute$1.L$2;
            C35254nrp c35254nrp3 = (C35254nrp) getOrDownloadPlayAudioResultUseCase$execute$1.L$1;
            c35749oCg = (C35749oCg) getOrDownloadPlayAudioResultUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            oKMessageOLrzqt = oKMessage;
            c35254nrp2 = c35254nrp3;
        }
        C36517ocU.StateListAnimator stateListAnimatorCopydefault = c35749oCg.KWHzl.copydefault(oKMessageOLrzqt);
        if (stateListAnimatorCopydefault != null && stateListAnimatorCopydefault.OLrzqt() == 0 && stateListAnimatorCopydefault.KWHzl() != null) {
            pUU.KWHzl("GetOrDownloadPlayAudio", "[" + oKMessageOLrzqt.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessageOLrzqt.getSeq() + "] onPlay, download success, play now");
            return new Application(c35254nrp2, stateListAnimatorCopydefault.KWHzl());
        }
        pUU.KWHzl("GetOrDownloadPlayAudio", "[" + oKMessageOLrzqt.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessageOLrzqt.getSeq() + "] onPlay, download success, cannot play no local uri");
        return null;
    }
}
