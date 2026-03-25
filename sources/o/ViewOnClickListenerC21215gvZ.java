package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.biz.net.bean.ClickType;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21215gvZ extends C33005moL implements View.OnClickListener {
    public AbstractC16569emR KWHzl;
    public boolean OLrzqt;
    public ActionBar copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gvZ$ActionBar */
    public interface ActionBar {
        void copydefault(android.os.Bundle bundle);
    }

    public android.os.Bundle OLrzqt(android.os.Bundle bundle) {
        return bundle;
    }

    /* JADX INFO: renamed from: o.gvZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gvZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ViewOnClickListenerC21215gvZ copydefault(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            ViewOnClickListenerC21215gvZ viewOnClickListenerC21215gvZ = new ViewOnClickListenerC21215gvZ();
            android.os.Bundle bundle = new android.os.Bundle();
            if (num != null) {
                bundle.putInt("showType", num.intValue());
            }
            bundle.putString("title", str);
            bundle.putString("desc", str2);
            bundle.putString(Web3SecurityTrackEvent.VALUE_CONFIRM, str3);
            bundle.putString(OtpEventTracker.OTP_EVENT_VALUE_CANCEL, str4);
            viewOnClickListenerC21215gvZ.setArguments(bundle);
            return viewOnClickListenerC21215gvZ;
        }
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
        show(fragmentManager, str);
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        ActionBar actionBar;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.OLrzqt || (actionBar = this.copydefault) == null) {
            return;
        }
        actionBar.copydefault(OLrzqt(null));
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.gEmmrt);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.KWHzl = (AbstractC16569emR) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.reset, viewGroup, false);
        setCancelable(false);
        KWHzl(false);
        AbstractC16569emR abstractC16569emR = this.KWHzl;
        AbstractC16569emR abstractC16569emR2 = null;
        if (abstractC16569emR == null) {
            Intrinsics.gEmmrt("");
            abstractC16569emR = null;
        }
        abstractC16569emR.copydefault.setOnClickListener(this);
        AbstractC16569emR abstractC16569emR3 = this.KWHzl;
        if (abstractC16569emR3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16569emR3 = null;
        }
        abstractC16569emR3.KWHzl.setOnClickListener(this);
        AbstractC16569emR abstractC16569emR4 = this.KWHzl;
        if (abstractC16569emR4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16569emR4 = null;
        }
        abstractC16569emR4.AEQbTJ.setOnClickListener(this);
        android.os.Bundle arguments = getArguments();
        java.lang.Object obj = arguments != null ? arguments.get("showType") : null;
        if (Intrinsics.EZpvd(obj, (java.lang.Object) 2)) {
            AbstractC16569emR abstractC16569emR5 = this.KWHzl;
            if (abstractC16569emR5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16569emR5 = null;
            }
            android.widget.TextView textView = abstractC16569emR5.AYXKKw;
            android.os.Bundle arguments2 = getArguments();
            java.lang.String string = arguments2 != null ? arguments2.getString("title") : null;
            java.lang.String string2 = getString(C13754dXa.FragmentManager.GQzpsZgQzpsZ);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (string == null || string.length() == 0) {
                string = string2;
            }
            textView.setText(string);
            android.widget.TextView textView2 = abstractC16569emR5.OLrzqt;
            android.os.Bundle arguments3 = getArguments();
            java.lang.String string3 = arguments3 != null ? arguments3.getString("desc") : null;
            java.lang.String string4 = getString(C13754dXa.FragmentManager.zXhzOT);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            if (string3 == null || string3.length() == 0) {
                string3 = string4;
            }
            textView2.setText(string3);
            C52794wYp c52794wYp = abstractC16569emR5.copydefault;
            android.os.Bundle arguments4 = getArguments();
            java.lang.String string5 = arguments4 != null ? arguments4.getString(OtpEventTracker.OTP_EVENT_VALUE_CANCEL) : null;
            java.lang.String string6 = getString(C13754dXa.FragmentManager.zFtALg);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            if (string5 == null || string5.length() == 0) {
                string5 = string6;
            }
            c52794wYp.setText(string5);
            C52794wYp c52794wYp2 = abstractC16569emR5.AEQbTJ;
            android.os.Bundle arguments5 = getArguments();
            java.lang.String string7 = arguments5 != null ? arguments5.getString(Web3SecurityTrackEvent.VALUE_CONFIRM) : null;
            java.lang.String string8 = getString(C13754dXa.FragmentManager.pXZxY);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            if (string7 == null || string7.length() == 0) {
                string7 = string8;
            }
            c52794wYp2.setText(string7);
        } else if (Intrinsics.EZpvd(obj, (java.lang.Object) 3) || Intrinsics.EZpvd(obj, (java.lang.Object) 4)) {
            AbstractC16569emR abstractC16569emR6 = this.KWHzl;
            if (abstractC16569emR6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16569emR6 = null;
            }
            android.widget.TextView textView3 = abstractC16569emR6.AYXKKw;
            android.os.Bundle arguments6 = getArguments();
            java.lang.String string9 = arguments6 != null ? arguments6.getString("title") : null;
            java.lang.String string10 = getString(C13754dXa.FragmentManager.GcnicV);
            Intrinsics.checkNotNullExpressionValue(string10, "");
            if (string9 == null || string9.length() == 0) {
                string9 = string10;
            }
            textView3.setText(string9);
            android.widget.TextView textView4 = abstractC16569emR6.OLrzqt;
            android.os.Bundle arguments7 = getArguments();
            java.lang.String string11 = arguments7 != null ? arguments7.getString("desc") : null;
            java.lang.String string12 = getString(C13754dXa.FragmentManager.sRzUNh);
            Intrinsics.checkNotNullExpressionValue(string12, "");
            if (string11 == null || string11.length() == 0) {
                string11 = string12;
            }
            textView4.setText(string11);
            C52794wYp c52794wYp3 = abstractC16569emR6.copydefault;
            android.os.Bundle arguments8 = getArguments();
            java.lang.String string13 = arguments8 != null ? arguments8.getString(OtpEventTracker.OTP_EVENT_VALUE_CANCEL) : null;
            java.lang.String string14 = getString(C13754dXa.FragmentManager.hGuIrQ);
            Intrinsics.checkNotNullExpressionValue(string14, "");
            if (string13 == null || string13.length() == 0) {
                string13 = string14;
            }
            c52794wYp3.setText(string13);
            C52794wYp c52794wYp4 = abstractC16569emR6.AEQbTJ;
            android.os.Bundle arguments9 = getArguments();
            java.lang.String string15 = arguments9 != null ? arguments9.getString(Web3SecurityTrackEvent.VALUE_CONFIRM) : null;
            java.lang.String string16 = getString(C13754dXa.FragmentManager.inahnb);
            Intrinsics.checkNotNullExpressionValue(string16, "");
            if (string15 == null || string15.length() == 0) {
                string15 = string16;
            }
            c52794wYp4.setText(string15);
        }
        AbstractC16569emR abstractC16569emR7 = this.KWHzl;
        if (abstractC16569emR7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16569emR2 = abstractC16569emR7;
        }
        return abstractC16569emR2.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.gwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC21215gvZ.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(ViewOnClickListenerC21215gvZ viewOnClickListenerC21215gvZ) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC21215gvZ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.reset;
        if (numValueOf != null && numValueOf.intValue() == i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("clickType", ClickType.CANCEL.getValue());
            AEQbTJ(bundle);
            return;
        }
        int i2 = C13754dXa.ActionBar.DcMfJKfNUfqk;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("clickType", ClickType.CONFIRM.getValue());
            AEQbTJ(bundle2);
        } else {
            int i3 = C13754dXa.ActionBar.sbu;
            if (numValueOf != null && numValueOf.intValue() == i3) {
                close$default(this, null, 1, null);
            }
        }
    }

    public static /* synthetic */ void close$default(ViewOnClickListenerC21215gvZ viewOnClickListenerC21215gvZ, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        viewOnClickListenerC21215gvZ.AEQbTJ(bundle);
    }

    public final void AEQbTJ(android.os.Bundle bundle) {
        this.OLrzqt = true;
        ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.copydefault(OLrzqt(bundle));
        }
        dismissAllowingStateLoss();
    }
}
