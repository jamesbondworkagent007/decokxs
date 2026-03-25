package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19315fyv extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public java.lang.String AEQbTJ = "";
    public boolean KWHzl = true;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.fyv$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fyv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19315fyv OLrzqt(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C19315fyv c19315fyv = new C19315fyv();
            c19315fyv.EZpvd = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("installedAPP", str);
            c19315fyv.setArguments(bundle);
            return c19315fyv;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("installedAPP", "") : null;
        this.AEQbTJ = string;
        this.KWHzl = C33129mqd.OLrzqt((java.lang.CharSequence) string);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16480eki abstractC16480ekiOLrzqt = AbstractC16480eki.OLrzqt(getLayoutInflater(), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16480ekiOLrzqt, "");
        if (this.KWHzl) {
            if (Intrinsics.EZpvd((java.lang.Object) "com.okx.tr", (java.lang.Object) this.AEQbTJ)) {
                abstractC16480ekiOLrzqt.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QOLQEE));
                abstractC16480ekiOLrzqt.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AuCTelauCTel));
            } else {
                abstractC16480ekiOLrzqt.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AwvSrB));
                abstractC16480ekiOLrzqt.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAY));
            }
        } else {
            abstractC16480ekiOLrzqt.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gHZMYf));
            abstractC16480ekiOLrzqt.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sSMYrx));
        }
        constraintLayout.addView(abstractC16480ekiOLrzqt.getRoot());
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            if (this.KWHzl) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.wlaJM);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.zsXlph);
            }
            c52794wYpCopydefault.setText(strAYXKKw);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Activity(c52794wYpCopydefault2, 1000L, this));
        }
    }

    public final void AEQbTJ() {
        android.content.Context context = getContext();
        if (context != null) {
            ((pKD) C43248rlh.KWHzl.AEQbTJ(pKD.class)).AEQbTJ(context, "https://www.okx.com/ul/m3w2P7");
        }
    }

    /* JADX INFO: renamed from: o.fyv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C19315fyv EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19315fyv c19315fyv) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c19315fyv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismiss();
                if (this.EZpvd.KWHzl) {
                    Function1 function1 = this.EZpvd.EZpvd;
                    if (function1 != null) {
                        java.lang.String str = this.EZpvd.AEQbTJ;
                        if (str == null) {
                            str = "";
                        }
                        function1.invoke(str);
                        return;
                    }
                    return;
                }
                this.EZpvd.AEQbTJ();
            }
        }
    }
}
