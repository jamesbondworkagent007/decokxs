package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.core.ok_app.modeswitch.view.ModeChipView$popupModeSelectionSheet$1$1$1;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33244msm;
import o.C33160mrH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33463mwt {
    public final java.lang.String copydefault = "ModeSwitch-Chip@" + hashCode();

    /* JADX INFO: renamed from: o.mwt$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AppModeSwitchViewSource.values().length];
            try {
                iArr[AppModeSwitchViewSource.LiteHome.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AppModeSwitchViewSource.PayHome.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AppModeSwitchViewSource.Web3Home.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AppModeSwitchViewSource.ExchangeHome.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    public final android.view.View KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.KWHzl(this.copydefault, "createChip: source=" + appModeSwitchViewSource);
        final C33299mto c33299mtoOLrzqt = C33299mto.OLrzqt(android.view.LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(c33299mtoOLrzqt, "");
        C33422mwE c33422mwE = new C33422mwE(this.copydefault);
        android.widget.TextView textView = c33299mtoOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c33422mwE.KWHzl(textView, lifecycleOwner, C33123mqX.Companion.KWHzl().AYXKKw(), new Function1() { // from class: o.mww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33463mwt.EZpvd(this.copydefault, c33299mtoOLrzqt, (AbstractC33244msm) obj);
            }
        });
        ConstraintLayout constraintLayout = c33299mtoOLrzqt.KWHzl;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this, appModeSwitchViewSource, lifecycleOwner, fragmentManager, function2));
        ConstraintLayout root = c33299mtoOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(0);
        ConstraintLayout root2 = c33299mtoOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        return root2;
    }

    public static final Unit EZpvd(C33463mwt c33463mwt, C33299mto c33299mto, AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        android.widget.TextView textView = c33299mto.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c33463mwt.copydefault(textView, abstractC33244msm);
        c33299mto.OLrzqt.setContentDescription(C33421mwD.OLrzqt(abstractC33244msm) + "_selected");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mwt$Application */
    public static final class Application implements Function2<AbstractC33244msm, AbstractC33244msm, Unit> {
        public final /* synthetic */ Function2<AbstractC33244msm, AbstractC33244msm, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.msm, ? super o.msm, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
            this.OLrzqt = function2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(AbstractC33244msm abstractC33244msm, AbstractC33244msm abstractC33244msm2) {
            OLrzqt(abstractC33244msm, abstractC33244msm2);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(AbstractC33244msm abstractC33244msm, AbstractC33244msm abstractC33244msm2) {
            Intrinsics.checkNotNullParameter(abstractC33244msm, "");
            Intrinsics.checkNotNullParameter(abstractC33244msm2, "");
            pUU.KWHzl(C33463mwt.this.copydefault, "createChip: Mode changed from " + abstractC33244msm + " to " + abstractC33244msm2);
            this.OLrzqt.invoke(abstractC33244msm, abstractC33244msm2);
        }
    }

    public final ModeSwitchSourceEnum KWHzl(AppModeSwitchViewSource appModeSwitchViewSource) {
        int i = ActionBar.OLrzqt[appModeSwitchViewSource.ordinal()];
        if (i == 1) {
            return ModeSwitchSourceEnum.LiteHome;
        }
        if (i == 2) {
            if (C33123mqX.Companion.KWHzl().fARcdN()) {
                return ModeSwitchSourceEnum.ProPayHome;
            }
            return ModeSwitchSourceEnum.LitePayHome;
        }
        if (i == 3) {
            return ModeSwitchSourceEnum.WEB3;
        }
        if (i == 4) {
            return ModeSwitchSourceEnum.ProExchangeHome;
        }
        return ModeSwitchSourceEnum.UNKNOWN;
    }

    public final void copydefault(android.widget.TextView textView, AbstractC33244msm abstractC33244msm) {
        java.lang.String strAYXKKw;
        boolean zFARcdN = C33123mqX.Companion.KWHzl().fARcdN();
        pUU.KWHzl(this.copydefault, "setupModeName: isProVersion=" + zFARcdN + ", mode=" + abstractC33244msm);
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Application.KWHzl)) {
            strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.AxsJAY);
        } else if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl)) {
            strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.AYXKKw);
        } else if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl)) {
            strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.fetchVPNInfo);
        } else if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl)) {
            strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.ejfBZ);
        } else if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl)) {
            strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.zuBGHE);
        } else {
            if (!Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
                if (!Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Dialog.KWHzl)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new java.lang.IllegalStateException("Unsupported mode: " + abstractC33244msm);
            }
            if (zFARcdN) {
                strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.AwvSrB);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C33160mrH.TaskDescription.valueOf);
            }
        }
        textView.setText(strAYXKKw);
    }

    public final androidx.fragment.app.Fragment AEQbTJ(@NotNull final LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum, @NotNull final Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            pUU.EZpvd(this.copydefault, "popupLiteSubModeChangeDialog: lifecycleOwner is destroyed, source=" + modeSwitchSourceEnum);
            return null;
        }
        final AbstractC33244msm value = C33123mqX.Companion.KWHzl().AYXKKw().getValue();
        AbstractC33469mwz abstractC33469mwzEZpvd = AbstractC33469mwz.Companion.EZpvd(modeSwitchSourceEnum);
        abstractC33469mwzEZpvd.show(fragmentManager);
        FragmentKt.setFragmentResultListener(abstractC33469mwzEZpvd, "FRAGMENT_RESULT_KEY", new Function2() { // from class: o.mwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C33463mwt.copydefault(lifecycleOwner, function2, value, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        });
        return abstractC33469mwzEZpvd;
    }

    public static final Unit copydefault(LifecycleOwner lifecycleOwner, Function2 function2, AbstractC33244msm abstractC33244msm, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("FRAGMENT_RESULT_MODE_CHANGED")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ModeChipView$popupModeSelectionSheet$1$1$1(function2, abstractC33244msm, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mwt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ androidx.fragment.app.FragmentManager AEQbTJ;
        public final /* synthetic */ Function2 EZpvd;
        public final /* synthetic */ LifecycleOwner KWHzl;
        public final /* synthetic */ AppModeSwitchViewSource OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ C33463mwt gEmmrt;
        public final /* synthetic */ long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C33463mwt c33463mwt, AppModeSwitchViewSource appModeSwitchViewSource, LifecycleOwner lifecycleOwner, androidx.fragment.app.FragmentManager fragmentManager, Function2 function2) {
            this.copydefault = view;
            this.valueOf = j;
            this.gEmmrt = c33463mwt;
            this.OLrzqt = appModeSwitchViewSource;
            this.KWHzl = lifecycleOwner;
            this.AEQbTJ = fragmentManager;
            this.EZpvd = function2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.valueOf || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                pUU.KWHzl(this.gEmmrt.copydefault, "createChip: Chip clicked, source=" + this.OLrzqt);
                C33405mvo.KWHzl.AEQbTJ(C33123mqX.Companion.KWHzl().AYXKKw().getValue().EZpvd(), this.OLrzqt.toString());
                C33463mwt c33463mwt = this.gEmmrt;
                c33463mwt.AEQbTJ(this.KWHzl, this.AEQbTJ, c33463mwt.KWHzl(this.OLrzqt), this.gEmmrt.new Application(this.EZpvd));
            }
        }
    }
}
