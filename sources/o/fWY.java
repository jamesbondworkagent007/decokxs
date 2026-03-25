package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.tee.status.SASwitchTipSheet$onCreateContent$2$1;
import com.okinc.business.defi.wallet.tee.status.SASwitchTipSheet$onDismiss$1;
import com.okinc.business.defi.wallet.tee.status.SASwitchTipSheet$onDismiss$2$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fWY extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C16825erI AEQbTJ;
    public boolean copydefault = true;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fWY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ fWY newInstance$default(Activity activity, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 2;
            }
            return activity.AEQbTJ(str, i);
        }

        public final fWY AEQbTJ(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("accountId", str);
            bundle.putInt("disable_reason", i);
            fWY fwy = new fWY();
            fwy.setArguments(bundle);
            return fwy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AEQbTJ() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("accountId")) == null) ? "" : string;
    }

    public final int OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("disable_reason");
        }
        return 0;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C16825erI c16825erIAEQbTJ = C16825erI.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.AEQbTJ = c16825erIAEQbTJ;
        if (c16825erIAEQbTJ != null && (c52794wYp2 = c16825erIAEQbTJ.copydefault) != null) {
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
        }
        C16825erI c16825erI = this.AEQbTJ;
        if (c16825erI != null && (c52794wYp = c16825erI.AEQbTJ) != null) {
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        }
        int iOLrzqt = OLrzqt();
        if (iOLrzqt == 2) {
            C16825erI c16825erI2 = this.AEQbTJ;
            if (c16825erI2 != null && (textView2 = c16825erI2.OLrzqt) != null) {
                textView2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSaveInstanceState));
            }
            C16825erI c16825erI3 = this.AEQbTJ;
            if (c16825erI3 == null || (textView = c16825erI3.EZpvd) == null) {
                return;
            }
            textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMultiWindowModeChanged));
            return;
        }
        if (iOLrzqt != 3) {
            C16825erI c16825erI4 = this.AEQbTJ;
            if (c16825erI4 != null && (textView6 = c16825erI4.OLrzqt) != null) {
                textView6.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSaveInstanceState));
            }
            C16825erI c16825erI5 = this.AEQbTJ;
            if (c16825erI5 == null || (textView5 = c16825erI5.EZpvd) == null) {
                return;
            }
            textView5.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onMultiWindowModeChanged));
            return;
        }
        C16825erI c16825erI6 = this.AEQbTJ;
        if (c16825erI6 != null && (textView4 = c16825erI6.OLrzqt) != null) {
            textView4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnContextAvailableListener));
        }
        C16825erI c16825erI7 = this.AEQbTJ;
        if (c16825erI7 == null || (textView3 = c16825erI7.EZpvd) == null) {
            return;
        }
        textView3.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRetainNonConfigurationInstance));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(parentFragment)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new SASwitchTipSheet$onDismiss$1(this, null), 3, null);
        }
        if (this.copydefault) {
            AbstractC14702dqT abstractC14702dqTKWHzl = C14703dqU.Companion.KWHzl();
            abstractC14702dqTKWHzl.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda2));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC14702dqTKWHzl), null, null, new SASwitchTipSheet$onDismiss$2$1(abstractC14702dqTKWHzl, null), 3, null);
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            abstractC14702dqTKWHzl.show(parentFragmentManager, "DefiCreateWalletLoadingDFragment");
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ fWY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fWY fwy) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = fwy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ fWY AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fWY fwy) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = fwy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new SASwitchTipSheet$onCreateContent$2$1(this.AEQbTJ, null), 3, null);
            }
        }
    }
}
