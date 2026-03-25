package o;

import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.yos, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57782yos extends AbstractC57779yop {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57779yop
    public java.lang.String EZpvd() {
        return "push";
    }

    @Override // o.AbstractC57779yop
    public void copydefault(final OneSignal.TaskStackBuilder taskStackBuilder) {
        OneSignal.copydefault(true, new OneSignal.BroadcastReceiver() { // from class: o.yox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.onesignal.OneSignal.BroadcastReceiver
            public final void copydefault(boolean z) {
                C57782yos.copydefault(taskStackBuilder, z);
            }
        });
    }

    public static /* synthetic */ void copydefault(OneSignal.TaskStackBuilder taskStackBuilder, boolean z) {
        OneSignal.PromptActionResult promptActionResult;
        if (z) {
            promptActionResult = OneSignal.PromptActionResult.PERMISSION_GRANTED;
        } else {
            promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
        }
        taskStackBuilder.KWHzl(promptActionResult);
    }
}
