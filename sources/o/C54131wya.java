package o;

import androidx.core.os.BundleKt;
import com.immomo.mls.InitData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54131wya extends AbstractC43061riF {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final java.lang.String KWHzl = "AutoEarnFaqPage";
    public final int copydefault = C7343ahz.Activity.valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.wya$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wya.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C54131wya KWHzl(boolean z) {
            C54131wya c54131wya = new C54131wya();
            c54131wya.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("IS_EARN", java.lang.Boolean.valueOf(z))));
            return c54131wya;
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C7343ahz.TaskDescription.OcIXYQ);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        android.os.Bundle arguments = getArguments();
        return C43056riA.AEQbTJ.EZpvd("okluatradingeco", "/bot/auto_earn/faq", C56423yEv.EZpvd(C56390yDp.OLrzqt("IS_EARN", java.lang.Boolean.valueOf(arguments != null ? arguments.getBoolean("IS_EARN") : true))));
    }
}
