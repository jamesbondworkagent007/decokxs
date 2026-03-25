package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.mOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32069mOi implements android.widget.Checkable {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.mOi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mOi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        SPUtils.put("Track", java.lang.Boolean.valueOf(z), "Pandora");
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return SPUtils.getBoolean("Track", false, "Pandora");
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
