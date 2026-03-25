package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21020grq extends C20775gnJ {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.grq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21020grq OLrzqt(android.os.Bundle bundle) {
            C21020grq c21020grq = new C21020grq();
            c21020grq.setArguments(bundle);
            return c21020grq;
        }
    }

    @Override // o.C20775gnJ, o.AbstractC20799gnh
    public void copydefault(@NotNull C20863gos c20863gos) {
        Intrinsics.checkNotNullParameter(c20863gos, "");
        super.copydefault(c20863gos);
        valueOf().fetchVPNInfo.setVisibility(8);
        valueOf().DbNXlk.setVisibility(8);
        valueOf().AEQbTJ.setVisibility(8);
    }

    @Override // o.C20775gnJ
    public void AEQbTJ(boolean z, boolean z2, @NotNull java.lang.String str, boolean z3, boolean z4, Function0<Unit> function0) {
        Function0<Unit> function02;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.CharSequence charSequenceAEQbTJ = str;
        charSequenceAEQbTJ = str;
        if (z && z2) {
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) str);
            charSequenceAEQbTJ = str;
            if (zOLrzqt) {
                AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
                final C9303bSz c9303bSz = abstractC8664bGwFJNWhG instanceof C9303bSz ? (C9303bSz) abstractC8664bGwFJNWhG : null;
                if (c9303bSz == null) {
                    return;
                }
                if (!c9303bSz.fHqPtx().AuCTel()) {
                    function02 = new Function0() { // from class: o.gru
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C21020grq.getNewProxyInstance();
                        }
                    };
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) c9303bSz.zuBGHE())) {
                    strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getValue);
                    function02 = new Function0() { // from class: o.grn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C21020grq.KWHzl(c9303bSz, this);
                        }
                    };
                    C14731dqw c14731dqw = C14731dqw.AEQbTJ;
                    AppCompatTextView appCompatTextView = valueOf().values;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    charSequenceAEQbTJ = c14731dqw.AEQbTJ(appCompatTextView, str, strAYXKKw, function02);
                } else {
                    function02 = new Function0() { // from class: o.gro
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C21020grq.uzCIH();
                        }
                    };
                }
                strAYXKKw = "";
                C14731dqw c14731dqw2 = C14731dqw.AEQbTJ;
                AppCompatTextView appCompatTextView2 = valueOf().values;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                charSequenceAEQbTJ = c14731dqw2.AEQbTJ(appCompatTextView2, str, strAYXKKw, function02);
            }
        }
        AppCompatTextView appCompatTextView3 = valueOf().values;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        AEQbTJ(appCompatTextView3, z, charSequenceAEQbTJ);
    }

    public static final Unit KWHzl(C9303bSz c9303bSz, C21020grq c21020grq) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", c9303bSz.zuBGHE()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity activity = c21020grq.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, activity, bundleBundleOf, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH() {
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance() {
        return Unit.INSTANCE;
    }
}
