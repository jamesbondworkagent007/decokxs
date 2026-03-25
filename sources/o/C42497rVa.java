package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42497rVa extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C34739niD AEQbTJ;
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.copydefault;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.95f;
    }

    public C42497rVa(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX INFO: renamed from: o.rVa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rVa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C42497rVa EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("mock_fr_key", str), C56390yDp.OLrzqt("mock_fr_title", str2));
            C42497rVa c42497rVa = new C42497rVa(function0);
            c42497rVa.setArguments(bundleBundleOf);
            return c42497rVa;
        }
    }

    public final C34739niD KWHzl() {
        C34739niD c34739niD = this.AEQbTJ;
        Intrinsics.copydefault(c34739niD);
        return c34739niD;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(9);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("mock_fr_title")) != null) {
            c52781wYc.setTitle(string);
        }
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new Application(imageViewOLrzqt, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.AEQbTJ = C34739niD.copydefault(getLayoutInflater(), constraintLayout, false);
        constraintLayout.addView(KWHzl().getRoot());
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("mock_fr_key")) != null) {
            AKL aklKWHzl = rUO.OLrzqt.KWHzl(string);
            KWHzl().KWHzl.setText(C33129mqd.gEmmrt(aklKWHzl.KWHzl()));
            KWHzl().EZpvd.setText(aklKWHzl.OLrzqt());
            KWHzl().OLrzqt.setText(aklKWHzl.EZpvd());
            KWHzl().AhwBna.setText(C33129mqd.gEmmrt(java.lang.Boolean.valueOf(aklKWHzl.AEQbTJ())));
            KWHzl().AYXKKw.setText(C33129mqd.gEmmrt(aklKWHzl.gEmmrt()));
            KWHzl().values.setText(aklKWHzl.AkhnZx());
            KWHzl().fetchVPNInfo.setText(aklKWHzl.djBIcL());
            KWHzl().AkhnZx.setText(C33129mqd.gEmmrt(aklKWHzl.valueOf()));
            KWHzl().DbNXlk.setText(C33129mqd.gEmmrt(java.lang.Boolean.valueOf(aklKWHzl.values())));
            KWHzl().djBIcL.setText(C33129mqd.gEmmrt(java.lang.Boolean.valueOf(aklKWHzl.AhwBna())));
            java.util.List<java.lang.String> listAYXKKw = aklKWHzl.AYXKKw();
            java.lang.String str = listAYXKKw.isEmpty() ^ true ? listAYXKKw.get(0) : "";
            int size = listAYXKKw.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    str = ((java.lang.Object) str) + "," + ((java.lang.Object) listAYXKKw.get(i));
                }
            }
            KWHzl().gEmmrt.setText(str);
        }
        C52794wYp c52794wYp = KWHzl().AEQbTJ;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.rVa$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C42497rVa KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42497rVa c42497rVa) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c42497rVa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List listAhwBna;
            android.text.Editable text;
            java.lang.String string;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C55001xbh c55001xbhAkhnZx = this.KWHzl.KWHzl().KWHzl.AkhnZx();
                int iAhwBna = C33129mqd.AhwBna(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null);
                C55001xbh c55001xbhAkhnZx2 = this.KWHzl.KWHzl().EZpvd.AkhnZx();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(c55001xbhAkhnZx2 != null ? c55001xbhAkhnZx2.getText() : null);
                C55001xbh c55001xbhAkhnZx3 = this.KWHzl.KWHzl().OLrzqt.AkhnZx();
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c55001xbhAkhnZx3 != null ? c55001xbhAkhnZx3.getText() : null);
                C55001xbh c55001xbhAkhnZx4 = this.KWHzl.KWHzl().AhwBna.AkhnZx();
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) C33129mqd.gEmmrt(c55001xbhAkhnZx4 != null ? c55001xbhAkhnZx4.getText() : null), (java.lang.Object) "true");
                C55001xbh c55001xbhAkhnZx5 = this.KWHzl.KWHzl().AYXKKw.AkhnZx();
                int iAhwBna2 = C33129mqd.AhwBna(c55001xbhAkhnZx5 != null ? c55001xbhAkhnZx5.getText() : null);
                C55001xbh c55001xbhAkhnZx6 = this.KWHzl.KWHzl().values.AkhnZx();
                java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(c55001xbhAkhnZx6 != null ? c55001xbhAkhnZx6.getText() : null);
                C55001xbh c55001xbhAkhnZx7 = this.KWHzl.KWHzl().fetchVPNInfo.AkhnZx();
                java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(c55001xbhAkhnZx7 != null ? c55001xbhAkhnZx7.getText() : null);
                C55001xbh c55001xbhAkhnZx8 = this.KWHzl.KWHzl().AkhnZx.AkhnZx();
                int iAhwBna3 = C33129mqd.AhwBna(c55001xbhAkhnZx8 != null ? c55001xbhAkhnZx8.getText() : null);
                C55001xbh c55001xbhAkhnZx9 = this.KWHzl.KWHzl().DbNXlk.AkhnZx();
                boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) C33129mqd.gEmmrt(c55001xbhAkhnZx9 != null ? c55001xbhAkhnZx9.getText() : null), (java.lang.Object) "true");
                C55001xbh c55001xbhAkhnZx10 = this.KWHzl.KWHzl().djBIcL.AkhnZx();
                boolean zEZpvd3 = Intrinsics.EZpvd((java.lang.Object) C33129mqd.gEmmrt(c55001xbhAkhnZx10 != null ? c55001xbhAkhnZx10.getText() : null), (java.lang.Object) "true");
                C55001xbh c55001xbhAkhnZx11 = this.KWHzl.KWHzl().gEmmrt.AkhnZx();
                if (c55001xbhAkhnZx11 == null || (text = c55001xbhAkhnZx11.getText()) == null || (string = text.toString()) == null || (listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) string, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                AKL akl = new AKL(zEZpvd3, strGEmmrt, strGEmmrt2, strGEmmrt4, strGEmmrt3, java.lang.Integer.valueOf(iAhwBna2), java.lang.Integer.valueOf(iAhwBna3), zEZpvd, zEZpvd2, "NO_FEATURE", java.lang.Integer.valueOf(iAhwBna), listAhwBna);
                rUO ruo = rUO.OLrzqt;
                android.os.Bundle arguments = this.KWHzl.getArguments();
                java.lang.String string2 = arguments != null ? arguments.getString("mock_fr_title") : null;
                Intrinsics.copydefault((java.lang.Object) string2);
                ruo.copydefault(string2, akl);
                this.KWHzl.OLrzqt().invoke();
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.rVa$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C42497rVa KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42497rVa c42497rVa) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c42497rVa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
