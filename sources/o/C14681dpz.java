package o;

import android.os.Build;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: renamed from: o.dpz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14681dpz {
    public static final C14681dpz OLrzqt = new C14681dpz();

    private C14681dpz() {
    }

    public final void AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) C6832aWn.EZpvd("clipboard");
            if (clipboardManager == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
            } else {
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("", ""));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ClipboardHelper", "Failed to clear clipboard", thM7380exceptionOrNullimpl);
        }
    }
}
