package o;

import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.core.util.SPUtils;
import com.okinc.uilab.item.OKRegularCell;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eYN extends wXX {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public boolean EZpvd = Companion.EZpvd();
    public AbstractC16462ekQ KWHzl;
    public Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> OLrzqt;
    public java.util.Set<java.lang.String> gEmmrt;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String OLrzqt() {
            java.lang.String string = SPUtils.getString("sp_key_profile_activities_type_filter", "1,2");
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public final boolean EZpvd() {
            return SPUtils.getBoolean("sp_key_wallet_is_filter_risky_token_in_profile", true);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.eYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eYN.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(eYN eyn) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eyn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        java.lang.String string = getString(C13754dXa.FragmentManager.DisplayContext);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.Set<java.lang.String> linkedHashSet;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        Application application = Companion;
        if (application.OLrzqt().length() > 0) {
            linkedHashSet = CollectionsKt___CollectionsKt.DXXBbs(StringsKt__StringsKt.split$default((java.lang.CharSequence) application.OLrzqt(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null));
        } else {
            linkedHashSet = new LinkedHashSet<>();
        }
        this.gEmmrt = linkedHashSet;
        AbstractC16462ekQ abstractC16462ekQ = (AbstractC16462ekQ) DataBindingUtil.inflate(getCustomLayoutInflater(), C13754dXa.TaskDescription.UhxbNG, constraintLayout, true);
        this.KWHzl = abstractC16462ekQ;
        if (abstractC16462ekQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16462ekQ = null;
        }
        abstractC16462ekQ.gEmmrt.setChecked(SPUtils.getBoolean("sp_key_wallet_is_filter_risky_token_in_profile", true));
        abstractC16462ekQ.gEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.eYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                eYN.KWHzl(this.KWHzl, compoundButton, z);
            }
        });
        wYK wyk = abstractC16462ekQ.valueOf;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        KWHzl(wyk, 1);
        wYK wyk2 = abstractC16462ekQ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(wyk2, "");
        KWHzl(wyk2, 2);
        if (this.AEQbTJ) {
            OKRegularCell oKRegularCell = abstractC16462ekQ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell, "");
            oKRegularCell.setVisibility(0);
            OKRegularCell oKRegularCell2 = abstractC16462ekQ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKRegularCell2, "");
            oKRegularCell2.setVisibility(0);
            wYK wyk3 = abstractC16462ekQ.djBIcL;
            Intrinsics.checkNotNullExpressionValue(wyk3, "");
            KWHzl(wyk3, 3);
            wYK wyk4 = abstractC16462ekQ.AhwBna;
            Intrinsics.checkNotNullExpressionValue(wyk4, "");
            KWHzl(wyk4, 4);
            return;
        }
        OKRegularCell oKRegularCell3 = abstractC16462ekQ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell3, "");
        oKRegularCell3.setVisibility(8);
        OKRegularCell oKRegularCell4 = abstractC16462ekQ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKRegularCell4, "");
        oKRegularCell4.setVisibility(8);
    }

    public static final void KWHzl(eYN eyn, android.widget.CompoundButton compoundButton, boolean z) {
        eyn.EZpvd = z;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        java.util.Set<java.lang.String> set = this.gEmmrt;
        if (set == null) {
            Intrinsics.gEmmrt("");
            set = null;
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null);
        Application application = Companion;
        if (!Intrinsics.EZpvd((java.lang.Object) strJoinToString$default, (java.lang.Object) application.OLrzqt())) {
            SPUtils.commit("sp_key_profile_activities_type_filter", strJoinToString$default);
        }
        if (this.EZpvd != application.EZpvd()) {
            SPUtils.commit("sp_key_wallet_is_filter_risky_token_in_profile", java.lang.Boolean.valueOf(this.EZpvd));
        }
        Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2 = this.OLrzqt;
        if (function2 != null) {
            function2.invoke(application.OLrzqt(), java.lang.Boolean.valueOf(application.EZpvd()));
        }
    }

    public final void KWHzl(wYK wyk, int i) {
        final java.lang.String strValueOf = java.lang.String.valueOf(i);
        java.util.Set<java.lang.String> set = this.gEmmrt;
        if (set == null) {
            Intrinsics.gEmmrt("");
            set = null;
        }
        wyk.setChecked(set.contains(strValueOf));
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.eYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                eYN.OLrzqt(this.AEQbTJ, strValueOf, compoundButton, z);
            }
        });
    }

    public static final void OLrzqt(eYN eyn, java.lang.String str, android.widget.CompoundButton compoundButton, boolean z) {
        java.util.Set<java.lang.String> set = null;
        if (z) {
            java.util.Set<java.lang.String> set2 = eyn.gEmmrt;
            if (set2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                set = set2;
            }
            set.add(str);
            return;
        }
        java.util.Set<java.lang.String> set3 = eyn.gEmmrt;
        if (set3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            set = set3;
        }
        set.remove(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eYN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(eYN eyn, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, boolean z, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function2 = null;
        }
        eyn.KWHzl(fragmentManager, str, z, function2);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, boolean z, Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = function2;
        this.AEQbTJ = z;
        fragmentManager.beginTransaction().add(this, str).commitAllowingStateLoss();
    }
}
