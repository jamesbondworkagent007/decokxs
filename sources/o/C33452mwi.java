package o;

import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33452mwi {
    public static final Activity Companion = new Activity(null);
    public static C33452mwi EZpvd;

    public final androidx.fragment.app.Fragment copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        C33388mvX c33388mvXCopydefault = C33388mvX.Companion.copydefault(modeSwitchSourceEnum);
        c33388mvXCopydefault.show(fragmentManager);
        return c33388mvXCopydefault;
    }

    /* JADX INFO: renamed from: o.mwi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C33452mwi KWHzl() {
            C33452mwi c33452mwi = C33452mwi.EZpvd;
            if (c33452mwi == null) {
                synchronized (this) {
                    c33452mwi = C33452mwi.EZpvd;
                    if (c33452mwi == null) {
                        c33452mwi = new C33452mwi();
                        Activity activity = C33452mwi.Companion;
                        C33452mwi.EZpvd = c33452mwi;
                    }
                }
            }
            return c33452mwi;
        }
    }
}
