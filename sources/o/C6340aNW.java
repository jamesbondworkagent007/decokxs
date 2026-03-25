package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6340aNW extends AbstractC52785wYg {
    public Function0<Unit> AYXKKw;
    public Function0<Unit> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aNZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6340aNW.values(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.aOb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6340aNW.gEmmrt(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aOa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6340aNW.djBIcL(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.aOd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6340aNW.fetchVPNInfo(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aOc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C6340aNW.valueOf(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aOh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6340aNW.AhwBna(this.KWHzl);
        }
    });

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> valueOf() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.aNW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C6340aNW newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str5 = null;
            }
            return activity.EZpvd(str, str2, str3, str4, z2, str5);
        }

        public final C6340aNW EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            C6340aNW c6340aNW = new C6340aNW();
            c6340aNW.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_TITLE", str), C56390yDp.OLrzqt("KEY_DESC", str2), C56390yDp.OLrzqt("KEY_PRIMARY_BUTTON_TITLE", str3), C56390yDp.OLrzqt("KEY_SECONDARY_BUTTON_TITLE", str4), C56390yDp.OLrzqt("KEY_IS_PAY", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_DISPLAY_NAME", str5)));
            return c6340aNW;
        }
    }

    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String values(C6340aNW c6340aNW) {
        android.os.Bundle arguments = c6340aNW.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_TITLE") : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String gEmmrt(C6340aNW c6340aNW) {
        android.os.Bundle arguments = c6340aNW.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_DESC") : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String djBIcL(C6340aNW c6340aNW) {
        android.os.Bundle arguments = c6340aNW.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_PRIMARY_BUTTON_TITLE") : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String fetchVPNInfo(C6340aNW c6340aNW) {
        android.os.Bundle arguments = c6340aNW.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_SECONDARY_BUTTON_TITLE") : null;
        return string == null ? "" : string;
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean valueOf(C6340aNW c6340aNW) {
        android.os.Bundle arguments = c6340aNW.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_IS_PAY");
        }
        return false;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String AhwBna(C6340aNW c6340aNW) {
        android.os.Bundle arguments = c6340aNW.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_DISPLAY_NAME") : null;
        return string == null ? "" : string;
    }

    @Override // o.wXX
    public java.lang.Integer overrideFooterTheme() {
        return java.lang.Integer.valueOf(C52761wXj.LoaderManager.fvQaOB);
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setDividerVisibility(false);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        java.lang.CharSequence charSequenceOLrzqt;
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.FdcJU);
        c54954xan.AEQbTJ.setText(AYXKKw());
        if (copydefault()) {
            AppCompatTextView appCompatTextView = c54954xan.OLrzqt;
            android.content.Context context = getContext();
            if (context == null || (charSequenceOLrzqt = C6694aUF.AEQbTJ(C6694aUF.AEQbTJ(OLrzqt(), KWHzl(), new android.text.style.StyleSpan(1)), KWHzl(), new android.text.style.ForegroundColorSpan(ContextCompat.getColor(context, C52761wXj.Activity.Dmq)))) == null) {
                charSequenceOLrzqt = OLrzqt();
            }
            appCompatTextView.setText(charSequenceOLrzqt);
            return;
        }
        c54954xan.OLrzqt.setText(OLrzqt());
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(EZpvd());
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setStyleStability(true);
            c52794wYpCopydefault.setOKDSType(262);
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setType(7);
        wyf.setSecondaryText(AEQbTJ());
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.aOe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6340aNW.KWHzl(this.copydefault, view);
                }
            });
        }
    }

    public static final void KWHzl(C6340aNW c6340aNW, android.view.View view) {
        c6340aNW.dismissAllowingStateLoss();
        Function0<Unit> function0 = c6340aNW.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.aNW$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C6340aNW EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C6340aNW c6340aNW) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c6340aNW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
                Function0<Unit> function0ValueOf = this.EZpvd.valueOf();
                if (function0ValueOf != null) {
                    function0ValueOf.invoke();
                }
            }
        }
    }
}
