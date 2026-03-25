package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.core.ok_app.modeswitch.liteSubMode.AppSubModeSwitchBottomSheet$onCreateContent$4;
import com.okinc.core.ok_app.modeswitch.liteSubMode.AppSubModeSwitchBottomSheet$switchSubMode$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC33249msr;
import o.C33160mrH;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33371mvG extends wXX {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mvF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C33371mvG.OLrzqt());
        }
    });
    public C33294mtj KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    private final void copydefault(android.view.View view) {
    }

    private final boolean KWHzl() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean OLrzqt() {
        boolean zCopydefault = C33366mvB.KWHzl.EZpvd() ? ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).copydefault() : true;
        pUU.EZpvd("ModeSwitch", "isWeb3Visible=" + zCopydefault);
        return zCopydefault;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        pUU.EZpvd("ModeSwitch", "AppSubModeSwitchBottomSheet onViewCreated");
        copydefault(view);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(5);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setTitle(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AubY));
        super.onCreateHeader(wxq);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
        C33294mtj c33294mtjKWHzl = C33294mtj.KWHzl(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        this.KWHzl = c33294mtjKWHzl;
        if (c33294mtjKWHzl == null) {
            Intrinsics.gEmmrt("");
            c33294mtjKWHzl = null;
        }
        c33294mtjKWHzl.OLrzqt.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.uzCIH));
        C33294mtj c33294mtj = this.KWHzl;
        if (c33294mtj == null) {
            Intrinsics.gEmmrt("");
            c33294mtj = null;
        }
        c33294mtj.OLrzqt.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.iwGUEr));
        C33294mtj c33294mtj2 = this.KWHzl;
        if (c33294mtj2 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj2 = null;
        }
        c33294mtj2.OLrzqt.OLrzqt.setImageResource(C33160mrH.Activity.EZpvd);
        C33294mtj c33294mtj3 = this.KWHzl;
        if (c33294mtj3 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj3 = null;
        }
        android.widget.ImageView imageView = c33294mtj3.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        C33294mtj c33294mtj4 = this.KWHzl;
        if (c33294mtj4 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj4 = null;
        }
        c33294mtj4.OLrzqt.AEQbTJ.setContentDescription("proPayModeOptionId");
        C33294mtj c33294mtj5 = this.KWHzl;
        if (c33294mtj5 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj5 = null;
        }
        c33294mtj5.EZpvd.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.zLjUOn));
        C33294mtj c33294mtj6 = this.KWHzl;
        if (c33294mtj6 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj6 = null;
        }
        c33294mtj6.EZpvd.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AuCTelauCTel));
        C33294mtj c33294mtj7 = this.KWHzl;
        if (c33294mtj7 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj7 = null;
        }
        c33294mtj7.EZpvd.OLrzqt.setImageResource(C52761wXj.TaskDescription.OFhtUX);
        C33294mtj c33294mtj8 = this.KWHzl;
        if (c33294mtj8 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj8 = null;
        }
        android.widget.ImageView imageView2 = c33294mtj8.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        C33294mtj c33294mtj9 = this.KWHzl;
        if (c33294mtj9 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj9 = null;
        }
        c33294mtj9.EZpvd.AEQbTJ.setContentDescription("proExchangeModeOptionId");
        C33294mtj c33294mtj10 = this.KWHzl;
        if (c33294mtj10 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj10 = null;
        }
        c33294mtj10.KWHzl.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.wlaJM));
        C33294mtj c33294mtj11 = this.KWHzl;
        if (c33294mtj11 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj11 = null;
        }
        c33294mtj11.KWHzl.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.zsXlph));
        C33294mtj c33294mtj12 = this.KWHzl;
        if (c33294mtj12 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj12 = null;
        }
        c33294mtj12.KWHzl.OLrzqt.setImageResource(C52761wXj.TaskDescription.QOLQEE);
        C33294mtj c33294mtj13 = this.KWHzl;
        if (c33294mtj13 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj13 = null;
        }
        android.widget.ImageView imageView3 = c33294mtj13.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
        C33294mtj c33294mtj14 = this.KWHzl;
        if (c33294mtj14 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj14 = null;
        }
        c33294mtj14.KWHzl.AEQbTJ.setContentDescription("tradeWeb3ModeOptionId");
        C33294mtj c33294mtj15 = this.KWHzl;
        if (c33294mtj15 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj15 = null;
        }
        android.widget.LinearLayout root = c33294mtj15.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(KWHzl() ? 0 : 8);
        C33294mtj c33294mtj16 = this.KWHzl;
        if (c33294mtj16 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj16 = null;
        }
        android.widget.LinearLayout root2 = c33294mtj16.OLrzqt.getRoot();
        root2.setOnClickListener(new StateListAnimator(root2, 1000L, this));
        C33294mtj c33294mtj17 = this.KWHzl;
        if (c33294mtj17 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj17 = null;
        }
        android.widget.LinearLayout root3 = c33294mtj17.EZpvd.getRoot();
        root3.setOnClickListener(new Activity(root3, 1000L, this));
        C33294mtj c33294mtj18 = this.KWHzl;
        if (c33294mtj18 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj18 = null;
        }
        android.widget.LinearLayout root4 = c33294mtj18.KWHzl.getRoot();
        root4.setOnClickListener(new ActionBar(root4, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new AppSubModeSwitchBottomSheet$onCreateContent$4(this, null), 2, null);
    }

    public final void EZpvd(AbstractC33249msr abstractC33249msr) {
        boolean z = abstractC33249msr instanceof AbstractC33249msr.Application;
        boolean z2 = abstractC33249msr instanceof AbstractC33249msr.TaskDescription;
        boolean z3 = abstractC33249msr instanceof AbstractC33249msr.ActionBar;
        C33294mtj c33294mtj = this.KWHzl;
        C33294mtj c33294mtj2 = null;
        if (c33294mtj == null) {
            Intrinsics.gEmmrt("");
            c33294mtj = null;
        }
        c33294mtj.EZpvd.AEQbTJ.setSelected(z2);
        C33294mtj c33294mtj3 = this.KWHzl;
        if (c33294mtj3 == null) {
            Intrinsics.gEmmrt("");
            c33294mtj3 = null;
        }
        c33294mtj3.OLrzqt.AEQbTJ.setSelected(z);
        C33294mtj c33294mtj4 = this.KWHzl;
        if (c33294mtj4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33294mtj2 = c33294mtj4;
        }
        c33294mtj2.KWHzl.AEQbTJ.setSelected(z3);
    }

    public final void copydefault(AbstractC33249msr abstractC33249msr) {
        pUU.KWHzl("ModeSwitch", "switchSubMode: User selected mode=" + abstractC33249msr);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new AppSubModeSwitchBottomSheet$switchSubMode$1(abstractC33249msr, this, null), 2, null);
    }

    public final void OLrzqt(AbstractC33249msr abstractC33249msr, AbstractC33249msr abstractC33249msr2) {
        if (Intrinsics.EZpvd(abstractC33249msr, abstractC33249msr2)) {
            return;
        }
        java.io.Serializable serializable = requireArguments().getSerializable("MODE_SWITCH_SOURCE_PARAM");
        ModeSwitchSourceEnum modeSwitchSourceEnum = serializable instanceof ModeSwitchSourceEnum ? (ModeSwitchSourceEnum) serializable : null;
        if (modeSwitchSourceEnum == null) {
            modeSwitchSourceEnum = ModeSwitchSourceEnum.UNKNOWN;
        }
        C33405mvo.KWHzl.AEQbTJ(abstractC33249msr, abstractC33249msr2, modeSwitchSourceEnum.name());
    }

    /* JADX INFO: renamed from: o.mvG$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C33371mvG AEQbTJ(@NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
            Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
            pUU.EZpvd("ModeSwitch", "newInstance: Creating AppSubModeSwitchBottomSheet with source=" + modeSwitchSourceEnum);
            C33371mvG c33371mvG = new C33371mvG();
            c33371mvG.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("MODE_SWITCH_SOURCE_PARAM", modeSwitchSourceEnum)));
            return c33371mvG;
        }
    }

    /* JADX INFO: renamed from: o.mvG$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C33371mvG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C33371mvG c33371mvG) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c33371mvG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault(AbstractC33249msr.ActionBar.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.mvG$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C33371mvG EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C33371mvG c33371mvG) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c33371mvG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(AbstractC33249msr.TaskDescription.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.mvG$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C33371mvG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C33371mvG c33371mvG) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c33371mvG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault(AbstractC33249msr.Application.AEQbTJ);
            }
        }
    }
}
