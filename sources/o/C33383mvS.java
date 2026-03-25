package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.core.ok_app.modeswitch.liteSubMode.ModeSwitchCardFragment$initView$2;
import com.okinc.core.ok_app.modeswitch.liteSubMode.ModeSwitchCardFragment$initView$3;
import com.okinc.core.ok_app.modeswitch.liteSubMode.ModeSwitchCardFragment$sendResult$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C33160mrH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33383mvS extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C33302mtr KWHzl;
    public final int EZpvd = C33160mrH.Application.DbNXlk;
    public final InterfaceC47278tmy OLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf().getApplicationContext(), InterfaceC47230tmC.class)).fmB();

    public final void OLrzqt(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33302mtr c33302mtrOLrzqt = C33302mtr.OLrzqt(layoutInflater, viewGroup, false);
        this.KWHzl = c33302mtrOLrzqt;
        C33302mtr c33302mtr = null;
        if (c33302mtrOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c33302mtrOLrzqt = null;
        }
        android.widget.LinearLayout root = c33302mtrOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(8);
        C33302mtr c33302mtr2 = this.KWHzl;
        if (c33302mtr2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33302mtr = c33302mtr2;
        }
        android.widget.LinearLayout root2 = c33302mtr.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        return root2;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C33302mtr c33302mtr = this.KWHzl;
        if (c33302mtr == null) {
            Intrinsics.gEmmrt("");
            c33302mtr = null;
        }
        ConstraintLayout constraintLayout = c33302mtr.AEQbTJ;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new ModeSwitchCardFragment$initView$2(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new ModeSwitchCardFragment$initView$3(this, null), 2, null);
    }

    public final void OLrzqt() {
        java.io.Serializable serializable = requireArguments().getSerializable("MODE_SWITCH_SOURCE_PARAM");
        ModeSwitchSourceEnum modeSwitchSourceEnum = serializable instanceof ModeSwitchSourceEnum ? (ModeSwitchSourceEnum) serializable : null;
        if (modeSwitchSourceEnum == null) {
            modeSwitchSourceEnum = ModeSwitchSourceEnum.UNKNOWN;
        }
        C33385mvU c33385mvU = C33385mvU.copydefault;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC33240msi value = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue();
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.Fragment fragmentEZpvd = c33385mvU.EZpvd(viewLifecycleOwner, value, parentFragmentManager, modeSwitchSourceEnum, new Function2() { // from class: o.mvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C33383mvS.OLrzqt(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
        if (fragmentEZpvd != null) {
            FragmentKt.setFragmentResultListener(fragmentEZpvd, "FRAGMENT_RESULT_KEY", new Function2() { // from class: o.mvQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C33383mvS.AEQbTJ(this.copydefault, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
        }
    }

    public static final Unit OLrzqt(int i, int i2) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C33383mvS c33383mvS, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("FRAGMENT_RESULT_MODE_CHANGED", false)) {
            c33383mvS.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new ModeSwitchCardFragment$sendResult$1(this, null));
    }

    /* JADX INFO: renamed from: o.mvS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.mvS$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C33383mvS KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C33383mvS c33383mvS) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c33383mvS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt();
            }
        }
    }
}
