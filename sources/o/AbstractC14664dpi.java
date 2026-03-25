package o;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.okinc.core.base.LoadingDialogType;
import com.okinc.uilab.reminder.OKReminder;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14664dpi extends AbstractC14668dpm {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public android.view.View AEQbTJ;
    public final TreeMap<java.lang.Integer, Function0<Unit>> AhwBna = new TreeMap<>();
    public boolean KWHzl;
    public C33002moI OLrzqt;
    public C55173xeu copydefault;
    public Function0<Unit> valueOf;

    /* JADX INFO: renamed from: o.dpi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dpi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractC14668dpm, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        AbstractC16453ekH abstractC16453ekHOLrzqt = OLrzqt();
        abstractC16453ekHOLrzqt.AEQbTJ.setVisibility(8);
        if (C33492mxV.OLrzqt()) {
            abstractC16453ekHOLrzqt.getRoot().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.profile));
        } else {
            abstractC16453ekHOLrzqt.getRoot().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.DMb));
        }
        if (abstractC16453ekHOLrzqt.valueOf.getChildCount() > 0) {
            android.view.View childAt = abstractC16453ekHOLrzqt.valueOf.getChildAt(0);
            childAt.setVisibility(8);
            this.AEQbTJ = childAt;
        }
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
        C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.dpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC14664dpi.KWHzl(this.AEQbTJ, obj);
            }
        });
        c55173xeu.setBackground(null);
        c55173xeu.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.topMargin = C55298xhM.dpInt$default(96, (android.content.Context) null, 1, (java.lang.Object) null);
        abstractC16453ekHOLrzqt.valueOf.addView(c55173xeu, marginLayoutParams);
        this.copydefault = c55173xeu;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.OLrzqt = new C33002moI(activity, LoadingDialogType.BRANDING);
    }

    public static final void KWHzl(AbstractC14664dpi abstractC14664dpi, java.lang.Object obj) {
        Function0<Unit> function0 = abstractC14664dpi.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void EZpvd() {
        android.view.View view = this.AEQbTJ;
        if (view != null) {
            view.setVisibility(0);
        }
        C55173xeu c55173xeu = this.copydefault;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ void showError$default(AbstractC14664dpi abstractC14664dpi, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        abstractC14664dpi.OLrzqt(str, (Function0<Unit>) function0);
    }

    public final void OLrzqt(java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.view.View view = this.AEQbTJ;
        if (view != null) {
            view.setVisibility(8);
        }
        C55173xeu c55173xeu = this.copydefault;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(0);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                Intrinsics.copydefault((java.lang.Object) str);
            } else {
                str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX);
            }
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
        }
        this.valueOf = function0;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ void showErrorWhenContentNotVisible$default(AbstractC14664dpi abstractC14664dpi, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorWhenContentNotVisible");
        }
        if ((i & 1) != 0) {
            str = "";
        }
        abstractC14664dpi.copydefault(str, (Function0<Unit>) function0);
    }

    public final void copydefault(java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.view.View view = this.AEQbTJ;
        if (view == null || view.getVisibility() != 0) {
            OLrzqt(str, function0);
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        this.KWHzl = true;
        C55173xeu c55173xeu = this.copydefault;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            try {
                C33002moI c33002moI = this.OLrzqt;
                if (c33002moI != null) {
                    c33002moI.KWHzl();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        this.KWHzl = false;
        try {
            C33002moI c33002moI = this.OLrzqt;
            if (c33002moI != null) {
                c33002moI.OLrzqt();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.KWHzl) {
            try {
                C33002moI c33002moI = this.OLrzqt;
                if (c33002moI != null) {
                    c33002moI.KWHzl();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        try {
            C33002moI c33002moI = this.OLrzqt;
            if (c33002moI != null) {
                c33002moI.copydefault();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.dpi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReminder$default(AbstractC14664dpi abstractC14664dpi, OKReminder oKReminder, int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, Function0 function0, java.lang.String str2, Function0 function02, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showReminder");
        }
        abstractC14664dpi.EZpvd(oKReminder, i, (i2 & 4) != 0 ? null : charSequence, (i2 & 8) != 0 ? null : charSequence2, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : function0, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : function02);
    }

    public final void EZpvd(@NotNull OKReminder oKReminder, int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, Function0<Unit> function0, java.lang.String str2, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(oKReminder, "");
        oKReminder.setStyle(i);
        oKReminder.setCloseIconVisibility(false);
        if (charSequence == null) {
            charSequence = "";
        }
        oKReminder.setTitle(charSequence);
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        oKReminder.setMessage(charSequence2);
        oKReminder.setPrimaryAction(str, function0);
        oKReminder.setSecondaryAction(str2, function02);
        oKReminder.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.dpi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReminderInOrder$default(AbstractC14664dpi abstractC14664dpi, OKReminder oKReminder, int i, int i2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, Function0 function0, java.lang.String str2, Function0 function02, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showReminderInOrder");
        }
        abstractC14664dpi.copydefault(oKReminder, i, i2, (i3 & 8) != 0 ? null : charSequence, (i3 & 16) != 0 ? null : charSequence2, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : function0, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : function02);
    }

    public final void copydefault(@NotNull final OKReminder oKReminder, int i, int i2, final java.lang.CharSequence charSequence, final java.lang.CharSequence charSequence2, final java.lang.String str, final Function0<Unit> function0, final java.lang.String str2, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(oKReminder, "");
        EZpvd(oKReminder, i, i2, new Function0() { // from class: o.dpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC14664dpi.AEQbTJ(oKReminder, charSequence, charSequence2, str, function0, str2, function02);
            }
        });
    }

    public static final Unit AEQbTJ(OKReminder oKReminder, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, Function0 function0, java.lang.String str2, Function0 function02) {
        if (charSequence == null) {
            charSequence = "";
        }
        oKReminder.setTitle(charSequence);
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        oKReminder.setMessage(charSequence2);
        oKReminder.setPrimaryAction(str, function0);
        oKReminder.setSecondaryAction(str2, function02);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final OKReminder oKReminder, int i, final int i2, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna.put(java.lang.Integer.valueOf(i), new Function0() { // from class: o.dpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC14664dpi.KWHzl(oKReminder, i2, function0);
            }
        });
        java.util.Set<Map.Entry<java.lang.Integer, Function0<Unit>>> setEntrySet = this.AhwBna.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        ((Function0) ((Map.Entry) CollectionsKt___CollectionsKt.dNCPSb(setEntrySet)).getValue()).invoke();
    }

    public static final Unit KWHzl(OKReminder oKReminder, int i, Function0 function0) {
        oKReminder.setStyle(i);
        oKReminder.setCloseIconVisibility(false);
        function0.invoke();
        oKReminder.setVisibility(0);
        return Unit.INSTANCE;
    }
}
