package o;

import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uJo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48224uJo extends AbstractC43061riF {
    public static final ActionBar Companion = new ActionBar(null);
    public final int KWHzl = C7343ahz.Activity.valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.uJo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uJo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C48224uJo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C48224uJo c48224uJo = new C48224uJo();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("page_url", str);
            bundle.putString("entry_file", str2);
            bundle.putString("algo_id", str3);
            bundle.putBoolean("is_simulation", z);
            bundle.putBoolean("IsHistory", z2);
            c48224uJo.setArguments(bundle);
            return c48224uJo;
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C7343ahz.TaskDescription.OcIXYQ);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("entry_file") : null;
        return string == null ? "" : string;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("page_url")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("algo_id")) != null) {
            str = string2;
        }
        android.os.Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("is_simulation") : false;
        android.os.Bundle arguments4 = getArguments();
        return C43056riA.AEQbTJ.EZpvd("okluatradingeco", string, C56424yEw.gEmmrt(C56390yDp.OLrzqt("algoId", str), C56390yDp.OLrzqt("isSimulation", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("isHistory", java.lang.Boolean.valueOf(arguments4 != null ? arguments4.getBoolean("IsHistory") : false))));
    }
}
