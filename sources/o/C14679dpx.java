package o;

import android.content.ClipData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14679dpx implements InterfaceC14674dps {
    public final android.content.ClipboardManager AEQbTJ;

    public C14679dpx(@NotNull android.content.ClipboardManager clipboardManager) {
        Intrinsics.checkNotNullParameter(clipboardManager, "");
        this.AEQbTJ = clipboardManager;
    }

    @Override // o.InterfaceC14674dps
    public boolean KWHzl() {
        boolean zHasPrimaryClip = this.AEQbTJ.hasPrimaryClip();
        android.content.ClipDescription primaryClipDescription = this.AEQbTJ.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return zHasPrimaryClip && primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    @Override // o.InterfaceC14674dps
    public java.lang.String copydefault() {
        java.lang.CharSequence text;
        if (!KWHzl()) {
            return null;
        }
        android.content.ClipData primaryClip = this.AEQbTJ.getPrimaryClip();
        ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }
}
