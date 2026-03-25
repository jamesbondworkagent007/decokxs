package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.impl.passkey.ui.register.withoutpasskey.PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1;
import com.okinc.auth.impl.passkey.ui.register.withoutpasskey.PasskeyPromotionServiceWithoutPasskeyFragment$initObserveEvent$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6319aNB extends AbstractC6320aNC {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.aNB$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C6319aNB EZpvd() {
            return new C6319aNB();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        KWHzl(AbstractC5666aAl.OLrzqt(layoutInflater, viewGroup, false));
        ViewBinding viewBindingValueOf = valueOf();
        if (viewBindingValueOf != null) {
            return viewBindingValueOf.getRoot();
        }
        return null;
    }

    @Override // o.C6268aMD
    public void fetchVPNInfo() {
        ViewBinding viewBindingValueOf = valueOf();
        AbstractC5666aAl abstractC5666aAl = viewBindingValueOf instanceof AbstractC5666aAl ? (AbstractC5666aAl) viewBindingValueOf : null;
        if (abstractC5666aAl != null) {
            abstractC5666aAl.KWHzl.copydefault().setVisibility(8);
            abstractC5666aAl.KWHzl.setRightIconOnClickListener(new Function0() { // from class: o.aNF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6319aNB.KWHzl(this.OLrzqt);
                }
            });
            C52794wYp c52794wYp = abstractC5666aAl.copydefault;
            Intrinsics.copydefault(c52794wYp);
            C6738aUz.EZpvd(c52794wYp);
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
            if (gEmmrt().ejfBZ() == PasskeyPromotionSource.LOGIN || gEmmrt().ejfBZ() == PasskeyPromotionSource.SIGNUP) {
                abstractC5666aAl.copydefault.setOKDSType(80);
            } else {
                abstractC5666aAl.copydefault.setOKDSType(257);
            }
            C52794wYp c52794wYp2 = abstractC5666aAl.AEQbTJ;
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
            abstractC5666aAl.EZpvd.setAnimation(C33492mxV.OLrzqt() ? C8206ayP.FragmentManager.AEQbTJ : C8206ayP.FragmentManager.EZpvd);
        }
    }

    public static final Unit KWHzl(C6319aNB c6319aNB) {
        if (c6319aNB.gEmmrt().valueOf()) {
            c6319aNB.isConnected();
        } else {
            c6319aNB.AhwBna().KWHzl();
            c6319aNB.gEmmrt().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    @Override // o.C6268aMD
    public void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        super.OLrzqt(view);
        C6690aUB.KWHzl(AhwBna().valueOf(), this, new PasskeyPromotionServiceWithoutPasskeyFragment$initObserveEvent$1(this, null));
    }

    @Override // o.C6268aMD
    public void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PasskeyPromotionServiceWithoutPasskeyFragment$clickEnable$1(this, null), 3, null);
    }

    public final void DbNXlk() {
        C6346aNc c6346aNcOLrzqt = C6346aNc.Companion.OLrzqt(new Function0() { // from class: o.aNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C6319aNB.copydefault(this.OLrzqt);
            }
        });
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c6346aNcOLrzqt.show(parentFragmentManager);
    }

    public static final Unit copydefault(C6319aNB c6319aNB) {
        c6319aNB.AhwBna().OLrzqt((C6268aMD) c6319aNB);
        return Unit.INSTANCE;
    }

    @Override // o.C6268aMD, androidx.fragment.app.Fragment
    public void onDestroyView() {
        LottieAnimationView lottieAnimationView;
        super.onDestroyView();
        ViewBinding viewBindingValueOf = valueOf();
        AbstractC5666aAl abstractC5666aAl = viewBindingValueOf instanceof AbstractC5666aAl ? (AbstractC5666aAl) viewBindingValueOf : null;
        if (abstractC5666aAl == null || (lottieAnimationView = abstractC5666aAl.EZpvd) == null) {
            return;
        }
        lottieAnimationView.cancelAnimation();
    }

    /* JADX INFO: renamed from: o.aNB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6319aNB OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6319aNB c6319aNB) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c6319aNB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C6307aMq.EZpvd.EZpvd();
                C6288aMX.Companion.EZpvd(this.OLrzqt.gEmmrt().ejfBZ()).show(this.OLrzqt.getParentFragmentManager(), "PasskeyLearnMoreBottomSheet");
            }
        }
    }

    /* JADX INFO: renamed from: o.aNB$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6319aNB KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C6319aNB c6319aNB) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c6319aNB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.djBIcL();
            }
        }
    }
}
