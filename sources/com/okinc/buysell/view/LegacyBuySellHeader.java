package com.okinc.buysell.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.buysell.view.LegacyBuySellHeader;
import com.okinc.okx.paymentapi.service.SupportBanner;
import com.okinc.web.WebActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31554lwH;
import o.AbstractC43238rlX;
import o.C30342lUv;
import o.C31351lsQ;
import o.C33070mpX;
import o.C35334ntP;
import o.C43251rlk;
import o.C52761wXj;
import o.C55249xgQ;
import o.C56390yDp;
import o.C56444yFp;
import o.InterfaceC43294rma;
import o.InterfaceC56445yFq;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class LegacyBuySellHeader extends ConstraintLayout {
    public AbstractC31554lwH AEQbTJ;
    public int EZpvd;
    public final List<BuySellTab> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyBuySellHeader(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyBuySellHeader(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC31554lwH OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBinding(@NotNull AbstractC31554lwH abstractC31554lwH) {
        Intrinsics.checkNotNullParameter(abstractC31554lwH, "");
        this.AEQbTJ = abstractC31554lwH;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:34) call: com.okinc.buysell.view.LegacyBuySellHeader.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ LegacyBuySellHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyBuySellHeader(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = yDY.gEmmrt(BuySellTab.BUY, BuySellTab.SELL);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31351lsQ.LoaderManager.copydefault);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.EZpvd = typedArrayObtainStyledAttributes.getResourceId(C31351lsQ.LoaderManager.OLrzqt, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        AbstractC31554lwH abstractC31554lwHAEQbTJ = AbstractC31554lwH.AEQbTJ(LayoutInflater.from(context), this, true);
        this.AEQbTJ = abstractC31554lwHAEQbTJ;
        int i2 = this.EZpvd;
        if (i2 != 0) {
            abstractC31554lwHAEQbTJ.gEmmrt.setTextAppearance(i2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class BuySellTab {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BuySellTab[] $VALUES;
        public static final BuySellTab BUY = new BuySellTab("BUY", 0, C33070mpX.AYXKKw(C31351lsQ.Activity.hBpjJd));
        public static final BuySellTab SELL = new BuySellTab("SELL", 1, C33070mpX.AYXKKw(C31351lsQ.Activity.dHguZz));
        private final String tabName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BuySellTab[] $values() {
            return new BuySellTab[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BuySellTab> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTabName() {
            return this.tabName;
        }

        private BuySellTab(String str, int i, String str2) {
            this.tabName = str2;
        }

        static {
            BuySellTab[] buySellTabArr$values = $values();
            $VALUES = buySellTabArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(buySellTabArr$values);
        }

        public static BuySellTab valueOf(String str) {
            return (BuySellTab) Enum.valueOf(BuySellTab.class, str);
        }

        public static BuySellTab[] values() {
            return (BuySellTab[]) $VALUES.clone();
        }
    }

    public final void setTitle(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.lUq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                LegacyBuySellHeader.setTitle$lambda$1(this.AEQbTJ, str);
            }
        });
    }

    public static final void setTitle$lambda$1(LegacyBuySellHeader legacyBuySellHeader, String str) {
        legacyBuySellHeader.AEQbTJ.gEmmrt.setText(str);
    }

    public final void setBuySellTab(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        C55249xgQ c55249xgQ = this.AEQbTJ.AYXKKw;
        Iterator<BuySellTab> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            c55249xgQ.addTab(c55249xgQ.newTab().setText(it.next().getTabName()));
        }
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar(function0, function02));
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar(Function0<Unit> function0, Function0<Unit> function02) {
            this.EZpvd = function0;
            this.KWHzl = function02;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Integer numValueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.EZpvd.invoke();
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                this.KWHzl.invoke();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Integer numValueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                this.EZpvd.invoke();
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                this.KWHzl.invoke();
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ List<SupportBanner> AEQbTJ;
        public final /* synthetic */ Function0<Unit> AYXKKw;
        public final /* synthetic */ Function1<Boolean, Unit> AhwBna;
        public final /* synthetic */ Function1<List<SupportBanner>, Unit> EZpvd;
        public final /* synthetic */ List<SupportBanner> KWHzl;
        public final /* synthetic */ Function1<Integer, Unit> OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ LegacyBuySellHeader djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.okx.paymentapi.service.SupportBanner>, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(int i, List<SupportBanner> list, List<SupportBanner> list2, Function1<? super Integer, Unit> function1, LegacyBuySellHeader legacyBuySellHeader, Function1<? super List<SupportBanner>, Unit> function12, Function0<Unit> function0, Function1<? super Boolean, Unit> function13) {
            this.copydefault = i;
            this.KWHzl = list;
            this.AEQbTJ = list2;
            this.OLrzqt = function1;
            this.djBIcL = legacyBuySellHeader;
            this.EZpvd = function12;
            this.AYXKKw = function0;
            this.AhwBna = function13;
        }

        /* JADX INFO: renamed from: com.okinc.buysell.view.LegacyBuySellHeader$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ Function1<List<SupportBanner>, Unit> AEQbTJ;
            public final /* synthetic */ LegacyBuySellHeader AhwBna;
            public final /* synthetic */ Function0<Unit> EZpvd;
            public final /* synthetic */ Function1<Integer, Unit> KWHzl;
            public final /* synthetic */ List<SupportBanner> OLrzqt;
            public final /* synthetic */ List<SupportBanner> copydefault;
            public final /* synthetic */ Function1<Boolean, Unit> valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.okx.paymentapi.service.SupportBanner>, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(List<SupportBanner> list, List<SupportBanner> list2, Function1<? super Integer, Unit> function1, LegacyBuySellHeader legacyBuySellHeader, Function1<? super List<SupportBanner>, Unit> function12, Function0<Unit> function0, Function1<? super Boolean, Unit> function13) {
                this.copydefault = list;
                this.OLrzqt = list2;
                this.KWHzl = function1;
                this.AhwBna = legacyBuySellHeader;
                this.AEQbTJ = function12;
                this.EZpvd = function0;
                this.valueOf = function13;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Composer composer, Integer num) {
                AEQbTJ(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1176372290, i, -1, "com.okinc.buysell.view.LegacyBuySellHeader.showAnnouncementPill.<anonymous>.<anonymous> (LegacyBuySellHeader.kt:175)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                    List<SupportBanner> list = this.copydefault;
                    List<SupportBanner> list2 = this.OLrzqt;
                    final Function1<Integer, Unit> function1 = this.KWHzl;
                    final LegacyBuySellHeader legacyBuySellHeader = this.AhwBna;
                    Function1<List<SupportBanner>, Unit> function12 = this.AEQbTJ;
                    Function0<Unit> function0 = this.EZpvd;
                    Function1<Boolean, Unit> function13 = this.valueOf;
                    composer.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(1186659897);
                    boolean zChanged = composer.changed(function1);
                    boolean zChangedInstance = composer.changedInstance(legacyBuySellHeader);
                    Object objRememberedValue = composer.rememberedValue();
                    if ((zChanged | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function2() { // from class: o.lUw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return LegacyBuySellHeader.Activity.AnonymousClass1.EZpvd(function1, legacyBuySellHeader, (java.lang.String) obj, (java.lang.Integer) obj2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    C30342lUv.AEQbTJ(list, list2, (Function2) objRememberedValue, function12, function0, function13, composer, 0);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            public static final Unit EZpvd(Function1 function1, LegacyBuySellHeader legacyBuySellHeader, String str, Integer num) {
                function1.invoke(num);
                if (str != null) {
                    legacyBuySellHeader.EZpvd(str);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-747644995, i, -1, "com.okinc.buysell.view.LegacyBuySellHeader.showAnnouncementPill.<anonymous> (LegacyBuySellHeader.kt:174)");
                }
                SurfaceKt.m1994SurfaceT9BRK9s(null, null, ColorResources_androidKt.colorResource(this.copydefault, composer, 0), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1176372290, true, new AnonymousClass1(this.KWHzl, this.AEQbTJ, this.OLrzqt, this.djBIcL, this.EZpvd, this.AYXKKw, this.AhwBna)), composer, 12582912, 123);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public final void AEQbTJ(int i, List<SupportBanner> list, @NotNull List<SupportBanner> list2, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super List<SupportBanner>, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function1<? super Boolean, Unit> function13) {
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.AEQbTJ.OLrzqt.setVisibility(0);
        this.AEQbTJ.OLrzqt.setContent(ComposableLambdaKt.composableLambdaInstance(-747644995, true, new Activity(i, list, list2, function1, this, function12, function0, function13)));
    }

    public final void KWHzl() {
        this.AEQbTJ.OLrzqt.setVisibility(8);
    }

    public final void EZpvd(String str) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        if (interfaceC43294rma.values(str)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            interfaceC43294rma.KWHzl(C35334ntP.KWHzl(context), str, interfaceC43294rma.fetchVPNInfo(str), new Function1() { // from class: o.lUo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LegacyBuySellHeader.EZpvd((AbstractC43238rlX) obj);
                }
            });
        } else {
            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("special", Boolean.TRUE));
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, C35334ntP.KWHzl(context2), bundleBundleOf, null, 4, null);
        }
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.view.LegacyBuySellHeader */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setBackAction$default(LegacyBuySellHeader legacyBuySellHeader, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBackAction");
        }
        if ((i2 & 1) != 0) {
            i = C52761wXj.TaskDescription.DxnCrt;
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        legacyBuySellHeader.setBackAction(i, function0);
    }

    public final void setBackAction(@DrawableRes int i, final Function0<Unit> function0) {
        this.AEQbTJ.valueOf.setImageResource(i);
        this.AEQbTJ.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                LegacyBuySellHeader.setBackAction$lambda$8(function0, view);
            }
        });
    }

    public static final void setBackAction$lambda$8(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.view.LegacyBuySellHeader */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addActionIcon$default(LegacyBuySellHeader legacyBuySellHeader, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addActionIcon");
        }
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        legacyBuySellHeader.copydefault(i, (Function0<Unit>) function0);
    }

    public final void copydefault(@DrawableRes int i, Function0<Unit> function0) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(i);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        imageView.setBackground(getResources().getDrawable(typedValue.resourceId, getContext().getTheme()));
        imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.DeEinT)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(C31351lsQ.StateListAnimator.copydefault), getResources().getDimensionPixelSize(C31351lsQ.StateListAnimator.copydefault));
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(C31351lsQ.StateListAnimator.OLrzqt));
        layoutParams.setMarginEnd(getResources().getDimensionPixelSize(C31351lsQ.StateListAnimator.OLrzqt));
        imageView.setLayoutParams(layoutParams);
        EZpvd(imageView, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.view.LegacyBuySellHeader */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addActionView$default(LegacyBuySellHeader legacyBuySellHeader, View view, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addActionView");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        legacyBuySellHeader.EZpvd(view, (Function0<Unit>) function0);
    }

    public final void EZpvd(@NotNull final View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.lUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                LegacyBuySellHeader.EZpvd(function0, view2);
            }
        });
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.lUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                LegacyBuySellHeader.OLrzqt(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void OLrzqt(LegacyBuySellHeader legacyBuySellHeader, View view) {
        legacyBuySellHeader.AEQbTJ.EZpvd.addView(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.view.LegacyBuySellHeader */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replaceActionView$default(LegacyBuySellHeader legacyBuySellHeader, View view, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceActionView");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        legacyBuySellHeader.OLrzqt(view, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull final View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.lUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                LegacyBuySellHeader.AEQbTJ(function0, view2);
            }
        });
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.lUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                LegacyBuySellHeader.copydefault(this.KWHzl, view);
            }
        });
    }

    public static final void AEQbTJ(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void copydefault(LegacyBuySellHeader legacyBuySellHeader, View view) {
        legacyBuySellHeader.AEQbTJ.EZpvd.removeAllViews();
        legacyBuySellHeader.AEQbTJ.EZpvd.addView(view);
    }
}
