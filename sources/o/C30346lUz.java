package o;

import android.view.View;
import android.view.WindowManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.content.res.ResourcesCompat;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.buysell.view.banner.BannerPopUpKt$startDismissWithExitAnimation$1;
import com.okinc.okx.paymentapi.service.SupportBanner;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import o.C30346lUz;
import o.C31351lsQ;
import o.C32113mPz;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.lUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30346lUz {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(SupportBanner supportBanner, Function2 function2, int i, Composer composer, int i2) {
        OLrzqt(supportBanner, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.util.List list, long j, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        AEQbTJ(list, j, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, java.util.List list, Function2 function2, int i, Composer composer, int i2) {
        KWHzl(modifier, list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Function1 function1, int i, Composer composer, int i2) {
        OLrzqt((Function1<? super java.lang.Boolean, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.util.List<SupportBanner> list, final long j, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2017154185);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2017154185, i2, -1, "com.okinc.buysell.view.banner.BannerPopUp (BannerPopUp.kt:60)");
            }
            composerStartRestartGroup.startReplaceableGroup(347585114);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.lUE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C30346lUz.copydefault();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(false, false, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1792268736, true, new Activity(j, list, function2, function0)), composerStartRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.lUI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C30346lUz.EZpvd(list, j, function0, function2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.lUz$Activity */
    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.util.List<SupportBanner> AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0<Unit> OLrzqt;
        public final /* synthetic */ Function2<java.lang.String, java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(long j, java.util.List<SupportBanner> list, Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, Function0<Unit> function0) {
            this.KWHzl = j;
            this.AEQbTJ = list;
            this.copydefault = function2;
            this.OLrzqt = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1792268736, i, -1, "com.okinc.buysell.view.banner.BannerPopUp.<anonymous> (BannerPopUp.kt:73)");
                }
                float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.UeEOUB, composer, 0);
                android.view.ViewParent parent = ((android.view.View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getParent();
                Intrinsics.copydefault(parent, "");
                DialogWindowProvider dialogWindowProvider = (DialogWindowProvider) parent;
                long j = this.KWHzl;
                dialogWindowProvider.getWindow().setGravity(48);
                android.view.Window window = dialogWindowProvider.getWindow();
                WindowManager.LayoutParams attributes = dialogWindowProvider.getWindow().getAttributes();
                attributes.y = C55298xhM.dpInt$default(Offset.m2911getYimpl(j), (android.content.Context) null, 1, (java.lang.Object) null) + C55298xhM.dpInt$default(fDimensionResource, (android.content.Context) null, 1, (java.lang.Object) null);
                window.setAttributes(attributes);
                SurfaceKt.m1994SurfaceT9BRK9s(PaddingKt.m671padding3ABfNKs(SizeKt.m722sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl((float) (((double) ((android.content.res.Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) * 0.75d)), 7, null), fDimensionResource), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.fvQaOB, composer, 0)), 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1377693061, true, new AnonymousClass5(this.AEQbTJ, this.copydefault, this.OLrzqt)), composer, 12582912, 124);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: renamed from: o.lUz$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5 implements Function2<Composer, java.lang.Integer, Unit> {
            public final /* synthetic */ java.util.List<SupportBanner> AEQbTJ;
            public final /* synthetic */ Function0<Unit> EZpvd;
            public final /* synthetic */ Function2<java.lang.String, java.lang.Integer, Unit> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass5(java.util.List<SupportBanner> list, Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, Function0<Unit> function0) {
                this.AEQbTJ = list;
                this.copydefault = function2;
                this.EZpvd = function0;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
                EZpvd(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void EZpvd(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1377693061, i, -1, "com.okinc.buysell.view.banner.BannerPopUp.<anonymous>.<anonymous> (BannerPopUp.kt:105)");
                    }
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    java.util.List<SupportBanner> list = this.AEQbTJ;
                    Function2<java.lang.String, java.lang.Integer, Unit> function2 = this.copydefault;
                    final Function0<Unit> function0 = this.EZpvd;
                    composer.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composer, 6);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    C30346lUz.KWHzl(PaddingKt.m675paddingqDBjuR0$default(ColumnScopeInstance.INSTANCE.weight(BackgroundKt.m350backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(C52761wXj.Activity.dHguZz, composer, 0), null, 2, null), 1.0f, false), 0.0f, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.giSNqX, composer, 0), 0.0f, 0.0f, 13, null), list, function2, composer, 0);
                    composer.startReplaceableGroup(697380958);
                    boolean zChanged = composer.changed(function0);
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.lUO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C30346lUz.Activity.AnonymousClass5.EZpvd(function0, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceableGroup();
                    C30346lUz.OLrzqt((Function1<? super java.lang.Boolean, Unit>) objRememberedValue, composer, 0);
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

            public static final Unit EZpvd(Function0 function0, boolean z) {
                function0.invoke();
                return Unit.INSTANCE;
            }
        }
    }

    public static final void KWHzl(@NotNull final Modifier modifier, @NotNull final java.util.List<SupportBanner> list, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-605348756);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-605348756, i2, -1, "com.okinc.buysell.view.banner.BannersList (BannerPopUp.kt:132)");
            }
            composerStartRestartGroup.startReplaceableGroup(337934932);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            boolean z = (i2 & FaceDetector.NUM_BOXES) == 256;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.lUK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30346lUz.EZpvd(list, function2, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, i2 & 14, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.lUL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C30346lUz.OLrzqt(modifier, list, function2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OLrzqt(@NotNull final Function1<? super java.lang.Boolean, Unit> function1, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1879201986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1879201986, i2, -1, "com.okinc.buysell.view.banner.AckButton (BannerPopUp.kt:150)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m671padding3ABfNKs(BackgroundKt.m350backgroundbw27NRU$default(Modifier.Companion, ColorResources_androidKt.colorResource(C52761wXj.Activity.dHguZz, composerStartRestartGroup, 0), null, 2, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.fFgQHt, composerStartRestartGroup, 0)), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1774469910);
            boolean z = (i2 & 14) == 4;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.lUJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30346lUz.OLrzqt(function1, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierFillMaxWidth$default, null, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.lUM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C30346lUz.copydefault(function1, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final C52794wYp OLrzqt(final Function1 function1, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setText(C33069mpW.KWHzl(context, C31351lsQ.Activity.getPostValueLengthLimit, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.KWHzl()));
        c52794wYp.setOKDSSize(44);
        c52794wYp.setOKDSPill(-1);
        c52794wYp.setOKDSType(257);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30346lUz.EZpvd(function1, view);
            }
        });
        c52794wYp.setGravity(1);
        c52794wYp.setContentDescription("paymentBannerPopupDismissButton");
        return c52794wYp;
    }

    public static final void EZpvd(Function1 function1, android.view.View view) {
        function1.invoke(java.lang.Boolean.FALSE);
    }

    public static final void OLrzqt(@NotNull final SupportBanner supportBanner, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(supportBanner, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-695708197);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(supportBanner) : composerStartRestartGroup.changedInstance(supportBanner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-695708197, i2, -1, "com.okinc.buysell.view.banner.BannerRow (BannerPopUp.kt:173)");
            }
            composerStartRestartGroup.startReplaceableGroup(1508576381);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(supportBanner));
            boolean z2 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.lUG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30346lUz.OLrzqt(supportBanner, function2, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, null, null, composerStartRestartGroup, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.lUF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C30346lUz.AEQbTJ(supportBanner, function2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final OKAlertBanner OLrzqt(final SupportBanner supportBanner, final Function2 function2, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OKAlertBanner oKAlertBanner = new OKAlertBanner(context, null, 0, 6, null);
        int dimension = (int) context.getResources().getDimension(C52761wXj.StateListAnimator.UeEOUB);
        oKAlertBanner.setPadding(dimension, dimension, dimension, dimension);
        android.widget.TextView textViewKWHzl = oKAlertBanner.KWHzl();
        oKAlertBanner.setMessage(new android.text.SpannableString(supportBanner.getContent()));
        textViewKWHzl.setTextAppearance(C52761wXj.LoaderManager.EZpvd);
        textViewKWHzl.setTextColor(context.getColor(C52761wXj.Activity.Dmq));
        oKAlertBanner.setType(4);
        oKAlertBanner.setBackgroundColor(context.getColor(C52761wXj.Activity.dHguZz));
        android.widget.ImageView imageViewAhwBna = oKAlertBanner.AhwBna();
        imageViewAhwBna.getDrawable();
        imageViewAhwBna.setImageDrawable(ResourcesCompat.getDrawable(imageViewAhwBna.getResources(), C33492mxV.OLrzqt() ? C31351lsQ.TaskDescription.KWHzl : C31351lsQ.TaskDescription.OLrzqt, null));
        oKAlertBanner.setPrimaryAction(supportBanner.getUrlDisplayLabel(), new Function0() { // from class: o.lUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30346lUz.copydefault(function2, supportBanner);
            }
        });
        return oKAlertBanner;
    }

    public static final Unit copydefault(Function2 function2, SupportBanner supportBanner) {
        function2.invoke(supportBanner.getUrl(), supportBanner.getBannerId());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull MutableState<java.lang.Boolean> mutableState, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BannerPopUpKt$startDismissWithExitAnimation$1 bannerPopUpKt$startDismissWithExitAnimation$1;
        if (continuation instanceof BannerPopUpKt$startDismissWithExitAnimation$1) {
            bannerPopUpKt$startDismissWithExitAnimation$1 = (BannerPopUpKt$startDismissWithExitAnimation$1) continuation;
            int i = bannerPopUpKt$startDismissWithExitAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bannerPopUpKt$startDismissWithExitAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                bannerPopUpKt$startDismissWithExitAnimation$1 = new BannerPopUpKt$startDismissWithExitAnimation$1(continuation);
            }
        }
        java.lang.Object obj = bannerPopUpKt$startDismissWithExitAnimation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bannerPopUpKt$startDismissWithExitAnimation$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutableState.setValue(C56443yFo.KWHzl(false));
            bannerPopUpKt$startDismissWithExitAnimation$1.L$0 = function0;
            bannerPopUpKt$startDismissWithExitAnimation$1.label = 1;
            if (DelayKt.delay(300L, bannerPopUpKt$startDismissWithExitAnimation$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) bannerPopUpKt$startDismissWithExitAnimation$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final java.util.List list, final Function2 function2, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        lazyListScope.items(list.size(), null, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.buysell.view.banner.BannerPopUpKt$BannersList$lambda$5$lambda$4$$inlined$itemsIndexed$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.buysell.view.banner.BannerPopUpKt$BannersList$lambda$5$lambda$4$$inlined$itemsIndexed$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(lazyItemScope, "");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                }
                SupportBanner supportBanner = (SupportBanner) list.get(i);
                composer.startReplaceableGroup(-93121951);
                C30346lUz.OLrzqt(supportBanner, function2, composer, SupportBanner.$stable);
                composer.startReplaceableGroup(-3002632);
                if (i != list.size() - 1) {
                    DividerKt.m1696Divider9IZ8Weo(PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.fFgQHt, composer, 0), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(C32113mPz.StateListAnimator.djBIcL, composer, 0), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composer, 0), composer, 0, 0);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
