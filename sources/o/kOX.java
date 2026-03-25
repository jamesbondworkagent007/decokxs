package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kOX implements InterfaceC43234rlT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final java.util.ArrayList<InterfaceC43233rlS> OLrzqt = yDY.copydefault(kOY.copydefault, kOT.AEQbTJ, C28106kPc.OLrzqt, kOV.OLrzqt);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kOX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.ArrayList<InterfaceC43233rlS> AEQbTJ() {
            return kOX.OLrzqt;
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt == null) {
            pUU.copydefault("GrowthToolsDeepLinkHandlerV2", "error:activity=null");
            return;
        }
        if (Intrinsics.EZpvd(interfaceC43233rlS, kOY.copydefault) || Intrinsics.EZpvd(interfaceC43233rlS, kOT.AEQbTJ)) {
            ((kOE) C43251rlk.copydefault(kOE.class)).AEQbTJ(activityOLrzqt, map);
            return;
        }
        if (Intrinsics.EZpvd(interfaceC43233rlS, C28106kPc.OLrzqt) || Intrinsics.EZpvd(interfaceC43233rlS, kOV.OLrzqt)) {
            ((kOE) C43251rlk.copydefault(kOE.class)).KWHzl(activityOLrzqt, map);
            return;
        }
        C55326xho.OLrzqt("unknown metadata: " + interfaceC43233rlS);
    }
}
