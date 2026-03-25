package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.drivers.bean.SupportCloudType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eTW extends AbstractC52796wYr {
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public Function1<? super java.lang.Integer, Unit> OLrzqt;
    public Function0<Unit> copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eTW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eTW$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ eTW newInstance$default(TaskDescription taskDescription, java.lang.String str, int i, boolean z, Function1 function1, Function1 function12, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return taskDescription.EZpvd(str, i, z, (i2 & 8) != 0 ? null : function1, (i2 & 16) != 0 ? null : function12, function0);
        }

        public final eTW EZpvd(@NotNull java.lang.String str, int i, boolean z, Function1<? super java.lang.Integer, Unit> function1, Function1<? super java.lang.Integer, Unit> function12, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            eTW etw = new eTW();
            etw.copydefault = function0;
            etw.OLrzqt = function1;
            etw.KWHzl = function12;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rootWalletId", str);
            bundle.putInt("generateType", i);
            bundle.putBoolean("isShowManualBtn", z);
            etw.setArguments(bundle);
            return etw;
        }
    }

    private final java.lang.String AEQbTJ() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("rootWalletId")) == null) ? "" : string;
    }

    public final boolean EZpvd() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isShowManualBtn");
        }
        return true;
    }

    public final int KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("generateType");
        }
        return 1;
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.setVisibility(0);
        }
        android.widget.TextView textViewFARcdN2 = fARcdN();
        if (textViewFARcdN2 != null) {
            textViewFARcdN2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallbackCallbackHandler));
        }
        android.widget.TextView textViewFARcdN3 = fARcdN();
        if (textViewFARcdN3 != null) {
            textViewFARcdN3.setTypeface(ResourcesCompat.getFont(requireContext(), C52761wXj.Dialog.EZpvd));
        }
        OLrzqt();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.eUe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eTW.fIwbmz(this.AEQbTJ);
                }
            });
        }
    }

    public static final void fIwbmz(eTW etw) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) etw, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.AEQbTJ);
    }

    private final void OLrzqt() {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        ConstraintLayout constraintLayout;
        int i = 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        byte b = 0;
        byte b2 = 0;
        C55377xim c55377xim = new C55377xim(fragmentActivityRequireActivity, null, i, 0 == true ? 1 : 0);
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        c55377xim.setStartDrawable(c14392dkb.OLrzqt(1));
        if (KWHzl() == 1) {
            strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setQueueTitle);
        } else {
            int i2 = C13754dXa.FragmentManager.dispatchResult;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            strCopydefault = C33069mpW.copydefault(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("cloud", c14392dkb.KWHzl(contextRequireContext, 1))));
        }
        c55377xim.setTitleText(strCopydefault);
        c55377xim.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DzkRMH));
        android.graphics.drawable.Drawable drawableAEQbTJ = c55377xim.AEQbTJ();
        if (drawableAEQbTJ != null) {
            drawableAEQbTJ.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        c55377xim.setClickCallback(new Function0() { // from class: o.eTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eTW.values(this.OLrzqt);
            }
        });
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        C55377xim c55377xim2 = new C55377xim(fragmentActivityRequireActivity2, b2 == true ? 1 : 0, i, b == true ? 1 : 0);
        c55377xim2.setStartDrawable(c14392dkb.OLrzqt(2));
        if (KWHzl() == 1) {
            strCopydefault2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPlaybackToLocal);
        } else {
            int i3 = C13754dXa.FragmentManager.dispatchResult;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            strCopydefault2 = C33069mpW.copydefault(this, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("cloud", c14392dkb.KWHzl(contextRequireContext2, 2))));
        }
        c55377xim2.setTitleText(strCopydefault2);
        c55377xim2.setEndDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DzkRMH));
        android.graphics.drawable.Drawable drawableAEQbTJ2 = c55377xim2.AEQbTJ();
        if (drawableAEQbTJ2 != null) {
            drawableAEQbTJ2.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        c55377xim2.setClickCallback(new Function0() { // from class: o.eUb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eTW.AYXKKw(this.AEQbTJ);
            }
        });
        C15538eMa c15538eMa = C15538eMa.OLrzqt;
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        int i4 = Application.EZpvd[c15538eMa.EZpvd(contextRequireContext3).ordinal()];
        if (i4 == 1) {
            arrayList.add(c55377xim);
        } else if (i4 == 2) {
            arrayList.add(c55377xim2);
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(c55377xim);
            arrayList.add(c55377xim2);
        }
        C54946xaf binding = getBinding();
        ViewGroup.LayoutParams layoutParams = (binding == null || (constraintLayout = binding.AEQbTJ) == null) ? null : constraintLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = C55298xhM.dp2px$default(20.0f, null, 1, null);
        }
        EZpvd(arrayList);
    }

    public static final Unit values(final eTW etw) {
        C32866mlf.onEvent$default("Web3Onboarding_SelectCloudServer_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.eUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eTW.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (etw.KWHzl() == 1) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) etw.AEQbTJ())) {
                FragmentActivity activity = etw.getActivity();
                if ((activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null) != null) {
                    C15538eMa c15538eMa = C15538eMa.OLrzqt;
                    java.lang.String strAEQbTJ = etw.AEQbTJ();
                    FragmentActivity activity2 = etw.getActivity();
                    Intrinsics.copydefault(activity2, "");
                    androidx.fragment.app.FragmentManager parentFragmentManager = etw.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    c15538eMa.KWHzl(strAEQbTJ, (AbstractActivityC33041mov) activity2, parentFragmentManager, etw.EZpvd(), new Function1() { // from class: o.eUf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return eTW.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue());
                        }
                    }, new Function0() { // from class: o.eUg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return eTW.DbNXlk(this.OLrzqt);
                        }
                    });
                }
            }
        } else {
            FragmentActivity fragmentActivityRequireActivity = etw.requireActivity();
            final AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
            if (abstractActivityC33041mov != null) {
                C15538eMa.OLrzqt.OLrzqt(abstractActivityC33041mov, new Function0() { // from class: o.eUc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return eTW.EZpvd(abstractActivityC33041mov, etw);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("is_float_window", "no", false));
        eventParamsList.add(new EventParam("backup_server", "google", false));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(eTW etw, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = etw.OLrzqt;
        if (function1 != null) {
            function1.invoke(1);
        }
        etw.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(eTW etw) {
        Function0<Unit> function0 = etw.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        etw.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, eTW etw) {
        abstractActivityC33041mov.dismissLoading();
        Function1<? super java.lang.Integer, Unit> function1 = etw.KWHzl;
        if (function1 != null) {
            function1.invoke(1);
        }
        etw.djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mlf.onEvent$default(java.lang.String, com.okinc.components.track.TrackChannel[], kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static final Unit AYXKKw(final eTW etw) {
        C32866mlf.onEvent$default("Web3Onboarding_SelectCloudServer_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.eTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eTW.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (etw.KWHzl() == 1) {
            C15538eMa c15538eMa = C15538eMa.OLrzqt;
            java.lang.String strAEQbTJ = etw.AEQbTJ();
            FragmentActivity activity = etw.getActivity();
            Intrinsics.copydefault(activity, "");
            androidx.fragment.app.FragmentManager parentFragmentManager = etw.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c15538eMa.copydefault(strAEQbTJ, (AbstractActivityC33041mov) activity, parentFragmentManager, new Function1() { // from class: o.eTV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eTW.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            }, new Function0() { // from class: o.eTZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eTW.AhwBna(this.KWHzl);
                }
            });
        } else {
            C15538eMa c15538eMa2 = C15538eMa.OLrzqt;
            FragmentActivity activity2 = etw.getActivity();
            Intrinsics.copydefault(activity2, "");
            c15538eMa2.EZpvd((AbstractActivityC33041mov) activity2, new Function0() { // from class: o.eTY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eTW.isConnected(this.KWHzl);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("is_float_window", "no", false));
        eventParamsList.add(new EventParam("backup_server", MTPushConstants.Manufacturer.HUAWEI, false));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(eTW etw, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = etw.OLrzqt;
        if (function1 != null) {
            function1.invoke(2);
        }
        etw.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(eTW etw) {
        Function0<Unit> function0 = etw.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        etw.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(eTW etw) {
        etw.copydefault();
        Function1<? super java.lang.Integer, Unit> function1 = etw.KWHzl;
        if (function1 != null) {
            function1.invoke(2);
        }
        etw.djBIcL();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
    }

    private final void djBIcL() {
        if (fARcdN() == null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.eUj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eTW.fetchVPNInfo(this.EZpvd);
                }
            });
            return;
        }
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.post(new java.lang.Runnable() { // from class: o.eUa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    eTW.AkhnZx(this.copydefault);
                }
            });
        }
    }

    public static final void fetchVPNInfo(eTW etw) {
        if (etw.isAdded()) {
            etw.dismissAllowingStateLoss();
        }
    }

    public static final void AkhnZx(eTW etw) {
        if (etw.isAdded()) {
            etw.dismissAllowingStateLoss();
        }
    }
}
