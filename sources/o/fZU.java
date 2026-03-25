package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DescItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ImageItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.RiskPopupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fZU extends androidx.fragment.app.Fragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public AbstractC16879esJ copydefault;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fZU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final fZU copydefault(@NotNull RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem) {
            Intrinsics.checkNotNullParameter(riskPopupInfoItem, "");
            fZU fzu = new fZU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("pop_up_info", riskPopupInfoItem);
            fzu.setArguments(bundle);
            return fzu;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16879esJ abstractC16879esJOLrzqt = AbstractC16879esJ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16879esJOLrzqt, "");
        this.copydefault = abstractC16879esJOLrzqt;
        android.view.View root = abstractC16879esJOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        RiskPopupInfo.RiskPopupInfoItem riskPopupInfoItem;
        RecyclerView recyclerView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String text;
        DescItem desc;
        android.widget.TextView textView3;
        java.lang.String title;
        ImageItem image;
        AbstractC16879esJ abstractC16879esJ;
        AppCompatImageView appCompatImageView;
        android.os.Parcelable parcelable;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.fZR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fZU.EZpvd((OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        KeyEventDispatcher.Component activity2 = getActivity();
        InterfaceC57493yjU interfaceC57493yjU = activity2 instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity2 : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.OLrzqt();
        }
        KeyEventDispatcher.Component activity3 = getActivity();
        InterfaceC57493yjU interfaceC57493yjU2 = activity3 instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity3 : null;
        if (interfaceC57493yjU2 != null) {
            interfaceC57493yjU2.djBIcL();
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (android.os.Parcelable) arguments.getParcelable("pop_up_info", RiskPopupInfo.RiskPopupInfoItem.class);
            } else {
                parcelable = arguments.getParcelable("pop_up_info");
            }
            riskPopupInfoItem = (RiskPopupInfo.RiskPopupInfoItem) parcelable;
        } else {
            riskPopupInfoItem = null;
        }
        if (riskPopupInfoItem != null && (image = riskPopupInfoItem.getImage()) != null && (abstractC16879esJ = this.copydefault) != null && (appCompatImageView = abstractC16879esJ.AYXKKw) != null) {
            C33054mpH.AEQbTJ(appCompatImageView, KWHzl(image));
        }
        AbstractC16879esJ abstractC16879esJ2 = this.copydefault;
        if (abstractC16879esJ2 != null && (textView3 = abstractC16879esJ2.djBIcL) != null) {
            if (riskPopupInfoItem == null || (title = riskPopupInfoItem.getTitle()) == null) {
                title = "";
            }
            textView3.setText(title);
        }
        AbstractC16879esJ abstractC16879esJ3 = this.copydefault;
        if (abstractC16879esJ3 != null && (textView2 = abstractC16879esJ3.AhwBna) != null) {
            if (riskPopupInfoItem == null || (desc = riskPopupInfoItem.getDesc()) == null || (text = desc.getText()) == null) {
                text = "";
            }
            textView2.setVisibility(text.length() == 0 ? 8 : 0);
            textView2.setText(text);
        }
        AbstractC16879esJ abstractC16879esJ4 = this.copydefault;
        if (abstractC16879esJ4 != null && (textView = abstractC16879esJ4.values) != null) {
            textView.setVisibility(8);
        }
        AbstractC16879esJ abstractC16879esJ5 = this.copydefault;
        if (abstractC16879esJ5 != null && (recyclerView = abstractC16879esJ5.gEmmrt) != null) {
            recyclerView.setVisibility(8);
        }
        AbstractC16879esJ abstractC16879esJ6 = this.copydefault;
        if (abstractC16879esJ6 != null) {
            abstractC16879esJ6.KWHzl.setVisibility(8);
            abstractC16879esJ6.OLrzqt.setVisibility(0);
            abstractC16879esJ6.copydefault.setVisibility(0);
            abstractC16879esJ6.copydefault.setText(riskPopupInfoItem != null ? riskPopupInfoItem.getConfirmBtnText() : null);
            C52794wYp c52794wYp = abstractC16879esJ6.copydefault;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC16879esJ6.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            ViewGroup.LayoutParams layoutParams = c52794wYp2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                c52794wYp2.setLayoutParams(marginLayoutParams);
                abstractC16879esJ6.AEQbTJ.setVisibility(8);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final Unit EZpvd(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(ImageItem imageItem) {
        return !C33492mxV.OLrzqt() ? imageItem.getLight() : imageItem.getDark();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC57493yjU interfaceC57493yjU = activity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.AhwBna();
        }
        KeyEventDispatcher.Component activity2 = getActivity();
        InterfaceC57493yjU interfaceC57493yjU2 = activity2 instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity2 : null;
        if (interfaceC57493yjU2 != null) {
            interfaceC57493yjU2.DbNXlk();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fZU AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fZU fzu) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = fzu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                fragmentTransactionBeginTransaction.remove(this.AEQbTJ);
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            }
        }
    }
}
