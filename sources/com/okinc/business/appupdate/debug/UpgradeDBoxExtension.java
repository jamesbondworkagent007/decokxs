package com.okinc.business.appupdate.debug;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter;
import com.okinc.business.appupdate.debug.UpgradeDBoxExtension;
import com.okinc.business.appupdate.impl.AppUpdateServiceImplKt;
import com.okinc.business.appupdate.update.AlertContent;
import com.okinc.business.appupdate.update.AppUpdateConfigResp;
import com.okinc.core.util.SPUtils;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.AbstractC43215rlA;
import o.C34703nhO;
import o.C54819xWm;
import o.C55001xbh;
import o.C55008xbo;
import o.C55239xgG;
import o.C55298xhM;
import o.C55328xhq;
import o.ViewOnClickListenerC54939xaY;
import o.mMP;
import o.wXQ;
import o.wXX;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UpgradeDBoxExtension extends AbstractC43215rlA implements mMP {
    private static DebugInterceptor responseInterceptor;
    private int icon;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String versionStr = "";
    private final DebugConfig debugConfig = new DebugConfig(false, false, false, false, false, 31, null);
    private final int group = 1;
    private final int priority = 211;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getGroup() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public String name() {
        return "升级测试(upgrade test)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIcon(int i) {
        this.icon = i;
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.debug.UpgradeDBoxExtension.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTestVersionStr$OKUpgrade_ok_upgrade() {
            String str = UpgradeDBoxExtension.versionStr;
            UpgradeDBoxExtension.versionStr = "";
            return str;
        }

        public final DebugInterceptor getResponseInterceptor() {
            return UpgradeDBoxExtension.responseInterceptor;
        }

        public final void setResponseInterceptor(DebugInterceptor debugInterceptor) {
            UpgradeDBoxExtension.responseInterceptor = debugInterceptor;
        }
    }

    @Override // o.mMP
    public boolean onClick() {
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || !(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
            return true;
        }
        OptionsBottomSheet optionsBottomSheetNewInstance = OptionsBottomSheet.Companion.newInstance(this.debugConfig);
        FragmentManager supportFragmentManager = ((AbstractActivityC33041mov) activityAEQbTJ).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        optionsBottomSheetNewInstance.show(supportFragmentManager);
        return true;
    }

    public static final class DebugConfig {
        public static final int $stable = 8;
        private boolean alwaysShowDialog;
        private boolean forceUpdate;
        private boolean jumpToMiniApp;
        private boolean jumpToWeb;
        private boolean mockResponse;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DebugConfig() {
            this(false, false, false, false, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DebugConfig copy$default(DebugConfig debugConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = debugConfig.forceUpdate;
            }
            if ((i & 2) != 0) {
                z2 = debugConfig.mockResponse;
            }
            boolean z6 = z2;
            if ((i & 4) != 0) {
                z3 = debugConfig.jumpToMiniApp;
            }
            boolean z7 = z3;
            if ((i & 8) != 0) {
                z4 = debugConfig.jumpToWeb;
            }
            boolean z8 = z4;
            if ((i & 16) != 0) {
                z5 = debugConfig.alwaysShowDialog;
            }
            return debugConfig.copy(z, z6, z7, z8, z5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.forceUpdate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.mockResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.jumpToMiniApp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.jumpToWeb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component5() {
            return this.alwaysShowDialog;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DebugConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            return new DebugConfig(z, z2, z3, z4, z5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DebugConfig)) {
                return false;
            }
            DebugConfig debugConfig = (DebugConfig) obj;
            return this.forceUpdate == debugConfig.forceUpdate && this.mockResponse == debugConfig.mockResponse && this.jumpToMiniApp == debugConfig.jumpToMiniApp && this.jumpToWeb == debugConfig.jumpToWeb && this.alwaysShowDialog == debugConfig.alwaysShowDialog;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getAlwaysShowDialog() {
            return this.alwaysShowDialog;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getForceUpdate() {
            return this.forceUpdate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getJumpToMiniApp() {
            return this.jumpToMiniApp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getJumpToWeb() {
            return this.jumpToWeb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getMockResponse() {
            return this.mockResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((Boolean.hashCode(this.forceUpdate) * 31) + Boolean.hashCode(this.mockResponse)) * 31) + Boolean.hashCode(this.jumpToMiniApp)) * 31) + Boolean.hashCode(this.jumpToWeb)) * 31) + Boolean.hashCode(this.alwaysShowDialog);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAlwaysShowDialog(boolean z) {
            this.alwaysShowDialog = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setForceUpdate(boolean z) {
            this.forceUpdate = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setJumpToMiniApp(boolean z) {
            this.jumpToMiniApp = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setJumpToWeb(boolean z) {
            this.jumpToWeb = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMockResponse(boolean z) {
            this.mockResponse = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DebugConfig(forceUpdate=" + this.forceUpdate + ", mockResponse=" + this.mockResponse + ", jumpToMiniApp=" + this.jumpToMiniApp + ", jumpToWeb=" + this.jumpToWeb + ", alwaysShowDialog=" + this.alwaysShowDialog + ")";
        }

        public DebugConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.forceUpdate = z;
            this.mockResponse = z2;
            this.jumpToMiniApp = z3;
            this.jumpToWeb = z4;
            this.alwaysShowDialog = z5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:66) call: com.okinc.business.appupdate.debug.UpgradeDBoxExtension.DebugConfig.<init>(boolean, boolean, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ DebugConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class OptionsBottomSheet extends wXX {
        private DebugConfig debugConfig;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Override // o.wXX
        public void onCreateHeader(@NotNull wXQ wxq) {
            Intrinsics.checkNotNullParameter(wxq, "");
            super.onCreateHeader(wxq);
            wxq.setStyle(0);
        }

        private final void setupConfig(final LinearLayout linearLayout) {
            final DebugConfig debugConfig = this.debugConfig;
            if (debugConfig == null) {
                return;
            }
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
            oKRegularCell.setTitle("Always show upgrade dialog");
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C55239xgG c55239xgG = new C55239xgG(context2, null, 0, 6, null);
            c55239xgG.setChecked(debugConfig.getAlwaysShowDialog());
            c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$2$lambda$1$lambda$0(debugConfig, compoundButton, z);
                }
            });
            oKRegularCell.addView(c55239xgG);
            linearLayout.addView(oKRegularCell);
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            OKRegularCell oKRegularCell2 = new OKRegularCell(context3, null, 0, 6, null);
            oKRegularCell2.setTitle("Force upgrade");
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            C55239xgG c55239xgG2 = new C55239xgG(context4, null, 0, 6, null);
            c55239xgG2.setChecked(debugConfig.getForceUpdate());
            c55239xgG2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$5$lambda$4$lambda$3(debugConfig, compoundButton, z);
                }
            });
            oKRegularCell2.addView(c55239xgG2);
            linearLayout.addView(oKRegularCell2);
            Context context5 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            OKRegularCell oKRegularCell3 = new OKRegularCell(context5, null, 0, 6, null);
            oKRegularCell3.setTitle("Mock response");
            Context context6 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            C55239xgG c55239xgG3 = new C55239xgG(context6, null, 0, 6, null);
            c55239xgG3.setChecked(debugConfig.getMockResponse());
            c55239xgG3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$8$lambda$7$lambda$6(debugConfig, compoundButton, z);
                }
            });
            oKRegularCell3.addView(c55239xgG3);
            linearLayout.addView(oKRegularCell3);
            Context context7 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            OKRegularCell oKRegularCell4 = new OKRegularCell(context7, null, 0, 6, null);
            oKRegularCell4.setTitle("Jump to miniapp");
            Context context8 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            C55239xgG c55239xgG4 = new C55239xgG(context8, null, 0, 6, null);
            c55239xgG4.setChecked(debugConfig.getJumpToMiniApp());
            c55239xgG4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$11$lambda$10$lambda$9(debugConfig, compoundButton, z);
                }
            });
            oKRegularCell4.addView(c55239xgG4);
            linearLayout.addView(oKRegularCell4);
            Context context9 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            OKRegularCell oKRegularCell5 = new OKRegularCell(context9, null, 0, 6, null);
            oKRegularCell5.setTitle("Jump to web");
            Context context10 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            C55239xgG c55239xgG5 = new C55239xgG(context10, null, 0, 6, null);
            c55239xgG5.setChecked(debugConfig.getJumpToWeb());
            c55239xgG5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$14$lambda$13$lambda$12(debugConfig, compoundButton, z);
                }
            });
            oKRegularCell5.addView(c55239xgG5);
            linearLayout.addView(oKRegularCell5);
            Context context11 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            OKRegularCell oKRegularCell6 = new OKRegularCell(context11, null, 0, 6, null);
            oKRegularCell6.setTitle("Test upgrade");
            oKRegularCell6.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$19$lambda$18(linearLayout, view);
                }
            });
            linearLayout.addView(oKRegularCell6);
            Context context12 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            OKRegularCell oKRegularCell7 = new OKRegularCell(context12, null, 0, 6, null);
            oKRegularCell7.setTitle("Clear sp");
            oKRegularCell7.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$21$lambda$20(view);
                }
            });
            linearLayout.addView(oKRegularCell7);
            List<Pair<String, Function0<Unit>>> entries = new DebugItem().getEntries();
            if (entries != null) {
                Iterator<T> it = entries.iterator();
                while (it.hasNext()) {
                    final Pair pair = (Pair) it.next();
                    Context context13 = linearLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context13, "");
                    OKRegularCell oKRegularCell8 = new OKRegularCell(context13, null, 0, 6, null);
                    oKRegularCell8.setTitle((CharSequence) pair.getFirst());
                    oKRegularCell8.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda7
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$24$lambda$23$lambda$22(pair, view);
                        }
                    });
                    linearLayout.addView(oKRegularCell8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$2$lambda$1$lambda$0(DebugConfig debugConfig, CompoundButton compoundButton, boolean z) {
            debugConfig.setAlwaysShowDialog(z);
            UpgradeDBoxExtension.Companion.setResponseInterceptor(new DebugInterceptor(debugConfig));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$5$lambda$4$lambda$3(DebugConfig debugConfig, CompoundButton compoundButton, boolean z) {
            debugConfig.setForceUpdate(z);
            UpgradeDBoxExtension.Companion.setResponseInterceptor(new DebugInterceptor(debugConfig));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$8$lambda$7$lambda$6(DebugConfig debugConfig, CompoundButton compoundButton, boolean z) {
            debugConfig.setMockResponse(z);
            UpgradeDBoxExtension.Companion.setResponseInterceptor(new DebugInterceptor(debugConfig));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$11$lambda$10$lambda$9(DebugConfig debugConfig, CompoundButton compoundButton, boolean z) {
            debugConfig.setJumpToMiniApp(z);
            UpgradeDBoxExtension.Companion.setResponseInterceptor(new DebugInterceptor(debugConfig));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$14$lambda$13$lambda$12(DebugConfig debugConfig, CompoundButton compoundButton, boolean z) {
            debugConfig.setJumpToWeb(z);
            UpgradeDBoxExtension.Companion.setResponseInterceptor(new DebugInterceptor(debugConfig));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$19$lambda$18(final LinearLayout linearLayout, View view) {
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle("fill target version");
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            final C55008xbo c55008xbo = new C55008xbo(context2, null, 0, 6, null);
            C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setInputType(16);
            }
            c55008xbo.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, C55298xhM.dpInt$default(30, (Context) null, 1, (Object) null)));
            viewOnClickListenerC54939xaY.EZpvd(c55008xbo);
            C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setText("6.140.0");
                c55001xbhAkhnZx2.requestFocus();
            }
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "upgrade", new View.OnClickListener() { // from class: com.okinc.business.appupdate.debug.UpgradeDBoxExtension$OptionsBottomSheet$$ExternalSyntheticLambda8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    UpgradeDBoxExtension.OptionsBottomSheet.setupConfig$lambda$19$lambda$18$lambda$17$lambda$16(c55008xbo, linearLayout, viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$19$lambda$18$lambda$17$lambda$16(C55008xbo c55008xbo, LinearLayout linearLayout, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
            Companion companion = UpgradeDBoxExtension.Companion;
            C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
            UpgradeDBoxExtension.versionStr = String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null);
            Context context = linearLayout.getContext();
            if (context instanceof AbstractActivityC33041mov) {
                AppUpdateServiceImplKt.getAppUpdateService().checkUpdate((AbstractActivityC33041mov) context, false);
            }
            viewOnClickListenerC54939xaY.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$21$lambda$20(View view) {
            SPUtils.remove(AppUpdateConfigResp.UPDATE_SHOW_KEY);
            OKUpgradeAdapter.Companion.clearUpgradePopedFlag();
            C55328xhq.show$default(C55328xhq.OLrzqt, "Deleted", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setupConfig$lambda$24$lambda$23$lambda$22(Pair pair, View view) {
            ((Function0) pair.getSecond()).invoke();
        }

        @Override // o.wXX
        public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            super.onCreateContent(constraintLayout);
            LinearLayout linearLayout = new LinearLayout(constraintLayout.getContext());
            linearLayout.setOrientation(1);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            Unit unit = Unit.INSTANCE;
            constraintLayout.addView(linearLayout, layoutParams);
            setupConfig(linearLayout);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.debug.UpgradeDBoxExtension.OptionsBottomSheet.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final OptionsBottomSheet newInstance(@NotNull DebugConfig debugConfig) {
                Intrinsics.checkNotNullParameter(debugConfig, "");
                OptionsBottomSheet optionsBottomSheet = new OptionsBottomSheet();
                optionsBottomSheet.debugConfig = debugConfig;
                return optionsBottomSheet;
            }
        }
    }

    public static class DebugInterceptor implements ResponseInterceptor {
        public static final int $stable = 8;
        private final DebugConfig debugConfig;
        private final List<String> mockMessages;
        private final List<String> mockTitles;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DebugConfig getDebugConfig() {
            return this.debugConfig;
        }

        public DebugInterceptor(@NotNull DebugConfig debugConfig) {
            Intrinsics.checkNotNullParameter(debugConfig, "");
            this.debugConfig = debugConfig;
            this.mockTitles = yDY.gEmmrt("Sniper bots", "Smart account", "Sniper bots Sniper bots Sniper bots", "Smart account Smart account", "Smart account", "Sniper bots Sniper bots Sniper bots Sniper bots Sniper bots");
            this.mockMessages = yDY.gEmmrt("Dip Snipper and Peak Sniper trading bots now support Advance buying", "Now available in OKX Wallet!", "Dip Snipper and Peak Sniper trading bots now support Advance buying", "Now available in OKX Wallet!", "Dip Snipper and Peak Sniper trading bots now support Advance buying, Dip Snipper and Peak Sniper trading bots now support Advance buying, Dip Snipper and Peak Sniper trading bots now support Advance buying", "Now available in OKX Wallet!", "Dip Snipper and Peak Sniper trading bots now support Advance buying", "Now available in OKX Wallet!", "Dip Snipper and Peak Sniper trading bots now support Advance buying, Dip Snipper and Peak Sniper trading bots now support Advance buying, Dip Snipper and Peak Sniper trading bots now support Advance buying", "Now available in OKX Wallet!");
        }

        @Override // com.okinc.business.appupdate.debug.ResponseInterceptor
        public AppUpdateConfigResp intercept(@NotNull AppUpdateConfigResp appUpdateConfigResp) {
            AppUpdateConfigResp appUpdateConfigResp2;
            int mode;
            String additionalUrl;
            Intrinsics.checkNotNullParameter(appUpdateConfigResp, "");
            if (this.debugConfig.getMockResponse()) {
                appUpdateConfigResp2 = new AppUpdateConfigResp();
                appUpdateConfigResp2.setApkMD5(appUpdateConfigResp.getApkMD5());
                appUpdateConfigResp2.setLatestVersion(appUpdateConfigResp.getLatestVersion());
                appUpdateConfigResp2.setVersionIsLatest("0");
                appUpdateConfigResp2.setUpgradeType("1");
                AlertContent alertContent = appUpdateConfigResp.getAlertContent();
                if (alertContent == null) {
                    alertContent = new AlertContent((String) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
                }
                appUpdateConfigResp2.setAlertContent(AlertContent.copy$default(alertContent, null, null, this.mockMessages, this.mockTitles, 3, null));
                appUpdateConfigResp2.setUpgradeTypeDetail(appUpdateConfigResp.getUpgradeTypeDetail());
            } else {
                appUpdateConfigResp2 = appUpdateConfigResp;
            }
            AppUpdateConfigResp appUpdateConfigResp3 = new AppUpdateConfigResp();
            appUpdateConfigResp3.setApkMD5(appUpdateConfigResp2.getApkMD5());
            appUpdateConfigResp3.setLatestVersion(appUpdateConfigResp2.getLatestVersion());
            appUpdateConfigResp3.setVersionIsLatest(appUpdateConfigResp2.getVersionIsLatest());
            appUpdateConfigResp3.setUpgradeType(this.debugConfig.getForceUpdate() ? "2" : appUpdateConfigResp2.getUpgradeType());
            appUpdateConfigResp3.setAlertContent(appUpdateConfigResp2.getAlertContent());
            appUpdateConfigResp3.setUpgradeTypeDetail(appUpdateConfigResp2.getUpgradeTypeDetail());
            if (this.debugConfig.getJumpToMiniApp()) {
                mode = 1;
            } else {
                mode = this.debugConfig.getJumpToWeb() ? 2 : appUpdateConfigResp2.getMode();
            }
            appUpdateConfigResp3.setMode(mode);
            if (this.debugConfig.getJumpToMiniApp()) {
                additionalUrl = "app/miniapp?appid=upgrade&pageurl=%2Fhome";
            } else if (this.debugConfig.getJumpToWeb()) {
                additionalUrl = C34703nhO.copydefault() ? "https://web3.okx.com/download" : "https://www.okx.com/download";
            } else {
                additionalUrl = appUpdateConfigResp2.getAdditionalUrl();
            }
            appUpdateConfigResp3.setAdditionalUrl(additionalUrl);
            return appUpdateConfigResp3;
        }
    }
}
