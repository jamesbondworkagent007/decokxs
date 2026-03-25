package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ViewOnClickListenerC20945gqU extends AbstractC32996moC implements View.OnClickListener {
    public AbstractC16945etW EZpvd;
    public java.lang.String KWHzl = "";
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.HJWChPRGtXKCDKRTZD;
    }

    /* JADX INFO: renamed from: o.gqU$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gqU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ViewOnClickListenerC20945gqU KWHzl(android.os.Bundle bundle) {
            ViewOnClickListenerC20945gqU viewOnClickListenerC20945gqU = new ViewOnClickListenerC20945gqU();
            viewOnClickListenerC20945gqU.setArguments(bundle);
            return viewOnClickListenerC20945gqU;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.EZpvd = (AbstractC16945etW) viewDataBindingBind;
        EZpvd();
        AEQbTJ();
        OLrzqt();
        copydefault();
        view.post(new java.lang.Runnable() { // from class: o.gqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20945gqU.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(ViewOnClickListenerC20945gqU viewOnClickListenerC20945gqU) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC20945gqU, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        android.view.Window window4;
        android.view.View decorView;
        FragmentActivity activity = getActivity();
        if (activity != null && (window4 = activity.getWindow()) != null && (decorView = window4.getDecorView()) != null) {
            decorView.setSystemUiVisibility(1792);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (window3 = activity2.getWindow()) != null) {
            window3.addFlags(Integer.MIN_VALUE);
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 != null && (window2 = activity3.getWindow()) != null) {
            window2.setStatusBarColor(0);
        }
        FragmentActivity activity4 = getActivity();
        if (activity4 == null || (window = activity4.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(0);
    }

    public final void AEQbTJ() {
        AbstractC16945etW abstractC16945etW = this.EZpvd;
        if (abstractC16945etW == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW = null;
        }
        abstractC16945etW.djBIcL.setShadowLayer(40.0f, 1.0f, 1.0f, C33070mpX.copydefault(C13754dXa.StateListAnimator.AEQbTJ));
    }

    public final void copydefault() {
        AbstractC16945etW abstractC16945etW = this.EZpvd;
        AbstractC16945etW abstractC16945etW2 = null;
        if (abstractC16945etW == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW = null;
        }
        abstractC16945etW.EZpvd.getRoot().setOnClickListener(this);
        AbstractC16945etW abstractC16945etW3 = this.EZpvd;
        if (abstractC16945etW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW3 = null;
        }
        abstractC16945etW3.KWHzl.getRoot().setOnClickListener(this);
        AbstractC16945etW abstractC16945etW4 = this.EZpvd;
        if (abstractC16945etW4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16945etW2 = abstractC16945etW4;
        }
        abstractC16945etW2.OLrzqt.getRoot().setOnClickListener(this);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        AbstractC16945etW abstractC16945etW = this.EZpvd;
        AbstractC16945etW abstractC16945etW2 = null;
        if (abstractC16945etW == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW = null;
        }
        AbstractC16783eqT abstractC16783eqT = abstractC16945etW.EZpvd;
        abstractC16783eqT.AEQbTJ.setVisibility(4);
        abstractC16783eqT.getRoot().setSelected(false);
        AbstractC16945etW abstractC16945etW3 = this.EZpvd;
        if (abstractC16945etW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW3 = null;
        }
        AbstractC16783eqT abstractC16783eqT2 = abstractC16945etW3.KWHzl;
        abstractC16783eqT2.AEQbTJ.setVisibility(4);
        abstractC16783eqT2.getRoot().setSelected(false);
        AbstractC16945etW abstractC16945etW4 = this.EZpvd;
        if (abstractC16945etW4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16945etW2 = abstractC16945etW4;
        }
        AbstractC16783eqT abstractC16783eqT3 = abstractC16945etW2.OLrzqt;
        abstractC16783eqT3.AEQbTJ.setVisibility(4);
        abstractC16783eqT3.getRoot().setSelected(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
    }

    private final void KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("wallet_id")) == null) {
            string = "";
        }
        this.KWHzl = string;
    }

    public final void EZpvd() {
        AbstractC16945etW abstractC16945etW = this.EZpvd;
        AbstractC16945etW abstractC16945etW2 = null;
        if (abstractC16945etW == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW = null;
        }
        AbstractC16783eqT abstractC16783eqT = abstractC16945etW.EZpvd;
        Intrinsics.checkNotNullExpressionValue(abstractC16783eqT, "");
        AEQbTJ(abstractC16783eqT, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAwareKtwithContextAvailable21), C13754dXa.Activity.gkJEwt);
        AbstractC16945etW abstractC16945etW3 = this.EZpvd;
        if (abstractC16945etW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW3 = null;
        }
        AbstractC16783eqT abstractC16783eqT2 = abstractC16945etW3.KWHzl;
        Intrinsics.checkNotNullExpressionValue(abstractC16783eqT2, "");
        AEQbTJ(abstractC16783eqT2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnContextAvailableListener), C13754dXa.Activity.iRxXKY);
        AbstractC16945etW abstractC16945etW4 = this.EZpvd;
        if (abstractC16945etW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16945etW4 = null;
        }
        AbstractC16783eqT abstractC16783eqT3 = abstractC16945etW4.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(abstractC16783eqT3, "");
        AEQbTJ(abstractC16783eqT3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.withContextAvailable), C13754dXa.Activity.flVtFt);
        android.content.Context context = getContext();
        if (context != null && C55296xhK.OLrzqt(context)) {
            AbstractC16945etW abstractC16945etW5 = this.EZpvd;
            if (abstractC16945etW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW5 = null;
            }
            abstractC16945etW5.EZpvd.AEQbTJ.setRotation(180.0f);
            AbstractC16945etW abstractC16945etW6 = this.EZpvd;
            if (abstractC16945etW6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW6 = null;
            }
            abstractC16945etW6.KWHzl.AEQbTJ.setRotation(180.0f);
            AbstractC16945etW abstractC16945etW7 = this.EZpvd;
            if (abstractC16945etW7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW7 = null;
            }
            abstractC16945etW7.OLrzqt.AEQbTJ.setRotation(180.0f);
        }
        AbstractC16945etW abstractC16945etW8 = this.EZpvd;
        if (abstractC16945etW8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16945etW2 = abstractC16945etW8;
        }
        AppCompatImageView appCompatImageView = abstractC16945etW2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.MultiTransferSendImage);
    }

    public final void AEQbTJ(AbstractC16783eqT abstractC16783eqT, java.lang.String str, int i) {
        abstractC16783eqT.copydefault.setImageResource(i);
        AppCompatImageView appCompatImageView = abstractC16783eqT.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.MultiTransferSendArrow);
        abstractC16783eqT.KWHzl.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.requestPostMessageChannel;
        if (numValueOf != null && numValueOf.intValue() == i) {
            AbstractC16945etW abstractC16945etW = this.EZpvd;
            if (abstractC16945etW == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW = null;
            }
            abstractC16945etW.EZpvd.getRoot().setSelected(true);
            AbstractC16945etW abstractC16945etW2 = this.EZpvd;
            if (abstractC16945etW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW2 = null;
            }
            abstractC16945etW2.EZpvd.AEQbTJ.setVisibility(0);
            C32866mlf.onEvent$default("AppMultisender_MultisenderType_TransactionsType_Select", (TrackChannel[]) null, new Function1() { // from class: o.gqW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC20945gqU.djBIcL((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C20690gle.OLrzqt.AEQbTJ((18 & 1) != 0 ? null : this, (18 & 2) != 0 ? null : null, this.KWHzl, MultiTransferMode.MODE_ONE_TO_MANY.getValue(), (18 & 16) != 0 ? null : null);
            return;
        }
        int i2 = C13754dXa.ActionBar.updateVisuals;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            AbstractC16945etW abstractC16945etW3 = this.EZpvd;
            if (abstractC16945etW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW3 = null;
            }
            abstractC16945etW3.KWHzl.getRoot().setSelected(true);
            AbstractC16945etW abstractC16945etW4 = this.EZpvd;
            if (abstractC16945etW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW4 = null;
            }
            abstractC16945etW4.KWHzl.AEQbTJ.setVisibility(0);
            C32866mlf.onEvent$default("AppMultisender_MultisenderType_TransactionsType_Select", (TrackChannel[]) null, new Function1() { // from class: o.gqV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC20945gqU.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C20690gle.OLrzqt.AEQbTJ((18 & 1) != 0 ? null : this, (18 & 2) != 0 ? null : null, this.KWHzl, MultiTransferMode.MODE_MANY_TO_ONE.getValue(), (18 & 16) != 0 ? null : null);
            return;
        }
        int i3 = C13754dXa.ActionBar.newSessionWithExtras;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            AbstractC16945etW abstractC16945etW5 = this.EZpvd;
            if (abstractC16945etW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW5 = null;
            }
            abstractC16945etW5.OLrzqt.getRoot().setSelected(true);
            AbstractC16945etW abstractC16945etW6 = this.EZpvd;
            if (abstractC16945etW6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16945etW6 = null;
            }
            abstractC16945etW6.OLrzqt.AEQbTJ.setVisibility(0);
            C32866mlf.onEvent$default("AppMultisender_MultisenderType_TransactionsType_Select", (TrackChannel[]) null, new Function1() { // from class: o.gqT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC20945gqU.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C20690gle.OLrzqt.AEQbTJ((18 & 1) != 0 ? null : this, (18 & 2) != 0 ? null : null, this.KWHzl, MultiTransferMode.MODE_MANY_TO_MANY.getValue(), (18 & 16) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("transaction_type", "one_to_many", true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("transaction_type", "many_to_one", true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("transaction_type", "many_to_many", true);
        return Unit.INSTANCE;
    }
}
