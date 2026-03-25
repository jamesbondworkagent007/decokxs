package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36410oaT extends android.text.style.MetricAffectingSpan {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static boolean KWHzl;
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C36410oaT(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.EZpvd = z;
    }

    /* JADX INFO: renamed from: o.oaT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oaT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        if (KWHzl) {
            textPaint.setFakeBoldText(true);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        if (!KWHzl || textPaint == null) {
            return;
        }
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(true);
    }
}
