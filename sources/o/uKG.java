package o;

import android.widget.ImageView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
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
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.botList.domain.model.LLMBotType;
import com.okinc.tradingbot.impl.widget.compose.BotIconStacksStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.uKG;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class uKG {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LLMBotType.values().length];
            try {
                iArr[LLMBotType.Backtest.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LLMBotType.LLM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(uJO ujo, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AEQbTJ(ujo, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Function2 function2, Function2 function22, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        copydefault(function2, function22, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, Composer composer, int i2) {
        OLrzqt(z, str, str2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final uJO ujo, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        java.util.Map mapKWHzl;
        Composer composer2;
        Intrinsics.checkNotNullParameter(ujo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-739881985);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ujo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-739881985, i2, -1, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotHeader (LLMBotHeaderCompose.kt:55)");
            }
            androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 3) & 14);
            androidx.compose.runtime.State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i2 >> 6) & 14);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            C52716wVs.AEQbTJ(C49551uqg.EZpvd(companion, copydefault(stateRememberUpdatedState)), ujo.zuBGHE(), androidx.compose.ui.unit.Dp.m5414constructorimpl(36), 14, 0, BotIconStacksStyle.SPACIOUS, false, composerStartRestartGroup, 200064, 80);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            float f = 4;
            Arrangement.Vertical verticalM584spacedByD5KLDUw = arrangement.m584spacedByD5KLDUw(androidx.compose.ui.unit.Dp.m5414constructorimpl(f), companion2.getCenterVertically());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM584spacedByD5KLDUw, companion2.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(ujo.valueOf());
            if (ujo.ORxRYg()) {
                builder.append(" ");
                InlineTextContentKt.appendInlineContent(builder, "pinIcon", "[pin]");
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ujo.ORxRYg()) {
                mapKWHzl = C56423yEv.EZpvd(C56390yDp.OLrzqt("pinIcon", new InlineTextContent(new Placeholder(TextUnitKt.getSp(17), TextUnitKt.getSp(17), PlaceholderVerticalAlign.Companion.m4856getCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 15093138, true, new StateListAnimator(stateRememberUpdatedState2)))));
            } else {
                mapKWHzl = C56424yEw.KWHzl();
            }
            copydefault(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1105746096, true, new ActionBar(annotatedString, mapKWHzl, stateRememberUpdatedState)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -767467441, true, new TaskDescription(ujo)), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), composerStartRestartGroup, 3510, 0);
            int i3 = Activity.AEQbTJ[ujo.AEQbTJ().ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceableGroup(1921536391);
                java.lang.String strAhwBna = ujo.AhwBna();
                if (strAhwBna == null) {
                    composer2 = composerStartRestartGroup;
                } else {
                    composer2 = composerStartRestartGroup;
                    TextKt.m2072Text4IGK_g(strAhwBna, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.QOLQEE, java.lang.Integer.valueOf(C52761wXj.Activity.DCUTEIddSDPG), composerStartRestartGroup, 0, 0), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceableGroup();
            } else {
                if (i3 != 2) {
                    composerStartRestartGroup.startReplaceableGroup(-1877679063);
                    composerStartRestartGroup.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceableGroup(1922010660);
                OLrzqt(ujo.isConnected(), ujo.zLjUOn(), ujo.uzCIH(), ujo.AubY(), ujo.wlaJM(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
                composer2 = composerStartRestartGroup;
            }
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
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uKK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uKG.OLrzqt(ujo, function0, function02, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class StateListAnimator implements yHO<java.lang.String, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ androidx.compose.runtime.State<Function0<Unit>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
            this.EZpvd = state;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.String str, Composer composer, java.lang.Integer num) {
            copydefault(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.String str, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(15093138, i, -1, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotHeader.<anonymous>.<anonymous>.<anonymous> (LLMBotHeaderCompose.kt:98)");
                }
                Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(17));
                composer.startReplaceableGroup(-454486181);
                boolean zChanged = composer.changed(this.EZpvd);
                final androidx.compose.runtime.State<Function0<Unit>> state = this.EZpvd;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.uKO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return uKG.StateListAnimator.EZpvd(state);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierEZpvd = C49551uqg.EZpvd(modifierM718size3ABfNKs, (Function0) objRememberedValue);
                composer.startReplaceableGroup(-454481728);
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.uKQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return uKG.StateListAnimator.AEQbTJ((android.content.Context) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifierEZpvd, null, composer, 6, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit EZpvd(androidx.compose.runtime.State state) {
            uKG.OLrzqt((androidx.compose.runtime.State<? extends Function0<Unit>>) state).invoke();
            return Unit.INSTANCE;
        }

        public static final android.widget.ImageView AEQbTJ(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageResource(C48033uCm.ActionBar.AuCTel);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        }
    }

    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ androidx.compose.runtime.State<Function0<Unit>> KWHzl;
        public final /* synthetic */ AnnotatedString OLrzqt;
        public final /* synthetic */ java.util.Map<java.lang.String, InlineTextContent> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(AnnotatedString annotatedString, java.util.Map<java.lang.String, InlineTextContent> map, androidx.compose.runtime.State<? extends Function0<Unit>> state) {
            this.OLrzqt = annotatedString;
            this.copydefault = map;
            this.KWHzl = state;
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
                    ComposerKt.traceEventStart(1105746096, i, -1, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotHeader.<anonymous>.<anonymous>.<anonymous> (LLMBotHeaderCompose.kt:121)");
                }
                TextKt.m2073TextIbK3jfQ(this.OLrzqt, C49551uqg.EZpvd(Modifier.Companion, uKG.copydefault(this.KWHzl)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, this.copydefault, null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AwvSrB, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0), composer, 0, 0, 98300);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final class TaskDescription implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ uJO EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(uJO ujo) {
            this.EZpvd = ujo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767467441, i, -1, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotHeader.<anonymous>.<anonymous>.<anonymous> (LLMBotHeaderCompose.kt:132)");
            }
            uKZ.OLrzqt(this.EZpvd.ejfBZ(), (Modifier) null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void OLrzqt(final boolean z, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(259256660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(259256660, i2, -1, "com.okinc.tradingbot.impl.botList.ui.cell.BotStatus (LLMBotHeaderCompose.kt:185)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1664807739);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.uKM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uKG.OLrzqt((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1664809668);
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z4 = (i2 & FaceDetector.NUM_BOXES) == 256;
            boolean z5 = (i2 & 7168) == 2048;
            boolean z6 = (i2 & 57344) == 16384;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z2 | z3 | z4 | z5 | z6) || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.uKL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uKG.AEQbTJ(z, str, str2, str3, str4, (wOD) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, null, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uKN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uKG.copydefault(z, str, str2, str3, str4, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final wOD OLrzqt(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new wOD(context, null, 2, null);
    }

    public static final Unit AEQbTJ(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, wOD wod) {
        Intrinsics.checkNotNullParameter(wod, "");
        wod.copydefault(z, str, str2, str3, str4);
        return Unit.INSTANCE;
    }

    public static final void copydefault(final Function2<? super Composer, ? super java.lang.Integer, Unit> function2, final Function2<? super Composer, ? super java.lang.Integer, Unit> function22, Modifier modifier, final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-774496076);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                f = androidx.compose.ui.unit.Dp.m5414constructorimpl(4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-774496076, i3, -1, "com.okinc.tradingbot.impl.botList.ui.cell.AdaptiveTitleTagRow (LLMBotHeaderCompose.kt:215)");
            }
            composerStartRestartGroup.startReplaceableGroup(141318403);
            boolean z = (i3 & 7168) == 2048;
            boolean z2 = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z3 = (i3 & 14) == 4;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function2() { // from class: o.uKF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return uKG.KWHzl(f, function22, function2, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uKI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uKG.copydefault(function2, function22, modifier2, f2, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final MeasureResult KWHzl(float f, Function2 function2, Function2 function22, SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "");
        final int iMo510roundToPx0680j_4 = subcomposeMeasureScope.mo510roundToPx0680j_4(f);
        final Placeable placeableMo4385measureBRTryo0 = ((Measurable) CollectionsKt___CollectionsKt.AuCTelauCTel(subcomposeMeasureScope.subcompose("tag", function2))).mo4385measureBRTryo0(Constraints.m5361copyZbe2FdA$default(constraints.m5376unboximpl(), 0, 0, 0, 0, 14, null));
        final Placeable placeableMo4385measureBRTryo02 = ((Measurable) CollectionsKt___CollectionsKt.AuCTelauCTel(subcomposeMeasureScope.subcompose("title", function22))).mo4385measureBRTryo0(Constraints.m5361copyZbe2FdA$default(constraints.m5376unboximpl(), 0, 0, 0, 0, 14, null));
        if (placeableMo4385measureBRTryo02.getWidth() + iMo510roundToPx0680j_4 + placeableMo4385measureBRTryo0.getWidth() <= Constraints.m5370getMaxWidthimpl(constraints.m5376unboximpl())) {
            final int iMax = java.lang.Math.max(placeableMo4385measureBRTryo02.getHeight(), placeableMo4385measureBRTryo0.getHeight());
            return MeasureScope.layout$default(subcomposeMeasureScope, Constraints.m5370getMaxWidthimpl(constraints.m5376unboximpl()), iMax, null, new Function1() { // from class: o.uKJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uKG.OLrzqt(placeableMo4385measureBRTryo02, iMax, placeableMo4385measureBRTryo0, constraints, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        int height = placeableMo4385measureBRTryo02.getHeight();
        return MeasureScope.layout$default(subcomposeMeasureScope, Constraints.m5370getMaxWidthimpl(constraints.m5376unboximpl()), height + iMo510roundToPx0680j_4 + placeableMo4385measureBRTryo0.getHeight(), null, new Function1() { // from class: o.uKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uKG.KWHzl(placeableMo4385measureBRTryo02, placeableMo4385measureBRTryo0, iMo510roundToPx0680j_4, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(Placeable placeable, int i, Placeable placeable2, Constraints constraints, Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "");
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Constraints.m5370getMaxWidthimpl(constraints.m5376unboximpl()) - placeable2.getWidth(), (i - placeable2.getHeight()) / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Placeable placeable, Placeable placeable2, int i, Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "");
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, placeable.getHeight() + i, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    public static final Function0<Unit> copydefault(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    public static final Function0<Unit> OLrzqt(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
