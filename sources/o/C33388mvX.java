package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.core.ok_app.modeswitch.liteSubMode.TradeModeSwitchBottomSheet$onCreateContent$6;
import com.okinc.core.ok_app.modeswitch.liteSubMode.TradeModeSwitchBottomSheet$switchSubMode$1;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC33240msi;
import o.C33160mrH;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33388mvX extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C33297mtm AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mwa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C33388mvX.djBIcL());
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mwb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C33388mvX.KWHzl());
        }
    });

    private final void KWHzl(android.view.View view) {
    }

    private final boolean valueOf() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean djBIcL() {
        boolean zEZpvd = C33366mvB.KWHzl.EZpvd() ? ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).EZpvd() : true;
        pUU.EZpvd("ModeSwitch", "isWeb3Visible=" + zEZpvd);
        return zEZpvd;
    }

    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean KWHzl() {
        boolean zAEQbTJ = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).AEQbTJ();
        pUU.EZpvd("ModeSwitch", "isSubModesModeAvailable=" + zAEQbTJ);
        return zAEQbTJ;
    }

    public final boolean copydefault() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).copydefault(3);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        pUU.EZpvd("ModeSwitch", "TradeModeSwitchBottomSheet onViewCreated");
        KWHzl(view);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(5);
        wxq.setTitle(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AEQbTJ));
        wxq.AEQbTJ().setVisibility(0);
        super.onCreateHeader(wxq);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
        C33297mtm c33297mtmAEQbTJ = C33297mtm.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        this.AEQbTJ = c33297mtmAEQbTJ;
        if (c33297mtmAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c33297mtmAEQbTJ = null;
        }
        c33297mtmAEQbTJ.AEQbTJ.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl));
        C33297mtm c33297mtm = this.AEQbTJ;
        if (c33297mtm == null) {
            Intrinsics.gEmmrt("");
            c33297mtm = null;
        }
        c33297mtm.AEQbTJ.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.copydefault));
        C33297mtm c33297mtm2 = this.AEQbTJ;
        if (c33297mtm2 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm2 = null;
        }
        c33297mtm2.AEQbTJ.OLrzqt.setImageResource(C52761wXj.TaskDescription.getPostValueLengthLimit);
        C33297mtm c33297mtm3 = this.AEQbTJ;
        if (c33297mtm3 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm3 = null;
        }
        android.widget.ImageView imageView = c33297mtm3.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        C33297mtm c33297mtm4 = this.AEQbTJ;
        if (c33297mtm4 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm4 = null;
        }
        c33297mtm4.AEQbTJ.AEQbTJ.setContentDescription("legacyModeOptionId");
        C33297mtm c33297mtm5 = this.AEQbTJ;
        if (c33297mtm5 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm5 = null;
        }
        c33297mtm5.OLrzqt.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.uzCIH));
        C33297mtm c33297mtm6 = this.AEQbTJ;
        if (c33297mtm6 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm6 = null;
        }
        c33297mtm6.OLrzqt.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.iwGUEr));
        C33297mtm c33297mtm7 = this.AEQbTJ;
        if (c33297mtm7 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm7 = null;
        }
        c33297mtm7.OLrzqt.OLrzqt.setImageResource(C33160mrH.Activity.EZpvd);
        C33297mtm c33297mtm8 = this.AEQbTJ;
        if (c33297mtm8 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm8 = null;
        }
        android.widget.ImageView imageView2 = c33297mtm8.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        C33297mtm c33297mtm9 = this.AEQbTJ;
        if (c33297mtm9 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm9 = null;
        }
        c33297mtm9.OLrzqt.AEQbTJ.setContentDescription("proPayModeOptionId");
        C33297mtm c33297mtm10 = this.AEQbTJ;
        if (c33297mtm10 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm10 = null;
        }
        c33297mtm10.KWHzl.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AhwBna));
        C33297mtm c33297mtm11 = this.AEQbTJ;
        if (c33297mtm11 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm11 = null;
        }
        c33297mtm11.KWHzl.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.copydefault));
        C33297mtm c33297mtm12 = this.AEQbTJ;
        if (c33297mtm12 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm12 = null;
        }
        c33297mtm12.KWHzl.OLrzqt.setImageResource(C52761wXj.TaskDescription.getPostValueLengthLimit);
        C33297mtm c33297mtm13 = this.AEQbTJ;
        if (c33297mtm13 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm13 = null;
        }
        android.widget.ImageView imageView3 = c33297mtm13.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
        C33297mtm c33297mtm14 = this.AEQbTJ;
        if (c33297mtm14 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm14 = null;
        }
        c33297mtm14.KWHzl.AEQbTJ.setContentDescription("tradeSimpleModeOptionId");
        C33297mtm c33297mtm15 = this.AEQbTJ;
        if (c33297mtm15 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm15 = null;
        }
        c33297mtm15.copydefault.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl));
        C33297mtm c33297mtm16 = this.AEQbTJ;
        if (c33297mtm16 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm16 = null;
        }
        c33297mtm16.copydefault.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.OLrzqt));
        C33297mtm c33297mtm17 = this.AEQbTJ;
        if (c33297mtm17 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm17 = null;
        }
        c33297mtm17.copydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.OFhtUX);
        C33297mtm c33297mtm18 = this.AEQbTJ;
        if (c33297mtm18 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm18 = null;
        }
        android.widget.ImageView imageView4 = c33297mtm18.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView4, "");
        imageView4.setVisibility(8);
        C33297mtm c33297mtm19 = this.AEQbTJ;
        if (c33297mtm19 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm19 = null;
        }
        c33297mtm19.copydefault.AEQbTJ.setContentDescription("tradeAdvanceModeOptionId");
        C33297mtm c33297mtm20 = this.AEQbTJ;
        if (c33297mtm20 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm20 = null;
        }
        c33297mtm20.EZpvd.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.valueOf));
        C33297mtm c33297mtm21 = this.AEQbTJ;
        if (c33297mtm21 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm21 = null;
        }
        c33297mtm21.EZpvd.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.EZpvd));
        C33297mtm c33297mtm22 = this.AEQbTJ;
        if (c33297mtm22 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm22 = null;
        }
        c33297mtm22.EZpvd.OLrzqt.setImageResource(C52761wXj.TaskDescription.QOLQEE);
        C33297mtm c33297mtm23 = this.AEQbTJ;
        if (c33297mtm23 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm23 = null;
        }
        android.widget.ImageView imageView5 = c33297mtm23.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        imageView5.setVisibility(8);
        C33297mtm c33297mtm24 = this.AEQbTJ;
        if (c33297mtm24 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm24 = null;
        }
        c33297mtm24.EZpvd.AEQbTJ.setContentDescription("tradeWeb3ModeOptionId");
        C33297mtm c33297mtm25 = this.AEQbTJ;
        if (c33297mtm25 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm25 = null;
        }
        android.widget.LinearLayout root = c33297mtm25.OLrzqt.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this));
        C33297mtm c33297mtm26 = this.AEQbTJ;
        if (c33297mtm26 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm26 = null;
        }
        android.widget.LinearLayout root2 = c33297mtm26.KWHzl.getRoot();
        root2.setOnClickListener(new StateListAnimator(root2, 1000L, this));
        C33297mtm c33297mtm27 = this.AEQbTJ;
        if (c33297mtm27 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm27 = null;
        }
        android.widget.LinearLayout root3 = c33297mtm27.AEQbTJ.getRoot();
        root3.setOnClickListener(new Activity(root3, 1000L, this));
        C33297mtm c33297mtm28 = this.AEQbTJ;
        if (c33297mtm28 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm28 = null;
        }
        android.widget.LinearLayout root4 = c33297mtm28.copydefault.getRoot();
        root4.setOnClickListener(new ActionBar(root4, 1000L, this));
        C33297mtm c33297mtm29 = this.AEQbTJ;
        if (c33297mtm29 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm29 = null;
        }
        android.widget.LinearLayout root5 = c33297mtm29.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "");
        root5.setVisibility(true ^ AEQbTJ() ? 0 : 8);
        C33297mtm c33297mtm30 = this.AEQbTJ;
        if (c33297mtm30 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm30 = null;
        }
        android.widget.LinearLayout root6 = c33297mtm30.copydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root6, "");
        root6.setVisibility(AEQbTJ() ? 0 : 8);
        C33297mtm c33297mtm31 = this.AEQbTJ;
        if (c33297mtm31 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm31 = null;
        }
        android.widget.LinearLayout root7 = c33297mtm31.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root7, "");
        root7.setVisibility(AEQbTJ() ? 0 : 8);
        C33297mtm c33297mtm32 = this.AEQbTJ;
        if (c33297mtm32 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm32 = null;
        }
        android.widget.LinearLayout root8 = c33297mtm32.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root8, "");
        root8.setVisibility((valueOf() && copydefault()) ? 0 : 8);
        C33297mtm c33297mtm33 = this.AEQbTJ;
        if (c33297mtm33 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm33 = null;
        }
        android.widget.LinearLayout root9 = c33297mtm33.OLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root9, "");
        root9.setVisibility(((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).AEQbTJ(AbstractC33240msi.TaskDescription.OLrzqt) ? 0 : 8);
        C33297mtm c33297mtm34 = this.AEQbTJ;
        if (c33297mtm34 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm34 = null;
        }
        android.widget.LinearLayout root10 = c33297mtm34.EZpvd.getRoot();
        root10.setOnClickListener(new PendingIntent(root10, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new TradeModeSwitchBottomSheet$onCreateContent$6(this, null), 2, null);
    }

    public final void EZpvd(AbstractC33240msi abstractC33240msi) {
        boolean z = abstractC33240msi instanceof AbstractC33240msi.ActionBar;
        boolean z2 = abstractC33240msi instanceof AbstractC33240msi.Activity;
        boolean z3 = abstractC33240msi instanceof AbstractC33240msi.LoaderManager;
        boolean z4 = abstractC33240msi instanceof AbstractC33240msi.TaskDescription;
        boolean z5 = abstractC33240msi instanceof AbstractC33240msi.Application;
        C33297mtm c33297mtm = this.AEQbTJ;
        C33297mtm c33297mtm2 = null;
        if (c33297mtm == null) {
            Intrinsics.gEmmrt("");
            c33297mtm = null;
        }
        c33297mtm.copydefault.AEQbTJ.setSelected(z);
        C33297mtm c33297mtm3 = this.AEQbTJ;
        if (c33297mtm3 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm3 = null;
        }
        c33297mtm3.KWHzl.AEQbTJ.setSelected(z2);
        C33297mtm c33297mtm4 = this.AEQbTJ;
        if (c33297mtm4 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm4 = null;
        }
        c33297mtm4.EZpvd.AEQbTJ.setSelected(z3);
        C33297mtm c33297mtm5 = this.AEQbTJ;
        if (c33297mtm5 == null) {
            Intrinsics.gEmmrt("");
            c33297mtm5 = null;
        }
        c33297mtm5.OLrzqt.AEQbTJ.setSelected(z4);
        C33297mtm c33297mtm6 = this.AEQbTJ;
        if (c33297mtm6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33297mtm2 = c33297mtm6;
        }
        c33297mtm2.AEQbTJ.AEQbTJ.setSelected(z5);
    }

    /* JADX INFO: renamed from: o.mvX$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C33388mvX OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C33388mvX c33388mvX) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c33388mvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ(AbstractC33240msi.ActionBar.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.mvX$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C33388mvX EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C33388mvX c33388mvX) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c33388mvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(AbstractC33240msi.Application.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.mvX$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C33388mvX OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C33388mvX c33388mvX) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c33388mvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ(AbstractC33240msi.TaskDescription.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.mvX$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C33388mvX OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C33388mvX c33388mvX) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c33388mvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.os.Bundle arguments = this.OLrzqt.getArguments();
                java.io.Serializable serializable = arguments != null ? arguments.getSerializable("MODE_SWITCH_SOURCE_PARAM") : null;
                ModeSwitchSourceEnum modeSwitchSourceEnum = serializable instanceof ModeSwitchSourceEnum ? (ModeSwitchSourceEnum) serializable : null;
                if (modeSwitchSourceEnum == null) {
                    modeSwitchSourceEnum = ModeSwitchSourceEnum.UNKNOWN;
                }
                java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33210msE.class));
                if (listKWHzl != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : listKWHzl) {
                        if (Intrinsics.EZpvd(C33239msh.copydefault(((InterfaceC33210msE) obj).AEQbTJ()), AbstractC33240msi.LoaderManager.EZpvd)) {
                            arrayList.add(obj);
                        }
                    }
                    InterfaceC33210msE interfaceC33210msE = (InterfaceC33210msE) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                    if (interfaceC33210msE != null && !interfaceC33210msE.copydefault(this.OLrzqt.getActivity(), modeSwitchSourceEnum, "mode_switch")) {
                        this.OLrzqt.dismissAllowingStateLoss();
                        return;
                    }
                }
                this.OLrzqt.AEQbTJ(AbstractC33240msi.LoaderManager.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.mvX$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C33388mvX KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C33388mvX c33388mvX) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c33388mvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(AbstractC33240msi.Activity.OLrzqt);
            }
        }
    }

    public final void AEQbTJ(AbstractC33240msi abstractC33240msi) {
        pUU.KWHzl("ModeSwitch", "switchSubMode: User selected mode=" + abstractC33240msi);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new TradeModeSwitchBottomSheet$switchSubMode$1(abstractC33240msi, this, null), 2, null);
    }

    public final void OLrzqt(AbstractC33240msi abstractC33240msi, final AbstractC33240msi abstractC33240msi2) {
        if (Intrinsics.EZpvd(abstractC33240msi, abstractC33240msi2)) {
            return;
        }
        java.io.Serializable serializable = requireArguments().getSerializable("MODE_SWITCH_SOURCE_PARAM");
        final ModeSwitchSourceEnum modeSwitchSourceEnum = serializable instanceof ModeSwitchSourceEnum ? (ModeSwitchSourceEnum) serializable : null;
        if (modeSwitchSourceEnum == null) {
            modeSwitchSourceEnum = ModeSwitchSourceEnum.UNKNOWN;
        }
        C32866mlf.onEvent$default("LiteHomepage_AppMode_Navigator_Click", (TrackChannel[]) null, new Function1() { // from class: o.mvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33388mvX.copydefault(modeSwitchSourceEnum, abstractC33240msi2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(ModeSwitchSourceEnum modeSwitchSourceEnum, AbstractC33240msi abstractC33240msi, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page", modeSwitchSourceEnum.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, abstractC33240msi.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mvX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C33388mvX copydefault(@NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
            Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
            pUU.EZpvd("ModeSwitch", "newInstance: Creating TradeModeSwitchBottomSheet with source=" + modeSwitchSourceEnum);
            C33388mvX c33388mvX = new C33388mvX();
            c33388mvX.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("MODE_SWITCH_SOURCE_PARAM", modeSwitchSourceEnum)));
            return c33388mvX;
        }
    }
}
