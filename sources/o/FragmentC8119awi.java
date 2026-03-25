package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class FragmentC8119awi extends android.app.Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static InterfaceC8117awg KWHzl;
    public java.util.HashMap AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        java.util.HashMap map = this.AEQbTJ;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        EZpvd();
    }

    /* JADX INFO: renamed from: o.awi$TaskDescription */
    public static final class TaskDescription {
        private TaskDescription() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:19) call: o.awi.TaskDescription.<init>():void type: THIS */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void OLrzqt(@NotNull android.app.Activity activity, @NotNull InterfaceC8117awg interfaceC8117awg) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(interfaceC8117awg, "");
            FragmentC8119awi.KWHzl = interfaceC8117awg;
            activity.getFragmentManager().beginTransaction().add(new FragmentC8119awi(), activity.getLocalClassName()).commitAllowingStateLoss();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        C8116awf.KWHzl.AEQbTJ(this);
        C8130awt.OLrzqt.copydefault("PermissionFragment：requestPermission");
    }

    /* JADX INFO: renamed from: o.awi$ActionBar */
    public static final class ActionBar implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.app.Activity activity = FragmentC8119awi.this.getActivity();
            if (activity != null) {
                boolean zCopydefault = C8116awf.copydefault(activity);
                C8130awt.OLrzqt.copydefault("PermissionFragment onActivityResult: " + zCopydefault);
                InterfaceC8117awg interfaceC8117awg = FragmentC8119awi.KWHzl;
                if (interfaceC8117awg != null) {
                    interfaceC8117awg.KWHzl(zCopydefault);
                }
                FragmentC8119awi.KWHzl = null;
                FragmentC8119awi.this.getFragmentManager().beginTransaction().remove(FragmentC8119awi.this).commitAllowingStateLoss();
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == 199) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new ActionBar(), 500L);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
