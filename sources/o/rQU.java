package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class rQU extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public AbstractC43965rzI OLrzqt;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rQU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final rQU copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("realName", str), C56390yDp.OLrzqt("accountName", str2));
            rQU rqu = new rQU();
            rqu.setArguments(bundleBundleOf);
            return rqu;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC43965rzI abstractC43965rzI = (AbstractC43965rzI) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DGOPHZ, constraintLayout, true);
        this.OLrzqt = abstractC43965rzI;
        AbstractC43965rzI abstractC43965rzI2 = null;
        if (abstractC43965rzI == null) {
            Intrinsics.gEmmrt("");
            abstractC43965rzI = null;
        }
        android.widget.TextView textView = abstractC43965rzI.OLrzqt;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        AbstractC43965rzI abstractC43965rzI3 = this.OLrzqt;
        if (abstractC43965rzI3 == null) {
            Intrinsics.gEmmrt("");
            abstractC43965rzI3 = null;
        }
        android.widget.TextView textView2 = abstractC43965rzI3.EZpvd;
        textView2.setOnClickListener(new StateListAnimator(textView2, 1000L, this));
        AbstractC43965rzI abstractC43965rzI4 = this.OLrzqt;
        if (abstractC43965rzI4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43965rzI2 = abstractC43965rzI4;
        }
        android.widget.TextView textView3 = abstractC43965rzI2.AEQbTJ;
        textView3.setOnClickListener(new Activity(textView3, 1000L, this));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ rQU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rQU rqu) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = rqu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ rQU EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rQU rqu) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = rqu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.os.Bundle arguments = this.EZpvd.getArguments();
                if (arguments != null) {
                    C43693ruB.OLrzqt("KYC_MergeAccount_Login_Click");
                    rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
                    FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    java.lang.String string = arguments.getString("realName");
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String string2 = arguments.getString("accountName");
                    rsf.EZpvd(fragmentActivityRequireActivity, true, string, string2 != null ? string2 : "");
                }
                this.EZpvd.dismiss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ rQU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rQU rqu) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = rqu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.os.Bundle arguments = this.copydefault.getArguments();
                if (arguments != null) {
                    C43693ruB.OLrzqt("KYC_MergeAccount_CannotLogin_Click");
                    rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
                    FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    java.lang.String string = arguments.getString("realName");
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String string2 = arguments.getString("accountName");
                    rsf.EZpvd(fragmentActivityRequireActivity, false, string, string2 != null ? string2 : "");
                }
                this.copydefault.dismiss();
            }
        }
    }
}
