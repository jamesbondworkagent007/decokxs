package o;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.group.CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC26243jXf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jWT extends AbstractC26242jXe {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public C23466hyk AYXKKw;
    public wYF djBIcL;

    public abstract java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation);

    public abstract java.lang.Object OLrzqt(int i, @NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation);

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    private final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("params.group_name")) == null) ? "" : string;
    }

    public final java.lang.Integer valueOf() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return java.lang.Integer.valueOf(arguments.getInt("params.group_id"));
        }
        return null;
    }

    public final TokenGroupActionType AhwBna() {
        TokenGroupActionType tokenGroupActionType;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenGroupActionType = (TokenGroupActionType) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "params.action", TokenGroupActionType.class))) == null) ? TokenGroupActionType.NEW : tokenGroupActionType;
    }

    private final InterfaceC26241jXd isConnected() {
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC26241jXd interfaceC26241jXd = parentFragment instanceof InterfaceC26241jXd ? (InterfaceC26241jXd) parentFragment : null;
        if (interfaceC26241jXd != null) {
            return interfaceC26241jXd;
        }
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC26241jXd) {
            return (InterfaceC26241jXd) activity;
        }
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jWT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
    }

    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ jWT AEQbTJ;
        public final /* synthetic */ C23466hyk EZpvd;
        public final /* synthetic */ C55001xbh OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C23466hyk c23466hyk, jWT jwt, C55001xbh c55001xbh) {
            this.EZpvd = c23466hyk;
            this.AEQbTJ = jwt;
            this.OLrzqt = c55001xbh;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C52794wYp c52794wYpCopydefault;
            C55001xbh c55001xbhAkhnZx = this.EZpvd.EZpvd.AkhnZx();
            java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
            if (strIsConnected == null) {
                strIsConnected = "";
            }
            wYF wyf = this.AEQbTJ.djBIcL;
            if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                c52794wYpCopydefault.setEnabled(C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.isConnected()) && this.AEQbTJ.OLrzqt(this.OLrzqt.isConnected()));
            }
            if (!this.AEQbTJ.OLrzqt(strIsConnected)) {
                this.EZpvd.EZpvd.setErrorText(this.AEQbTJ.KWHzl(strIsConnected));
            } else {
                this.EZpvd.EZpvd.values();
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C23466hyk.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        values();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault(true);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.djBIcL = wyf;
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getFieldNames));
            c52794wYpCopydefault.setEnabled(C33129mqd.OLrzqt((java.lang.CharSequence) KWHzl()));
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
    }

    public final void copydefault(boolean z) {
        C55001xbh c55001xbhAkhnZx;
        C23466hyk c23466hyk = this.AYXKKw;
        if (c23466hyk != null) {
            if (z) {
                c23466hyk.EZpvd.setState(1);
                if (Build.VERSION.SDK_INT >= 26 && (c55001xbhAkhnZx = c23466hyk.EZpvd.AkhnZx()) != null) {
                    c55001xbhAkhnZx.setFocusable(1);
                }
                C55001xbh c55001xbhAkhnZx2 = c23466hyk.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx2 != null) {
                    c55001xbhAkhnZx2.setFocusableInTouchMode(true);
                    c55001xbhAkhnZx2.requestFocus();
                }
                C55001xbh c55001xbhAkhnZx3 = c23466hyk.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx3 != null) {
                    c55001xbhAkhnZx3.postDelayed(new java.lang.Runnable() { // from class: o.jWX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            jWT.gEmmrt();
                        }
                    }, 200L);
                    return;
                }
                return;
            }
            c23466hyk.EZpvd.setState(0);
            C55001xbh c55001xbhAkhnZx4 = c23466hyk.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx4 != null) {
                c55001xbhAkhnZx4.clearFocus();
            }
            C33054mpH.copydefault(this);
        }
    }

    public static final void gEmmrt() {
        java.lang.Object objEZpvd = C6832aWn.EZpvd("input_method");
        Intrinsics.copydefault(objEZpvd, "");
        ((android.view.inputmethod.InputMethodManager) objEZpvd).toggleSoftInput(2, 0);
    }

    public final void copydefault(InterfaceC26243jXf interfaceC26243jXf, java.lang.String str) {
        C55008xbo c55008xbo;
        java.lang.String strCopydefault;
        C52794wYp c52794wYpCopydefault;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(InterfaceC26243jXf.Companion.KWHzl(interfaceC26243jXf));
        wYF wyf = this.djBIcL;
        if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.setEnabled(Intrinsics.EZpvd(interfaceC26243jXf, InterfaceC26243jXf.Dialog.AEQbTJ));
        }
        if (Intrinsics.EZpvd(interfaceC26243jXf, InterfaceC26243jXf.Dialog.AEQbTJ)) {
            if (AhwBna() == TokenGroupActionType.EDIT) {
                strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.INotificationSideChannel_Parcel, C56423yEv.EZpvd(C56390yDp.OLrzqt("groupName", str)));
            } else {
                strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.ITrustedWebActivityServiceStub, C56423yEv.EZpvd(C56390yDp.OLrzqt("groupName", str)));
            }
            C55326xho.toastWithSuccessfulIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
            InterfaceC26241jXd interfaceC26241jXdIsConnected = isConnected();
            if (interfaceC26241jXdIsConnected != null) {
                interfaceC26241jXdIsConnected.valueOf();
            }
            dismissAllowingStateLoss();
            return;
        }
        if (!Intrinsics.EZpvd(interfaceC26243jXf, InterfaceC26243jXf.ActionBar.copydefault) && !Intrinsics.EZpvd(interfaceC26243jXf, InterfaceC26243jXf.TaskDescription.OLrzqt)) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.RbMRq, 0, 1, (java.lang.Object) null);
            return;
        }
        C23466hyk c23466hyk = this.AYXKKw;
        if (c23466hyk == null || (c55008xbo = c23466hyk.EZpvd) == null) {
            return;
        }
        c55008xbo.setErrorText(strAYXKKw);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ jWT KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jWT jwt) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = jwt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new CommonGroupNameInputBottomSheet$onFooterCreated$1$1$1$1(this.KWHzl, null), 3, null);
            }
        }
    }

    private final void values() {
        C23466hyk c23466hyk = this.AYXKKw;
        if (c23466hyk != null) {
            c23466hyk.EZpvd.setHintText(AEQbTJ());
            C55009xbp c55009xbpFIwbmz = c23466hyk.EZpvd.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.fetchVPNInfo();
            }
            C55001xbh c55001xbhAkhnZx = c23466hyk.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.addTextChangedListener(new Application(c23466hyk, this, c55001xbhAkhnZx));
                c55001xbhAkhnZx.setText(KWHzl());
                c55001xbhAkhnZx.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.jXa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                        return jWT.EZpvd(this.EZpvd, textView, i, keyEvent);
                    }
                });
                c55001xbhAkhnZx.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jWZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        jWT.KWHzl(this.EZpvd, view, z);
                    }
                });
            }
        }
    }

    public static final boolean EZpvd(jWT jwt, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i == 6) {
            jwt.copydefault(false);
        }
        return false;
    }

    public static final void KWHzl(jWT jwt, android.view.View view, boolean z) {
        jwt.copydefault(z);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        copydefault(false);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (!OLrzqt(str)) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.getDefaultCipherSuites);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.zqaRxl);
    }

    public final boolean OLrzqt(java.lang.String str) {
        return str.codePointCount(0, str.length()) <= 30;
    }

    public java.lang.String AEQbTJ() {
        android.content.Context context = getContext();
        if (context != null) {
            return context.getString(C23274hvD.Fragment.OnBackPressedDispatcherLifecycleOnBackPressedCancellable);
        }
        return null;
    }
}
