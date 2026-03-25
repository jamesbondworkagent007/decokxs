package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.eTW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18822fpf extends AbstractC52796wYr {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public Function0<Unit> EZpvd = new Function0() { // from class: o.fpl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18822fpf.OLrzqt();
        }
    };
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fpr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18822fpf.djBIcL(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.fpf$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportCloudType.values().length];
            try {
                iArr[SupportCloudType.GOOGLE_CLOUD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SupportCloudType.HUAWEI_CLOUD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportCloudType.BOTH_CLOUD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.fpf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fpf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fpf$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C18822fpf newInstance$default(Application application, java.lang.String str, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            return application.copydefault(str, function0, function1);
        }

        public final C18822fpf copydefault(@NotNull java.lang.String str, @NotNull Function0<Unit> function0, Function1<? super java.lang.Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C18822fpf c18822fpf = new C18822fpf();
            c18822fpf.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("rootWalletId", str)));
            c18822fpf.EZpvd = function0;
            c18822fpf.KWHzl = function1;
            return c18822fpf;
        }
    }

    private final java.lang.String EZpvd() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("rootWalletId")) == null) ? "" : string;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    private final SupportCloudType valueOf() {
        return (SupportCloudType) this.OLrzqt.getValue();
    }

    public static final SupportCloudType djBIcL(C18822fpf c18822fpf) {
        C15538eMa c15538eMa = C15538eMa.OLrzqt;
        android.content.Context contextRequireContext = c18822fpf.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return c15538eMa.EZpvd(contextRequireContext);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) EZpvd())) {
            return;
        }
        getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC52796wYr.setHeaderType$default(this, 0, 1, null);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.setVisibility(0);
        }
        android.widget.TextView textViewFARcdN2 = fARcdN();
        if (textViewFARcdN2 != null) {
            textViewFARcdN2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IPostMessageServiceStubProxy));
        }
        AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ() {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        android.graphics.drawable.Drawable drawableDjBIcL;
        android.graphics.drawable.Drawable drawableDjBIcL2;
        LinearLayout.LayoutParams layoutParams;
        ConstraintLayout constraintLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C55377xim c55377xim = new C55377xim(fragmentActivityRequireActivity, null, 2, null);
        int i = StateListAnimator.AEQbTJ[valueOf().ordinal()];
        if (i == 1) {
            C14392dkb c14392dkb = C14392dkb.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.lang.String strKWHzl = c14392dkb.KWHzl(contextRequireContext, 1);
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.warmup, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl)));
            strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.IPostMessageServiceDefault, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl)));
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.IPostMessageService);
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistryCallbackAndContract);
                c55377xim.setTitleText(strAYXKKw2);
                c55377xim.setDescriptionText(strAYXKKw);
                c55377xim.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.onTransact));
                drawableDjBIcL = c55377xim.djBIcL();
                if (drawableDjBIcL != null) {
                    drawableDjBIcL.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
                }
                c55377xim.setClickCallback(new Function0() { // from class: o.fpm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C18822fpf.copydefault(this.EZpvd);
                    }
                });
                FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                C55377xim c55377xim2 = new C55377xim(fragmentActivityRequireActivity2, null, 2, null);
                c55377xim2.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsServiceStubProxy));
                c55377xim2.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityCallback));
                c55377xim2.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DPhTBN));
                drawableDjBIcL2 = c55377xim2.djBIcL();
                if (drawableDjBIcL2 != null) {
                    drawableDjBIcL2.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
                }
                c55377xim2.setClickCallback(new Function0() { // from class: o.fpk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C18822fpf.valueOf(this.AEQbTJ);
                    }
                });
                arrayList.add(c55377xim);
                arrayList.add(c55377xim2);
                EZpvd(arrayList);
                C54946xaf binding = getBinding();
                ViewGroup.LayoutParams layoutParams2 = (binding != null || (constraintLayout = binding.AEQbTJ) == null) ? null : constraintLayout.getLayoutParams();
                layoutParams = !(layoutParams2 instanceof LinearLayout.LayoutParams) ? (LinearLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams == null) {
                    layoutParams.bottomMargin = C55298xhM.dp2px$default(40.0f, null, 1, null);
                    return;
                }
                return;
            }
            C14392dkb c14392dkb2 = C14392dkb.AEQbTJ;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            java.lang.String strKWHzl2 = c14392dkb2.KWHzl(contextRequireContext2, 2);
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.warmup, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl2)));
            strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.IPostMessageServiceDefault, C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", strKWHzl2)));
        }
        strAYXKKw = strCopydefault2;
        strAYXKKw2 = strCopydefault;
        c55377xim.setTitleText(strAYXKKw2);
        c55377xim.setDescriptionText(strAYXKKw);
        c55377xim.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.onTransact));
        drawableDjBIcL = c55377xim.djBIcL();
        if (drawableDjBIcL != null) {
        }
        c55377xim.setClickCallback(new Function0() { // from class: o.fpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18822fpf.copydefault(this.EZpvd);
            }
        });
        FragmentActivity fragmentActivityRequireActivity22 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity22, "");
        C55377xim c55377xim22 = new C55377xim(fragmentActivityRequireActivity22, null, 2, null);
        c55377xim22.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsServiceStubProxy));
        c55377xim22.setDescriptionText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityCallback));
        c55377xim22.setStartDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DPhTBN));
        drawableDjBIcL2 = c55377xim22.djBIcL();
        if (drawableDjBIcL2 != null) {
        }
        c55377xim22.setClickCallback(new Function0() { // from class: o.fpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18822fpf.valueOf(this.AEQbTJ);
            }
        });
        arrayList.add(c55377xim);
        arrayList.add(c55377xim22);
        EZpvd(arrayList);
        C54946xaf binding2 = getBinding();
        if (binding2 != null) {
        }
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams)) {
        }
        if (layoutParams == null) {
        }
    }

    public static final Unit copydefault(C18822fpf c18822fpf) {
        C32866mlf.onEvent$default("Onboarding_BackupNotice_Sheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18822fpf.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c18822fpf.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "cloud", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C18822fpf c18822fpf) {
        C32866mlf.onEvent$default("Onboarding_BackupNotice_Sheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18822fpf.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c18822fpf.EZpvd.invoke();
        c18822fpf.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "writing_down", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.fpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18822fpf.gEmmrt(this.OLrzqt);
            }
        });
    }

    public static final void gEmmrt(C18822fpf c18822fpf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18822fpf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        int i = StateListAnimator.AEQbTJ[valueOf().ordinal()];
        if (i == 1) {
            C15538eMa c15538eMa = C15538eMa.OLrzqt;
            java.lang.String strEZpvd = EZpvd();
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            C15538eMa.handleClickGoogleCloudBackup$default(c15538eMa, strEZpvd, (AbstractActivityC33041mov) activity, parentFragmentManager, false, this.KWHzl, this.EZpvd, 8, null);
        } else if (i == 2) {
            C15538eMa c15538eMa2 = C15538eMa.OLrzqt;
            java.lang.String strEZpvd2 = EZpvd();
            FragmentActivity activity2 = getActivity();
            Intrinsics.copydefault(activity2, "");
            androidx.fragment.app.FragmentManager parentFragmentManager2 = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
            c15538eMa2.copydefault(strEZpvd2, (AbstractActivityC33041mov) activity2, parentFragmentManager2, this.KWHzl, this.EZpvd);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eTW etwNewInstance$default = eTW.TaskDescription.newInstance$default(eTW.Companion, EZpvd(), 1, false, this.KWHzl, null, this.EZpvd, 20, null);
            FragmentActivity activity3 = getActivity();
            androidx.fragment.app.FragmentManager supportFragmentManager = activity3 != null ? activity3.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                etwNewInstance$default.show(supportFragmentManager, "SelectCloudBackupDialogFragment");
            }
        }
        dismissAllowingStateLoss();
    }
}
