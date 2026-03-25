package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C48291uMa;
import o.C51042vfZ;
import o.C51055vfm;

/* JADX INFO: renamed from: o.vfW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51039vfW {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.vfW$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vfW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ AbstractC32996moC getFragment$default(TaskDescription taskDescription, boolean z, boolean z2, android.os.Bundle bundle, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return taskDescription.copydefault(z, z2, bundle, z3);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.vfZ.Application.newInstance$default(o.vfZ$Application, boolean, boolean, boolean, int, java.lang.Object):o.vfZ */
        /* JADX DEBUG: Class process forced to load method for inline: o.vfm.Application.newInstance$default(o.vfm$Application, boolean, boolean, android.os.Bundle, boolean, int, java.lang.Object):o.vfm */
        public final AbstractC32996moC copydefault(boolean z, boolean z2, android.os.Bundle bundle, boolean z3) {
            C56058xve.Companion.copydefault().KWHzl();
            C48291uMa.StateListAnimator stateListAnimator = C48291uMa.Companion;
            if (stateListAnimator.AEQbTJ().OLrzqt()) {
                if (stateListAnimator.AEQbTJ().EZpvd()) {
                    return C51055vfm.Companion.KWHzl(z, z2, bundle, z3);
                }
                return C51042vfZ.Companion.EZpvd(z, z2, z3);
            }
            if (((InterfaceC49317umK) C43248rlh.KWHzl.AEQbTJ(InterfaceC49317umK.class)).valueOf()) {
                return C51055vfm.Application.newInstance$default(C51055vfm.Companion, z, false, bundle, z3, 2, null);
            }
            return C51042vfZ.Application.newInstance$default(C51042vfZ.Companion, z, false, z3, 2, null);
        }
    }
}
