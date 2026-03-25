package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.okuser.data.User;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32971mne {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final java.util.Map<AmplitudeName, java.lang.Boolean> EZpvd;
    public final InterfaceC47278tmy OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.mne$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AmplitudeName.values().length];
            try {
                iArr[AmplitudeName.CEFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AmplitudeName.WEB3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public C32971mne(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC56387yDm<pUV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.OLrzqt = interfaceC47278tmy;
        this.copydefault = interfaceC56387yDm;
        this.EZpvd = new LinkedHashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 o.tmy)
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0009: INVOKE 
  (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:19) call: o.mnc.<init>():void type: CONSTRUCTOR)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:19)) : (r2v0 o.yDm))
 A[MD:(o.tmy, o.yDm<o.pUV>):void (m)] (LINE:17) call: o.mne.<init>(o.tmy, o.yDm):void type: THIS */
    public /* synthetic */ C32971mne(InterfaceC47278tmy interfaceC47278tmy, InterfaceC56387yDm interfaceC56387yDm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC47278tmy, (i & 2) != 0 ? C56392yDr.copydefault(new Function0() { // from class: o.mnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32971mne.OLrzqt();
            }
        }) : interfaceC56387yDm);
    }

    public static final pUV OLrzqt() {
        return new pUV("SkylabVerify", false, false, false, 14, null);
    }

    public final pUV AEQbTJ() {
        return (pUV) this.copydefault.getValue();
    }

    public static /* synthetic */ void verifySkyLab$default(C32971mne c32971mne, java.util.Map map, AmplitudeName amplitudeName, java.lang.Exception exc, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        c32971mne.KWHzl(map, amplitudeName, exc);
    }

    public final void KWHzl(java.util.Map<java.lang.String, LP> map, @NotNull AmplitudeName amplitudeName, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        java.lang.Boolean bool = this.EZpvd.get(amplitudeName);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2)) {
            return;
        }
        if (exc != null) {
            AEQbTJ().AEQbTJ("Skylab instance: " + amplitudeName + ", exception is " + exc);
            return;
        }
        if (map == null || map.isEmpty()) {
            AEQbTJ().EZpvd("Skylab instance: " + amplitudeName + ", variantMap is null or empty");
            return;
        }
        this.EZpvd.put(amplitudeName, bool2);
        LI liOLrzqt = C32905mmR.EZpvd.OLrzqt(amplitudeName);
        LF lfOLrzqt = liOLrzqt != null ? liOLrzqt.OLrzqt() : null;
        int i = StateListAnimator.AEQbTJ[amplitudeName.ordinal()];
        if (i == 1) {
            copydefault(map.size(), lfOLrzqt, amplitudeName);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(map.size(), lfOLrzqt, amplitudeName);
        }
    }

    public final void copydefault(int i, LF lf, AmplitudeName amplitudeName) {
        java.lang.String str = lf != null ? lf.ejfBZ : null;
        User userOLrzqt = this.OLrzqt.OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) tk, (java.lang.Object) str)) {
            AEQbTJ().AEQbTJ("Skylab instance: " + amplitudeName + " verify failed. okxUid:" + tk);
            return;
        }
        AEQbTJ().copydefault("Skylab instance: " + amplitudeName + ", variantMap:" + i + " verify passed.");
    }

    public final void AEQbTJ(int i, LF lf, AmplitudeName amplitudeName) {
        java.lang.String strCopydefault = xVW.copydefault();
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(lf != null ? lf.ejfBZ : null, lf != null ? lf.copydefault : null);
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strCopydefault) || !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) strCopydefault)) {
            AEQbTJ().AEQbTJ("Skylab instance: " + amplitudeName + " verify failed. " + str + ":" + strCopydefault + ":" + str2);
            return;
        }
        AEQbTJ().copydefault("Skylab instance: " + amplitudeName + ", variantMap:" + i + " verify passed.");
    }

    /* JADX INFO: renamed from: o.mne$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mne.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
