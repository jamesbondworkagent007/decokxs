package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.profileinstaller.ProfileVerifier;
import com.okinc.tradingbot.impl.widget.compose.UnderlineStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52731wWg;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52730wWf {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, InterfaceC52731wWg interfaceC52731wWg, java.lang.String str, long j, long j2, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, interfaceC52731wWg, str, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Modifier modifier, @NotNull final InterfaceC52731wWg interfaceC52731wWg, @NotNull final java.lang.String str, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jColorResource;
        long jColorResource2;
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        int i5;
        Composer composer2;
        Composer composer3;
        final long j3;
        final long j4;
        Intrinsics.checkNotNullParameter(interfaceC52731wWg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1527614950);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(interfaceC52731wWg) : composerStartRestartGroup.changedInstance(interfaceC52731wWg) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jColorResource = j;
            i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(jColorResource)) ? 2048 : 1024;
        } else {
            jColorResource = j;
        }
        if ((i & 24576) == 0) {
            jColorResource2 = j2;
            i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(jColorResource2)) ? 16384 : 8192;
        } else {
            jColorResource2 = j2;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i6 != 0 ? Modifier.Companion : modifier2;
                if ((i2 & 8) != 0) {
                    jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                    i3 &= -57345;
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                modifier3 = modifier2;
            }
            long j5 = jColorResource;
            long j6 = jColorResource2;
            int i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527614950, i7, -1, "com.okinc.tradingbot.impl.widget.compose.ItemRow (ItemRow.kt:27)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            Alignment.Vertical top = Alignment.Companion.getTop();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, top, composerStartRestartGroup, 54);
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
            if (interfaceC52731wWg instanceof InterfaceC52731wWg.TaskDescription) {
                composerStartRestartGroup.startReplaceableGroup(1977203394);
                InterfaceC52731wWg.TaskDescription taskDescription = (InterfaceC52731wWg.TaskDescription) interfaceC52731wWg;
                i4 = i7;
                modifier4 = modifier3;
                i5 = 0;
                C52743wWs.AEQbTJ(taskDescription.OLrzqt(), RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), (UnderlineStyle) null, C52761wXj.LoaderManager.zuBGHE, j5, 2, taskDescription.EZpvd(), composerStartRestartGroup, ((i7 << 3) & 57344) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                i4 = i7;
                modifier4 = modifier3;
                i5 = 0;
                if (!(interfaceC52731wWg instanceof InterfaceC52731wWg.StateListAnimator)) {
                    composerStartRestartGroup.startReplaceableGroup(1587800020);
                    composerStartRestartGroup.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceableGroup(1977591545);
                composer2 = composerStartRestartGroup;
                C52743wWs.OLrzqt(((InterfaceC52731wWg.StateListAnimator) interfaceC52731wWg).copydefault(), RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), null, null, C52761wXj.LoaderManager.zuBGHE, j6, 2, null, null, null, null, composer2, (458752 & (i4 << 3)) | 1572864, 0, 1932);
                composer2.endReplaceableGroup();
            }
            Composer composer4 = composer2;
            composer3 = composer4;
            TextKt.m2072Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5279boximpl(TextAlign.Companion.m5287getEnde0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.gHZMYf, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composer4, i5, i5), composer3, (i4 >> 6) & 14, 3072, 56828);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j5;
            j4 = j6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            j3 = jColorResource;
            j4 = jColorResource2;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C52730wWf.AEQbTJ(modifier6, interfaceC52731wWg, str, j3, j4, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
