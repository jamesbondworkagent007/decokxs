package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC25645jBb;
import o.InterfaceC26243jXf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27766kCo {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.kCo$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public C27766kCo() {
    }

    public final InterfaceC26243jXf EZpvd(int i) {
        if (i == 0) {
            return InterfaceC26243jXf.Dialog.AEQbTJ;
        }
        if (i == 100) {
            return InterfaceC26243jXf.Application.EZpvd;
        }
        if (i == 10064) {
            return InterfaceC26243jXf.ActionBar.copydefault;
        }
        switch (i) {
            case 10066:
                return InterfaceC26243jXf.TaskDescription.OLrzqt;
            case 10067:
                return InterfaceC26243jXf.StateListAnimator.KWHzl;
            case 10068:
                return InterfaceC26243jXf.PendingIntent.copydefault;
            default:
                return InterfaceC26243jXf.Application.EZpvd;
        }
    }

    public final InterfaceC26243jXf AEQbTJ(@NotNull InterfaceC25645jBb interfaceC25645jBb) {
        Intrinsics.checkNotNullParameter(interfaceC25645jBb, "");
        if (interfaceC25645jBb instanceof InterfaceC25645jBb.Application) {
            return InterfaceC26243jXf.StateListAnimator.KWHzl;
        }
        if (interfaceC25645jBb instanceof InterfaceC25645jBb.StateListAnimator) {
            return InterfaceC26243jXf.ActionBar.copydefault;
        }
        if (interfaceC25645jBb instanceof InterfaceC25645jBb.TaskDescription) {
            return InterfaceC26243jXf.Application.EZpvd;
        }
        if (interfaceC25645jBb instanceof InterfaceC25645jBb.Activity) {
            return InterfaceC26243jXf.Dialog.AEQbTJ;
        }
        throw new NoWhenBranchMatchedException();
    }
}
