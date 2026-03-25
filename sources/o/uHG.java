package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$1;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48195uIm;
import o.C52761wXj;
import o.C55688xof;
import o.uHG;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class uHG {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, java.lang.String str, java.lang.String str2, int i, int i2, Composer composer, int i3) {
        OLrzqt(modifier, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, InterfaceC48173uHr interfaceC48173uHr, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        EZpvd(modifier, interfaceC48173uHr, (Function1<? super InterfaceC48173uHr, Unit>) function1, (Function1<? super InterfaceC48173uHr, Unit>) function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, boolean z, int i, Composer composer, int i2) {
        EZpvd(str, str2, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(InterfaceC48173uHr interfaceC48173uHr, int i, Composer composer, int i2) {
        copydefault(interfaceC48173uHr, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, int i2, Composer composer, int i3) {
        EZpvd(modifier, str, str2, str3, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Modifier modifier, @NotNull final InterfaceC48173uHr interfaceC48173uHr, @NotNull final Function1<? super InterfaceC48173uHr, Unit> function1, @NotNull final Function1<? super InterfaceC48173uHr, Unit> function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier.Companion companion;
        boolean z;
        Intrinsics.checkNotNullParameter(interfaceC48173uHr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1295251882);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(interfaceC48173uHr) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1295251882, i5, -1, "com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposable (BotDetailParameterComposable.kt:72)");
            }
            androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i5 >> 6) & 14);
            float f = 12;
            Modifier modifierM672paddingVpY3zN4 = PaddingKt.m672paddingVpY3zN4(KWHzl(SizeKt.m705heightInVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), androidx.compose.ui.unit.Dp.Companion.m5434getUnspecifiedD9Ej5fM(), androidx.compose.ui.unit.Dp.m5414constructorimpl(1000)), composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), androidx.compose.ui.unit.Dp.m5414constructorimpl(f));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM672paddingVpY3zN4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion2.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            modifier3 = modifier4;
            C48183uIa.EZpvd(RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), C52761wXj.LoaderManager.gHZMYf, interfaceC48173uHr.EZpvd(), interfaceC48173uHr.KWHzl(), interfaceC48173uHr.AkhnZx(), interfaceC48173uHr.gEmmrt(), interfaceC48173uHr.djBIcL(), interfaceC48173uHr.OLrzqt(), composerStartRestartGroup, 0, 0);
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, interfaceC48173uHr.fARcdN(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (java.lang.String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2036514632, true, new TaskDescription(interfaceC48173uHr, stateRememberUpdatedState)), composerStartRestartGroup, 1572870, 30);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            copydefault(interfaceC48173uHr, composerStartRestartGroup, (i5 >> 3) & 14);
            composerStartRestartGroup.startReplaceableGroup(-615562904);
            if (interfaceC48173uHr.AuCTel() || interfaceC48173uHr.fIwbmz()) {
                companion = companion4;
                z = false;
                DividerKt.m1696Divider9IZ8Weo(PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(16), 0.0f, 0.0f, 13, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.sZqaRl, composerStartRestartGroup, 0), composerStartRestartGroup, 54, 0);
            } else {
                companion = companion4;
                z = false;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-615549650);
            if (interfaceC48173uHr.AuCTel()) {
                Modifier modifierAlign = columnScopeInstance.align(PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null), companion2.getCenterHorizontally());
                composerStartRestartGroup.startReplaceableGroup(-615542761);
                boolean z2 = (i5 & 7168) == 2048 ? true : z;
                if ((i5 & WalletImportError.ERROR_CODE_AA_EXIST) == 32) {
                    z = true;
                }
                java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if ((z2 | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.uHV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uHG.KWHzl(function12, interfaceC48173uHr, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierAlign, null, composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-615516902);
            if (interfaceC48173uHr.fIwbmz()) {
                OLrzqt(PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(16), 0.0f, 0.0f, 13, null), interfaceC48173uHr.iwGUEr(), C50964veA.KWHzl(interfaceC48173uHr.uzCIH()), composerStartRestartGroup, 6, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uHG.EZpvd(modifier5, interfaceC48173uHr, function1, function12, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class TaskDescription implements yHO<AnimatedVisibilityScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ InterfaceC48173uHr AEQbTJ;
        public final /* synthetic */ androidx.compose.runtime.State<Function1<InterfaceC48173uHr, Unit>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super o.uHr, kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(InterfaceC48173uHr interfaceC48173uHr, androidx.compose.runtime.State<? extends Function1<? super InterfaceC48173uHr, Unit>> state) {
            this.AEQbTJ = interfaceC48173uHr;
            this.KWHzl = state;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2036514632, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposable.<anonymous>.<anonymous>.<anonymous> (BotDetailParameterComposable.kt:98)");
            }
            java.lang.String strDjBIcL = this.AEQbTJ.djBIcL();
            java.lang.String strGEmmrt = this.AEQbTJ.gEmmrt();
            java.lang.String strValueOf = this.AEQbTJ.valueOf();
            composer.startReplaceableGroup(1972011479);
            boolean zChanged = composer.changed(this.KWHzl);
            boolean zChanged2 = composer.changed(this.AEQbTJ);
            final androidx.compose.runtime.State<Function1<InterfaceC48173uHr, Unit>> state = this.KWHzl;
            final InterfaceC48173uHr interfaceC48173uHr = this.AEQbTJ;
            java.lang.Object objRememberedValue = composer.rememberedValue();
            if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.uHZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return uHG.TaskDescription.AEQbTJ(state, interfaceC48173uHr);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            uHG.EZpvd((Modifier) null, strDjBIcL, strGEmmrt, strValueOf, (Function0<Unit>) objRememberedValue, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final Unit AEQbTJ(androidx.compose.runtime.State state, InterfaceC48173uHr interfaceC48173uHr) {
            ((Function1) state.getValue()).invoke(interfaceC48173uHr);
            return Unit.INSTANCE;
        }
    }

    public static final wYE KWHzl(Function1 function1, InterfaceC48173uHr interfaceC48173uHr, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        wYE wye = new wYE(context, null, 0, 6, null);
        wye.setText(C55688xof.Application.setMediaTypeactivity_release);
        wye.setSize(-4);
        wye.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.EZpvd(C52761wXj.TaskDescription.onStatusChanged, context), (android.graphics.drawable.Drawable) null);
        android.content.Context context2 = wye.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        wye.setCompoundDrawablePadding(C55298xhM.copydefault(3.0f, context2));
        int i = C52761wXj.Activity.fdOvFl;
        android.content.Context context3 = wye.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        wye.setCompoundDrawableTintList(C33070mpX.copydefault(i, context3));
        wye.setOnClickListener(new StateListAnimator(wye, 1000L, function1, interfaceC48173uHr));
        return wye;
    }

    public static final void copydefault(final InterfaceC48173uHr interfaceC48173uHr, Composer composer, final int i) {
        int i2;
        java.util.List listAhwBna;
        int i3;
        java.lang.String strAYXKKw;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1662984125);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(interfaceC48173uHr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1662984125, i2, -1, "com.okinc.tradingbot.impl.botDetail.ui.BotDetailParamsGrid (BotDetailParameterComposable.kt:162)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1095618995);
            boolean z = (i2 & 14) == 4;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                if (interfaceC48173uHr instanceof C48176uHu) {
                    C48176uHu c48176uHu = (C48176uHu) interfaceC48173uHr;
                    java.lang.String botPnl$default = C56033xvF.getBotPnl$default(c48176uHu.djBIcL(), c48176uHu.gEmmrt(), c48176uHu.AEQbTJ(), null, true, false, null, false, null, null, null, 2024, null);
                    java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, c48176uHu.copydefault(), 0, null, 4, null);
                    DcaLeadShareMode dcaLeadShareModeOLrzqt = DcaLeadShareMode.Companion.OLrzqt(c48176uHu.AYXKKw());
                    if (dcaLeadShareModeOLrzqt == null || (strAYXKKw = C33070mpX.AYXKKw(dcaLeadShareModeOLrzqt.getShowMode())) == null) {
                        strAYXKKw = "";
                    }
                    listAhwBna = yDY.gEmmrt(new C48195uIm(C55688xof.Application.onSkipToQueueItem, botPnl$default, false, 4, null), new C48195uIm(C55688xof.Application.ComponentActivityExternalSyntheticLambda2, percent$default, false, 4, null), new C48195uIm(C55688xof.Application.jh, strAYXKKw, true));
                } else if (interfaceC48173uHr instanceof C48171uHp) {
                    C48171uHp c48171uHp = (C48171uHp) interfaceC48173uHr;
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c48171uHp.OLrzqt(), (java.lang.Object) "contract_dca");
                    if (zEZpvd) {
                        i3 = Intrinsics.EZpvd((java.lang.Object) c48171uHp.KWHzl(), (java.lang.Object) "long") ? C55688xof.Application.gqOnQv : C55688xof.Application.hfdhUn;
                    } else {
                        i3 = C55688xof.Application.zblBkD;
                    }
                    int i4 = i3;
                    java.lang.String strKWHzl = KWHzl(c48171uHp.isConnected());
                    java.lang.String strKWHzl2 = KWHzl(c48171uHp.hDKMBd());
                    java.lang.String botPrice$default = C56033xvF.getBotPrice$default(c48171uHp.gEmmrt(), c48171uHp.djBIcL(), c48171uHp.ejfBZ(), false, false, null, null, 120, null);
                    int i5 = zEZpvd ? C55688xof.Application.OEgNct : C55688xof.Application.Dmq;
                    java.lang.String strEZpvd = EZpvd(interfaceC48173uHr, c48171uHp.AYXKKw());
                    int i6 = zEZpvd ? C55688xof.Application.UfveVb : C55688xof.Application.DCUTEIddSDPG;
                    java.lang.String strEZpvd2 = EZpvd(interfaceC48173uHr, c48171uHp.values());
                    int i7 = zEZpvd ? C55688xof.Application.OijiEz : C55688xof.Application.spnCvw;
                    java.lang.String strFetchVPNInfo = c48171uHp.fetchVPNInfo();
                    listAhwBna = yDY.gEmmrt(new C48195uIm(i4, strKWHzl, false, 4, null), new C48195uIm(C55688xof.Application.DGOPHZ, strKWHzl2, false, 4, null), new C48195uIm(C55688xof.Application.onKeyShortcut, botPrice$default, true), new C48195uIm(i5, strEZpvd, false, 4, null), new C48195uIm(i6, strEZpvd2, false, 4, null), new C48195uIm(i7, strFetchVPNInfo.length() == 0 ? "--" : pTB.formatICUNumber$default(C33129mqd.EZpvd(strFetchVPNInfo), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null), true));
                } else {
                    listAhwBna = yDY.AhwBna();
                }
                objRememberedValue = listAhwBna;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final java.util.List list = (java.util.List) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m675paddingqDBjuR0$default(Modifier.Companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(16), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(10));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            composerStartRestartGroup.startReplaceableGroup(-1095461474);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uHP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uHG.AEQbTJ(list, (LazyGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxWidth$default, null, null, false, horizontalOrVerticalM582spacedBy0680j_4, horizontalOrVerticalM582spacedBy0680j_42, null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 102432816, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uHG.KWHzl(interfaceC48173uHr, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ InterfaceC48173uHr AEQbTJ;
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, InterfaceC48173uHr interfaceC48173uHr) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = function1;
            this.AEQbTJ = interfaceC48173uHr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.invoke(this.AEQbTJ);
            }
        }
    }

    public static final Unit AEQbTJ(final java.util.List list, LazyGridScope lazyGridScope) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "");
        final Function1 function1 = new Function1() { // from class: o.uHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uHG.KWHzl((C48195uIm) obj);
            }
        };
        final BotDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$1 botDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$1 = new Function1() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(C48195uIm c48195uIm) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C48195uIm) obj);
            }
        };
        lazyGridScope.items(list.size(), new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$2
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
                return function1.invoke(list.get(i));
            }
        }, null, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$4
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
                return botDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new yHT<LazyGridItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.BotDetailParameterComposableKt$BotDetailParamsGrid$lambda$12$lambda$11$$inlined$items$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(lazyGridItemScope, "");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:454)");
                }
                C48195uIm c48195uIm = (C48195uIm) list.get(i);
                composer.startReplaceableGroup(2123121314);
                uHG.EZpvd(StringResources_androidKt.stringResource(c48195uIm.OLrzqt(), composer, 0), c48195uIm.KWHzl(), c48195uIm.EZpvd(), composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final java.lang.Object KWHzl(C48195uIm c48195uIm) {
        Intrinsics.checkNotNullParameter(c48195uIm, "");
        return java.lang.Integer.valueOf(c48195uIm.OLrzqt());
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.AhwBna(str, 0)) {
            return pTB.formatICUPercent$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.EZpvd(2), null, java.lang.Double.valueOf(100.0d), null, 21, null);
        }
        return str.length() == 0 ? C33070mpX.AYXKKw(C55688xof.Application.getResultContract) : "--";
    }

    public static final java.lang.String EZpvd(InterfaceC48173uHr interfaceC48173uHr, java.lang.String str) {
        java.lang.String strAhwBna = interfaceC48173uHr.AhwBna();
        return C56033xvF.fmtBotValueBySymbol$default(interfaceC48173uHr.AhwBna(), str, null, false, null, false, interfaceC48173uHr.gEmmrt(), interfaceC48173uHr.djBIcL(), strAhwBna, null, null, 1596, null);
    }

    public static final void OLrzqt(Modifier modifier, final java.lang.String str, final java.lang.String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1124748647);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124748647, i5, -1, "com.okinc.tradingbot.impl.botDetail.ui.CopyingInfoRow (BotDetailParameterComposable.kt:329)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            modifier3 = modifier4;
            TextKt.m2072Text4IGK_g(StringResources_androidKt.stringResource(C55688xof.Application.HJWChPQPAeHI, composerStartRestartGroup, 0), RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(TextAlign.Companion.m5291getStarte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0, 65020);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null);
            Arrangement.Horizontal horizontalM583spacedByD5KLDUw = arrangement.m583spacedByD5KLDUw(androidx.compose.ui.unit.Dp.m5414constructorimpl(6), companion.getEnd());
            Alignment.Vertical centerVertically2 = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM583spacedByD5KLDUw, centerVertically2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(companion3, androidx.compose.ui.unit.Dp.m5414constructorimpl(20));
            composerStartRestartGroup.startReplaceableGroup(189449408);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.uHM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uHG.copydefault((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(189451777);
            boolean z = (i5 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z2 = (i5 & FaceDetector.NUM_BOXES) == 256;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uHL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uHG.AEQbTJ(str, str2, (AppCompatImageView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM718size3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5334getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composer2, (i5 >> 6) & 14, 3120, 55294);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uHG.EZpvd(modifier5, str, str2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final AppCompatImageView copydefault(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new AppCompatImageView(context);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        C33054mpH.loadAvatar$default(appCompatImageView, str, str2, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final java.lang.String str, final java.lang.String str2, final boolean z, Composer composer, final int i) {
        int i2;
        int iM5291getStarte0LSkKk;
        int iM5291getStarte0LSkKk2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(853587249);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(853587249, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.ParamContent (BotDetailParameterComposable.kt:370)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0);
            if (z) {
                iM5291getStarte0LSkKk = TextAlign.Companion.m5287getEnde0LSkKk();
            } else {
                iM5291getStarte0LSkKk = TextAlign.Companion.m5291getStarte0LSkKk();
            }
            TextOverflow.Companion companion3 = TextOverflow.Companion;
            TextKt.m2072Text4IGK_g(str, modifierFillMaxWidth$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5291getStarte0LSkKk), 0L, companion3.m5334getEllipsisgIe3tQ8(), false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composerStartRestartGroup, (i3 & 14) | 48, 3120, 54780);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int iM5334getEllipsisgIe3tQ8 = companion3.m5334getEllipsisgIe3tQ8();
            TextStyle textStyleOLrzqt2 = C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, null, composerStartRestartGroup, 0, 2);
            long jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0);
            if (z) {
                iM5291getStarte0LSkKk2 = TextAlign.Companion.m5287getEnde0LSkKk();
            } else {
                iM5291getStarte0LSkKk2 = TextAlign.Companion.m5291getStarte0LSkKk();
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2072Text4IGK_g(str2, modifierFillMaxWidth$default3, jColorResource, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(iM5291getStarte0LSkKk2), 0L, iM5334getEllipsisgIe3tQ8, false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt2, composer2, ((i3 >> 3) & 14) | 48, 3120, 54776);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uHG.EZpvd(str, str2, z, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Modifier KWHzl(@NotNull Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceableGroup(468186076);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(468186076, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.defaultBackground (BotDetailParameterComposable.kt:408)");
        }
        Modifier modifierM349backgroundbw27NRU = BackgroundKt.m349backgroundbw27NRU(modifier, ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialaKhcqp, composer, 0), RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(10)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierM349backgroundbw27NRU;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(Modifier modifier, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        java.lang.Object objRememberedValue;
        java.lang.Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1566372834);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1566372834, i3, -1, "com.okinc.tradingbot.impl.botDetail.ui.MarketPrice (BotDetailParameterComposable.kt:420)");
                }
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i3 >> 12) & 14);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier.Companion companion2 = Modifier.Companion;
                TextKt.m2072Text4IGK_g(str3.length() != 0 ? "--" : C56033xvF.getBotPrice$default(str2, str, str3, false, false, null, null, 120, null), rowScopeInstance.alignByBaseline(companion2), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0, 65532);
                Modifier modifierAlignByBaseline = rowScopeInstance.alignByBaseline(SizeKt.m718size3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)));
                composerStartRestartGroup.startReplaceableGroup(1515978907);
                zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.uHQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uHG.OLrzqt(stateRememberUpdatedState, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1515988279);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.uHR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uHG.OLrzqt((wYD) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function1, modifierAlignByBaseline, (Function1) objRememberedValue2, composerStartRestartGroup, MLKEMEngine.KyberPolyBytes, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uHS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uHG.copydefault(modifier4, str, str2, str3, function0, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i3 >> 12) & 14);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM2783constructorimpl.getInserting()) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Modifier.Companion companion22 = Modifier.Companion;
                TextKt.m2072Text4IGK_g(str3.length() != 0 ? "--" : C56033xvF.getBotPrice$default(str2, str, str3, false, false, null, null, 120, null), rowScopeInstance2.alignByBaseline(companion22), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 0, 0, 65532);
                Modifier modifierAlignByBaseline2 = rowScopeInstance2.alignByBaseline(SizeKt.m718size3ABfNKs(companion22, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)));
                composerStartRestartGroup.startReplaceableGroup(1515978907);
                zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function1() { // from class: o.uHQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uHG.OLrzqt(stateRememberUpdatedState, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function12 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1515988279);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function12, modifierAlignByBaseline2, (Function1) objRememberedValue2, composerStartRestartGroup, MLKEMEngine.KyberPolyBytes, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final wYD OLrzqt(final androidx.compose.runtime.State state, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        wYD wyd = new wYD(context, null, 0, 6, null);
        wyd.setOKDSSize(-4);
        wyd.setType(2);
        wyd.setOnClickListener(new View.OnClickListener() { // from class: o.uHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uHG.copydefault(state, view);
            }
        });
        return wyd;
    }

    public static final void copydefault(androidx.compose.runtime.State state, android.view.View view) {
        ((Function0) state.getValue()).invoke();
    }

    public static final Unit OLrzqt(wYD wyd) {
        Intrinsics.checkNotNullParameter(wyd, "");
        wyd.setIconDrawableRes(C52761wXj.TaskDescription.OFhtUX);
        return Unit.INSTANCE;
    }
}
