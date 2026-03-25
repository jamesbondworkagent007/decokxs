package com.okinc.business.market.market.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32995moB;
import o.C33052mpF;
import o.C33070mpX;
import o.C43035rhg;
import o.C52761wXj;
import o.C55608xnE;
import o.C56390yDp;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.qZH;
import o.rVN;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketToolDialog extends C32995moB {
    public static final Application[] AEQbTJ;
    public static final Activity Companion = new Activity(null);
    public static final Application[] EZpvd;
    public static final Application[] KWHzl;
    public static final Application[] OLrzqt;

    public interface TaskDescription {
        void OLrzqt(@NotNull Action action);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Action {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action STAR = new Action("STAR", 0);
        public static final Action TOP = new Action("TOP", 1);
        public static final Action ALERT = new Action("ALERT", 2);
        public static final Action EDIT = new Action("EDIT", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Action[] $values() {
            return new Action[]{STAR, TOP, ALERT, EDIT};
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
        public final int AEQbTJ;
        public final Action OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, Action action, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                action = application.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = application.AEQbTJ;
            }
            return application.copydefault(action, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Action AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull Action action, int i) {
            Intrinsics.checkNotNullParameter(action, "");
            return new Application(action, i);
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
            return this.OLrzqt == application.OLrzqt && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Res(action=" + this.OLrzqt + ", id=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull Action action, int i) {
            Intrinsics.checkNotNullParameter(action, "");
            this.OLrzqt = action;
            this.AEQbTJ = i;
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.market.dialog.MarketToolDialog.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final Application[] EZpvd() {
            return MarketToolDialog.EZpvd;
        }

        public final Application[] KWHzl() {
            return MarketToolDialog.AEQbTJ;
        }

        public final void copydefault(@NotNull Fragment fragment, @NotNull String str, int i, boolean z, @NotNull String str2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            MarketToolDialog marketToolDialog = new MarketToolDialog();
            marketToolDialog.setTargetFragment(fragment, 0);
            Bundle bundle = new Bundle();
            bundle.putInt("position", i);
            bundle.putBoolean("watch", z);
            bundle.putString("type", str2);
            bundle.putBoolean("isAlert", z2);
            bundle.putBoolean("isForceFragmentListener", z3);
            marketToolDialog.setArguments(bundle);
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            marketToolDialog.show(parentFragmentManager, str);
        }

        public final void AEQbTJ(int i, @NotNull Application[] applicationArr, @NotNull LinearLayout linearLayout) {
            ViewGroup.LayoutParams layoutParams;
            Intrinsics.checkNotNullParameter(applicationArr, "");
            Intrinsics.checkNotNullParameter(linearLayout, "");
            for (Application application : applicationArr) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iEZpvd = C33052mpF.EZpvd(40.0f, context);
                Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iEZpvd, C33052mpF.EZpvd(40.0f, context2));
                ImageView imageView = new ImageView(linearLayout.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(application.KWHzl());
                if (application.AEQbTJ() == Action.ALERT) {
                    imageView.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.dzkkkq));
                }
                linearLayout.addView(imageView, layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i;
                layoutParams = marginLayoutParams;
            } else {
                layoutParams = linearLayout.getLayoutParams();
            }
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    static {
        Action action = Action.STAR;
        Application application = new Application(action, C52761wXj.TaskDescription.QezThh);
        Action action2 = Action.ALERT;
        Application application2 = new Application(action2, C52761wXj.TaskDescription.UeEOUB);
        Action action3 = Action.EDIT;
        EZpvd = new Application[]{application, application2, new Application(action3, qZH.Activity.values)};
        AEQbTJ = new Application[]{new Application(action, C52761wXj.TaskDescription.QezThh), new Application(action3, qZH.Activity.values)};
        KWHzl = new Application[]{new Application(action, C52761wXj.TaskDescription.QezThh), new Application(action2, C52761wXj.TaskDescription.UeEOUB)};
        OLrzqt = new Application[]{new Application(action, C52761wXj.TaskDescription.QezThh)};
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(qZH.ActionBar.aeJQwa, (ViewGroup) null, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Application[] applicationArr;
        Intrinsics.checkNotNullParameter(view, "");
        Bundle arguments = getArguments();
        String str = null;
        Boolean boolValueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("watch")) : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("type") : null;
        Bundle arguments3 = getArguments();
        int i = 0;
        Boolean boolValueOf2 = arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("isAlert", false)) : null;
        Bundle arguments4 = getArguments();
        final boolean z = arguments4 != null ? arguments4.getBoolean("isForceFragmentListener", false) : false;
        boolean z2 = true;
        if (string != null) {
            switch (string.hashCode()) {
                case -1504533603:
                    applicationArr = !string.equals("discover_ranking_list") ? AEQbTJ : OLrzqt;
                    break;
                case -358686168:
                    if (!string.equals("option_list")) {
                    }
                    break;
                case -100119026:
                    if (string.equals("watch_list")) {
                        applicationArr = !C55608xnE.isLogin$default(null, 1, null) ? KWHzl : EZpvd;
                        break;
                    }
                    break;
                case 285219521:
                    if (string.equals("market_list")) {
                        applicationArr = KWHzl;
                        break;
                    }
                    break;
            }
        }
        Boolean bool = Boolean.TRUE;
        applicationArr[0] = Intrinsics.EZpvd(boolValueOf, bool) ? new Application(Action.STAR, C52761wXj.TaskDescription.QezThh) : new Application(Action.STAR, C43035rhg.ActionBar.copydefault);
        if (applicationArr.length >= 2) {
            Application application = (Application) yDV.gEmmrt(applicationArr, 1);
            Action actionAEQbTJ = application != null ? application.AEQbTJ() : null;
            Action action = Action.ALERT;
            if (actionAEQbTJ == action) {
                applicationArr[1] = Intrinsics.EZpvd(boolValueOf2, bool) ? new Application(action, C52761wXj.TaskDescription.djSkpj) : new Application(action, C52761wXj.TaskDescription.UeEOUB);
            }
        }
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(qZH.StateListAnimator.TarCU);
        int length = applicationArr.length;
        while (i < length) {
            final Application application2 = applicationArr[i];
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = C33052mpF.EZpvd(40.0f, context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iEZpvd, C33052mpF.EZpvd(40.0f, context2));
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(application2.KWHzl());
            Action actionAEQbTJ2 = application2.AEQbTJ();
            Action action2 = Action.ALERT;
            if (actionAEQbTJ2 == action2 && Intrinsics.EZpvd(boolValueOf2, Boolean.FALSE)) {
                imageView.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.dzkkkq));
            } else if (application2.AEQbTJ() == action2 && Intrinsics.EZpvd(boolValueOf2, Boolean.TRUE)) {
                imageView.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.gdmIOq));
            }
            Action actionAEQbTJ3 = application2.AEQbTJ();
            Action action3 = Action.STAR;
            if (actionAEQbTJ3 == action3 && Intrinsics.EZpvd(boolValueOf, Boolean.FALSE)) {
                imageView.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.dzkkkq));
            } else if (application2.AEQbTJ() == action3 && Intrinsics.EZpvd(boolValueOf, Boolean.TRUE)) {
                imageView.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.gdmIOq));
            }
            linearLayout.addView(imageView, layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.kFT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    MarketToolDialog.copydefault(this.EZpvd, application2, z, view2);
                }
            });
            i++;
            str = null;
            z2 = true;
        }
        String str2 = str;
        rVN.reportFullyDrawn$default(this, z2, str2, 2, str2);
    }

    public static final void copydefault(MarketToolDialog marketToolDialog, Application application, boolean z, View view) {
        marketToolDialog.dismissAllowingStateLoss();
        if (marketToolDialog.getTargetFragment() instanceof TaskDescription) {
            ActivityResultCaller targetFragment = marketToolDialog.getTargetFragment();
            Intrinsics.copydefault(targetFragment, "");
            ((TaskDescription) targetFragment).OLrzqt(application.AEQbTJ());
            if (z) {
                String name = MarketToolDialog.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                FragmentKt.setFragmentResult(marketToolDialog, name, BundleKt.bundleOf(C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, Integer.valueOf(application.AEQbTJ().ordinal()))));
                return;
            }
            return;
        }
        String name2 = MarketToolDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        FragmentKt.setFragmentResult(marketToolDialog, name2, BundleKt.bundleOf(C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, Integer.valueOf(application.AEQbTJ().ordinal()))));
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
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 49;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        if (attributes2 != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i = arguments.getInt("position");
                Context context = window.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iEZpvd = i - C33052mpF.EZpvd(110.0f, context);
            } else {
                iEZpvd = 0;
            }
            attributes2.y = iEZpvd;
        }
        window.getAttributes().dimAmount = 0.0f;
        window.setAttributes(window.getAttributes());
    }
}
