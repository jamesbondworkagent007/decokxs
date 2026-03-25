package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.okuser.data.User;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32967mna {
    public final java.util.Map<AmplitudeName, java.lang.Boolean> KWHzl;
    public final InterfaceC47278tmy OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mna$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    public C32967mna(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC56387yDm<pUV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.OLrzqt = interfaceC47278tmy;
        this.KWHzl = new LinkedHashMap();
        this.copydefault = interfaceC56387yDm;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r1v0 o.tmy)
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0009: INVOKE 
  (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:16) call: o.mmZ.<init>():void type: CONSTRUCTOR)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:16)) : (r2v0 o.yDm))
 A[MD:(o.tmy, o.yDm<o.pUV>):void (m)] (LINE:14) call: o.mna.<init>(o.tmy, o.yDm):void type: THIS */
    public /* synthetic */ C32967mna(InterfaceC47278tmy interfaceC47278tmy, InterfaceC56387yDm interfaceC56387yDm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC47278tmy, (i & 2) != 0 ? C56392yDr.copydefault(new Function0() { // from class: o.mmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32967mna.OLrzqt();
            }
        }) : interfaceC56387yDm);
    }

    public static final pUV OLrzqt() {
        return new pUV("TrackVerify", false, false, false, 14, null);
    }

    public final pUV copydefault() {
        return (pUV) this.copydefault.getValue();
    }

    public final void AEQbTJ(AmplitudeName amplitudeName, C5214Jc c5214Jc, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Boolean bool = this.KWHzl.get(amplitudeName);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2)) {
            return;
        }
        this.KWHzl.put(amplitudeName, bool2);
        if (amplitudeName == null || c5214Jc == null) {
            copydefault().AEQbTJ("Amplitude instance: null, event:" + str + ", verify failed.");
            return;
        }
        int i = StateListAnimator.copydefault[amplitudeName.ordinal()];
        if (i == 1) {
            AEQbTJ(c5214Jc, str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(c5214Jc, str);
        }
    }

    public final void OLrzqt(C5214Jc c5214Jc, java.lang.String str) {
        java.lang.String strCopydefault = xVW.copydefault();
        java.lang.String strAhwBna = c5214Jc.AhwBna();
        java.lang.String fieldNames = c5214Jc.getFieldNames();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) strAhwBna) && Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) fieldNames)) {
            copydefault().copydefault("Amplitude instance: " + AmplitudeName.WEB3 + ", event:" + str + ", verify pass");
            return;
        }
        copydefault().AEQbTJ("Amplitude instance: " + AmplitudeName.WEB3 + ", event:" + str + ", verify failed. okxDid:" + strCopydefault + ", ampDid:" + strAhwBna);
    }

    public final void AEQbTJ(C5214Jc c5214Jc, java.lang.String str) {
        User userOLrzqt = this.OLrzqt.OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk == null) {
            tk = "";
        }
        java.lang.String fieldNames = c5214Jc.getFieldNames();
        if (Intrinsics.EZpvd((java.lang.Object) tk, (java.lang.Object) (fieldNames != null ? fieldNames : ""))) {
            copydefault().copydefault("Amplitude instance: " + AmplitudeName.CEFI + ", event:" + str + ", verify pass");
            return;
        }
        copydefault().AEQbTJ("Amplitude instance: " + AmplitudeName.CEFI + ", event:" + str + ", verify failed");
    }

    /* JADX INFO: renamed from: o.mna$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mna.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
