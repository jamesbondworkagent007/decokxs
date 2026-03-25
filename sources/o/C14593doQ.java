package o;

import android.view.View;
import androidx.autofill.HintConstants;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.doQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C14593doQ extends androidx.fragment.app.Fragment {
    public AbstractC16936etN AEQbTJ;
    public Function0<Unit> EZpvd;
    public boolean KWHzl;
    public Function1<? super java.lang.String, Unit> copydefault;

    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function1;
        this.EZpvd = function0;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16936etN abstractC16936etNAEQbTJ = AbstractC16936etN.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16936etNAEQbTJ, "");
        this.AEQbTJ = abstractC16936etNAEQbTJ;
        abstractC16936etNAEQbTJ.AEQbTJ.setAnimation(C13754dXa.Fragment.values);
        abstractC16936etNAEQbTJ.AEQbTJ.playAnimation();
        abstractC16936etNAEQbTJ.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.doP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C14593doQ.KWHzl(view);
            }
        });
        OLrzqt(this.KWHzl);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16936etNAEQbTJ.OLrzqt);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.doX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14593doQ.copydefault(this.OLrzqt, obj);
            }
        });
        C8003auW.copydefault(abstractC16936etNAEQbTJ.EZpvd).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.doU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14593doQ.OLrzqt(this.AEQbTJ, obj);
            }
        });
        return abstractC16936etNAEQbTJ.getRoot();
    }

    public static final void copydefault(final C14593doQ c14593doQ, java.lang.Object obj) {
        C32866mlf.onEvent$default("app_bio_open_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        androidx.fragment.app.FragmentManager childFragmentManager = c14593doQ.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14430dlM(childFragmentManager, "finger-set", true, null, null, new Function0() { // from class: o.doV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14593doQ.KWHzl(this.AEQbTJ);
            }
        }, false, 88, null).EZpvd();
    }

    public static final Unit KWHzl(final C14593doQ c14593doQ) {
        AbstractC58260yxt<Unit> abstractC58260yxtAEQbTJ;
        android.os.Bundle arguments = c14593doQ.getArguments();
        java.lang.String string = arguments != null ? arguments.getString(HintConstants.AUTOFILL_HINT_PASSWORD) : null;
        if (string == null || string.length() == 0) {
            C11010bzJ.ActionBar actionBar = C11010bzJ.Companion;
            abstractC58260yxtAEQbTJ = C11010bzJ.ActionBar.getInstance$default(actionBar, null, 1, null).AEQbTJ(C11010bzJ.ActionBar.getInstance$default(actionBar, null, 1, null).OLrzqt(), false, "finger-set");
        } else {
            abstractC58260yxtAEQbTJ = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).EZpvd(string, "finger-set");
        }
        final Function1 function1 = new Function1() { // from class: o.doW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14593doQ.EZpvd((Unit) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.dpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14593doQ.OLrzqt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.doY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14593doQ.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.doZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14593doQ.AEQbTJ(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14593doQ.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dpb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14593doQ.gEmmrt(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AYXKKw("finger-set");
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C14593doQ c14593doQ, java.lang.String str) {
        C14471dmA.EZpvd.OLrzqt();
        C13912dbY.copydefault.copydefault(false);
        c14593doQ.requireActivity().finish();
        Function1<? super java.lang.String, Unit> function1 = c14593doQ.copydefault;
        if (function1 != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(C14593doQ c14593doQ, java.lang.Object obj) {
        C32866mlf.onEvent$default("app_bio_skip_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        c14593doQ.requireActivity().finish();
        Function0<Unit> function0 = c14593doQ.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.doT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14593doQ.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C14593doQ c14593doQ) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c14593doQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(boolean z) {
        AbstractC16936etN abstractC16936etN;
        C52794wYp c52794wYp;
        this.KWHzl = z;
        if (!z || (abstractC16936etN = this.AEQbTJ) == null || (c52794wYp = abstractC16936etN.EZpvd) == null) {
            return;
        }
        c52794wYp.setVisibility(8);
    }

    public final void copydefault(java.lang.String str) {
        if (getArguments() == null) {
            setArguments(new android.os.Bundle());
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString(HintConstants.AUTOFILL_HINT_PASSWORD, str);
        }
    }
}
