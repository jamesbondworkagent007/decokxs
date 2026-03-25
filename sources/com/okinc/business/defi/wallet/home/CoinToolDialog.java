package com.okinc.business.defi.wallet.home;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.business.defi.wallet.home.CoinToolDialog;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32995moB;
import o.C33070mpX;
import o.C52761wXj;
import o.C55298xhM;
import o.C55302xhQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.eUG;
import o.eUI;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinToolDialog extends C32995moB {
    public WeakReference<eUI> AYXKKw;
    public List<Application> EZpvd;
    public Function2<? super Action, ? super eUG, Unit> KWHzl;
    public Observer<Boolean> OLrzqt;
    public Function0<Unit> copydefault;
    public WeakReference<Activity> djBIcL;
    public eUG gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public interface Activity {
        void AEQbTJ(@NotNull Action action, @NotNull eUG eug);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull eUG eug) {
        Intrinsics.checkNotNullParameter(eug, "");
        this.gEmmrt = eug;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Action {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action HIDE = new Action("HIDE", 0);
        public static final Action OPEN = new Action("OPEN", 1);
        public static final Action REPORT = new Action("REPORT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Action[] $values() {
            return new Action[]{HIDE, OPEN, REPORT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public static final class Application {
        public final String AEQbTJ;
        public final Action EZpvd;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, Action action, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                action = application.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = application.KWHzl;
            }
            if ((i2 & 4) != 0) {
                str = application.AEQbTJ;
            }
            return application.KWHzl(action, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Action AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull Action action, int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(action, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(action, i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.EZpvd == application.EZpvd && this.KWHzl == application.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Res(action=" + this.EZpvd + ", id=" + this.KWHzl + ", text=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull Action action, int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(action, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = action;
            this.KWHzl = i;
            this.AEQbTJ = str;
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.CoinToolDialog.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull final Activity activity, @NotNull FragmentManager fragmentManager, @NotNull String str, int i, int i2, @NotNull String str2, boolean z, @NotNull eUG eug, eUI eui, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(eug, "");
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (fragmentFindFragmentByTag instanceof CoinToolDialog) {
                ((CoinToolDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
            }
            CoinToolDialog coinToolDialog = new CoinToolDialog();
            coinToolDialog.KWHzl = new Function2() { // from class: o.eMp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return CoinToolDialog.StateListAnimator.EZpvd(activity, (CoinToolDialog.Action) obj, (eUG) obj2);
                }
            };
            coinToolDialog.OLrzqt(eug);
            coinToolDialog.KWHzl(function0);
            coinToolDialog.KWHzl(eui);
            Bundle bundle = new Bundle();
            bundle.putInt("position_x", i);
            bundle.putInt("position_y", i2);
            bundle.putString("type", str2);
            bundle.putBoolean("needReport", z);
            coinToolDialog.setArguments(bundle);
            coinToolDialog.show(fragmentManager, str);
        }

        public static final Unit EZpvd(Activity activity, Action action, eUG eug) {
            Intrinsics.checkNotNullParameter(action, "");
            Intrinsics.checkNotNullParameter(eug, "");
            activity.AEQbTJ(action, eug);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(C13754dXa.TaskDescription.fLIjIY, (ViewGroup) null, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveDataAhwBna;
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = new Observer() { // from class: o.eMr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                CoinToolDialog.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        WeakReference<eUI> weakReference = this.AYXKKw;
        eUI eui = weakReference != null ? weakReference.get() : null;
        if (eui != null && (mutableLiveDataAhwBna = eui.AhwBna()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Observer<Boolean> observer = this.OLrzqt;
            Intrinsics.copydefault(observer);
            mutableLiveDataAhwBna.observe(viewLifecycleOwner, observer);
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("type") : null;
        Bundle arguments2 = getArguments();
        this.EZpvd = copydefault(string, arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("needReport")) : null);
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C13754dXa.ActionBar.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21);
        List<Application> list = this.EZpvd;
        if (list != null) {
            for (final Application application : list) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(C13754dXa.TaskDescription.DsL, (ViewGroup) linearLayout, false);
                ((ImageView) viewInflate.findViewById(C13754dXa.ActionBar.onConnectionFailed)).setImageResource(application.OLrzqt());
                ((TextView) viewInflate.findViewById(C13754dXa.ActionBar.onConnected)).setText(application.KWHzl());
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.eMo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        CoinToolDialog.copydefault(this.AEQbTJ, application, view2);
                    }
                });
                linearLayout.addView(viewInflate);
            }
        }
    }

    public static final void AEQbTJ(CoinToolDialog coinToolDialog, boolean z) {
        if (z && coinToolDialog.isAdded() && !coinToolDialog.isRemoving()) {
            coinToolDialog.dismiss();
        }
    }

    public static final void copydefault(CoinToolDialog coinToolDialog, Application application, View view) {
        Function2<? super Action, ? super eUG, Unit> function2;
        coinToolDialog.dismiss();
        eUG eug = coinToolDialog.gEmmrt;
        if (eug == null || (function2 = coinToolDialog.KWHzl) == null) {
            return;
        }
        function2.invoke(application.AEQbTJ(), eug);
    }

    public final List<Application> copydefault(String str, Boolean bool) {
        Application application;
        LinkedList linkedList = new LinkedList();
        if (Intrinsics.EZpvd((Object) str, (Object) "open")) {
            application = new Application(Action.OPEN, C52761wXj.TaskDescription.ODCBUN, C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnMultiWindowModeChangedListener));
        } else {
            application = new Application(Action.HIDE, C52761wXj.TaskDescription.invokespecialgBtXYZ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnPictureInPictureModeChangedListener));
        }
        linkedList.add(application);
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            linkedList.add(new Application(Action.REPORT, C52761wXj.TaskDescription.iMXFZQ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnNewIntentListener)));
        }
        return linkedList;
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        int iEZpvd;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            iEZpvd = arguments.getInt("position_x");
        } else {
            Resources resources = window.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            iEZpvd = C55302xhQ.EZpvd(resources) / 2;
        }
        Resources resources2 = window.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        int iEZpvd2 = C55302xhQ.EZpvd(resources2) - C55298xhM.dpInt$default(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, (Context) null, 1, (Object) null);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 8388659;
        }
        List<Application> list = this.EZpvd;
        int iCopydefault = 0;
        if (list != null && list.size() == 2) {
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (attributes2 != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    int i = arguments2.getInt("position_y");
                    Context context = window.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iCopydefault = (i - C55298xhM.copydefault(110.0f, context)) - C55298xhM.dpInt$default(98, (Context) null, 1, (Object) null);
                }
                attributes2.y = iCopydefault;
            }
        } else {
            WindowManager.LayoutParams attributes3 = window.getAttributes();
            if (attributes3 != null) {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    int i2 = arguments3.getInt("position_y");
                    Context context2 = window.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iCopydefault = (i2 - C55298xhM.copydefault(110.0f, context2)) - C55298xhM.dpInt$default(50, (Context) null, 1, (Object) null);
                }
                attributes3.y = iCopydefault;
            }
        }
        WindowManager.LayoutParams attributes4 = window.getAttributes();
        if (attributes4 != null) {
            if (iEZpvd < C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null)) {
                iEZpvd = C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null);
            } else if (iEZpvd > iEZpvd2) {
                iEZpvd = iEZpvd2;
            }
            attributes4.x = iEZpvd;
        }
        window.getAttributes().dimAmount = 0.0f;
        window.setAttributes(window.getAttributes());
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
        this.gEmmrt = null;
        this.OLrzqt = null;
        this.EZpvd = null;
        this.KWHzl = null;
        this.djBIcL = null;
        this.AYXKKw = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.CoinToolDialog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCallback$default(CoinToolDialog coinToolDialog, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        coinToolDialog.KWHzl((Function0<Unit>) function0);
    }

    public final void KWHzl(eUI eui) {
        this.AYXKKw = eui != null ? new WeakReference<>(eui) : null;
    }
}
