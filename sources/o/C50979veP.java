package o;

import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C51045vfc;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC52731wWg;
import o.uLU;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.veP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50979veP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(boolean z, int i, Composer composer, int i2) {
        OLrzqt(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.lang.String str, C51045vfc c51045vfc, int i, Composer composer, int i2) {
        KWHzl(str, c51045vfc, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(C51045vfc c51045vfc, Function1 function1, java.lang.String str, int i, Composer composer, int i2) {
        AEQbTJ(c51045vfc, function1, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.ui.Modifier, float, float, int, java.lang.Object):androidx.compose.ui.Modifier */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier, float, int, java.lang.Object):androidx.compose.ui.Modifier */
    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.Composer):androidx.compose.runtime.SkippableUpdater */
    public static final void AEQbTJ(final C51045vfc c51045vfc, final Function1<? super java.lang.String, java.lang.String> function1, java.lang.String str, Composer composer, final int i) {
        int i2;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        C51045vfc.Activity activity;
        java.lang.String str2;
        java.lang.String strKWHzl;
        Composer composer2;
        final java.lang.String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-24072004);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(c51045vfc) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-24072004, i3, -1, "com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitContent (FuturesGridWithdrawProfitSheet.kt:355)");
            }
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(c51045vfc.copydefault(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateCollectAsState2 = SnapshotStateKt.collectAsState(c51045vfc.OLrzqt(), null, composerStartRestartGroup, 0, 1);
            androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i3 >> 3) & 14);
            composerStartRestartGroup.startReplaceableGroup(-1045250618);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                C52691wUu c52691wUu = C52691wUu.copydefault;
                java.lang.String string = context.getString(C48033uCm.Fragment.gFTCsA);
                Intrinsics.checkNotNullExpressionValue(string, "");
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(c52691wUu.KWHzl(context, string, new C50988veY(c51045vfc)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(companion2, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            uLU<C51045vfc.Activity> uluCopydefault = copydefault((androidx.compose.runtime.State<? extends uLU<C51045vfc.Activity>>) stateCollectAsState);
            uLU.ActionBar actionBar = uluCopydefault instanceof uLU.ActionBar ? (uLU.ActionBar) uluCopydefault : null;
            C51045vfc.Activity activity2 = actionBar != null ? (C51045vfc.Activity) actionBar.KWHzl() : null;
            boolean z = copydefault((androidx.compose.runtime.State<? extends uLU<C51045vfc.Activity>>) stateCollectAsState) instanceof uLU.TaskDescription;
            boolean z2 = copydefault((androidx.compose.runtime.State<? extends uLU<C51045vfc.Activity>>) stateCollectAsState) instanceof uLU.Activity;
            composerStartRestartGroup.startReplaceableGroup(-68971072);
            boolean zChanged = composerStartRestartGroup.changed(activity2);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = java.lang.Boolean.valueOf(C33129mqd.copydefault((activity2 == null || (strOLrzqt = activity2.OLrzqt()) == null) ? null : C33129mqd.EZpvd(strOLrzqt), java.lang.Double.valueOf(1.0E-4d)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objRememberedValue2).booleanValue();
            composerStartRestartGroup.endReplaceableGroup();
            Function1<java.lang.String, java.lang.String> function1OLrzqt = OLrzqt((androidx.compose.runtime.State<? extends Function1<? super java.lang.String, java.lang.String>>) stateRememberUpdatedState);
            composerStartRestartGroup.startReplaceableGroup(-68965871);
            boolean zChanged2 = composerStartRestartGroup.changed(activity2);
            boolean zChanged3 = composerStartRestartGroup.changed(function1OLrzqt);
            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChanged2 | zChanged3) || objRememberedValue3 == companion.getEmpty()) {
                java.lang.String strOLrzqt3 = OLrzqt(C50964veA.KWHzl((activity2 == null || (strOLrzqt2 = activity2.OLrzqt()) == null) ? null : OLrzqt((androidx.compose.runtime.State<? extends Function1<? super java.lang.String, java.lang.String>>) stateRememberUpdatedState).invoke(strOLrzqt2)));
                java.lang.String string2 = context.getString(C55688xof.Application.getCustomAction);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                objRememberedValue3 = C56390yDp.OLrzqt(strOLrzqt3, KWHzl(string2, strOLrzqt3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            kotlin.Pair pair = (kotlin.Pair) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            java.lang.String str4 = (java.lang.String) pair.component1();
            java.lang.String str5 = (java.lang.String) pair.component2();
            composerStartRestartGroup.startReplaceableGroup(-68949569);
            boolean zChanged4 = composerStartRestartGroup.changed(activity2);
            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == companion.getEmpty()) {
                if (activity2 == null || (strKWHzl = activity2.KWHzl()) == null) {
                    activity = activity2;
                    str2 = null;
                } else {
                    StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl);
                    activity = activity2;
                    str2 = pTB.formatUpToMax$default(C33129mqd.EZpvd(strKWHzl), 2, null, 2, null) + "x";
                }
                objRememberedValue4 = C50964veA.KWHzl(str2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                activity = activity2;
            }
            java.lang.String str6 = (java.lang.String) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion3.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            java.lang.String strKWHzl2 = KWHzl(stateCollectAsState2).KWHzl();
            java.lang.String string3 = context.getString(C55688xof.Application.getCustomAction);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String strEZpvd = KWHzl(stateCollectAsState2).EZpvd();
            boolean z3 = (KWHzl(stateCollectAsState2).copydefault() || z || z2) ? false : true;
            C52794wYp c52794wYpCopydefault = copydefault((MutableState<C52794wYp>) mutableState);
            composerStartRestartGroup.startReplaceableGroup(-1660911520);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(c51045vfc);
            java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: o.veV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50979veP.KWHzl(c51045vfc, (java.lang.String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            C51045vfc.Activity activity3 = activity;
            wVE.AEQbTJ(modifierFillMaxWidth$default, strKWHzl2, (Function1) objRememberedValue5, string3, str4, str5, null, strEZpvd, 4, null, null, null, z3, null, null, false, null, false, null, false, false, false, null, false, 1, c52794wYpCopydefault, composerStartRestartGroup, 100663302, 0, (C52794wYp.DbNXlk << 15) | 24576, 16772672);
            java.lang.String string4 = context.getString(C48033uCm.Fragment.zAEkPU);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-1660894135);
            boolean zChangedInstance2 = composer2.changedInstance(context);
            java.lang.Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: o.veU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50979veP.copydefault(context);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceableGroup();
            C52730wWf.KWHzl(null, new InterfaceC52731wWg.TaskDescription(string4, (Function0) objRememberedValue6), OLrzqt((androidx.compose.runtime.State<? extends Function1<? super java.lang.String, java.lang.String>>) stateRememberUpdatedState).invoke(activity3 != null ? activity3.OLrzqt() : null), 0L, 0L, composer2, 0, 25);
            java.lang.String string5 = context.getString(C48033uCm.Fragment.sFt);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            C52730wWf.KWHzl(null, InterfaceC52731wWg.StateListAnimator.copydefault(InterfaceC52731wWg.StateListAnimator.KWHzl(string5)), OLrzqt((androidx.compose.runtime.State<? extends Function1<? super java.lang.String, java.lang.String>>) stateRememberUpdatedState).invoke(activity3 != null ? activity3.AEQbTJ() : null), 0L, 0L, composer2, 0, 25);
            DividerKt.m1696Divider9IZ8Weo(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d)), 0.0f, ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composer2, 0), composer2, 6, 2);
            str3 = str;
            KWHzl(str3, c51045vfc, composer2, ((i3 >> 6) & 14) | ((i3 << 3) & WalletImportError.ERROR_CODE_AA_EXIST));
            java.lang.String string6 = context.getString(C48033uCm.Fragment.apNbdB);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            C52730wWf.KWHzl(null, InterfaceC52731wWg.StateListAnimator.copydefault(InterfaceC52731wWg.StateListAnimator.KWHzl(string6)), str6, 0L, 0L, composer2, 0, 25);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            OLrzqt(zBooleanValue, composer2, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.veW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50979veP.copydefault(c51045vfc, function1, str3, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(C51045vfc c51045vfc) {
        c51045vfc.copydefault(C51045vfc.Application.TaskDescription.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51045vfc c51045vfc, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51045vfc.copydefault(new C51045vfc.Application.Dialog(str));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.content.Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(context.getString(C48033uCm.Fragment.zAEkPU));
        viewOnClickListenerC54939xaY.EZpvd(context.getString(C48033uCm.Fragment.zDUObI));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.veX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50979veP.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        return "≤ " + str;
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return str + " (" + str2 + ")";
    }

    public static final void OLrzqt(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-783679957);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783679957, i2, -1, "com.okinc.tradingbot.impl.futures_grid.Caption (FuturesGridWithdrawProfitSheet.kt:491)");
            }
            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (!z) {
                composerStartRestartGroup.startReplaceableGroup(-1787062266);
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 1, null);
                java.lang.String string = context.getString(C55688xof.Application.unregisterMediaButtonEventReceiver);
                Intrinsics.checkNotNullExpressionValue(string, "");
                TextKt.m2072Text4IGK_g(string, modifierM673paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq), composerStartRestartGroup, 0, 0), composerStartRestartGroup, 48, 0, 65532);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1786786769);
                Modifier modifierM673paddingVpY3zN4$default2 = PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 1, null);
                java.lang.String string2 = context.getString(C55688xof.Application.closeOptionsMenu);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                composer2 = composerStartRestartGroup;
                TextKt.m2072Text4IGK_g(string2, modifierM673paddingVpY3zN4$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab), composerStartRestartGroup, 0, 0), composer2, 48, 0, 65532);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vfb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50979veP.AEQbTJ(z, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void KWHzl(final java.lang.String str, final C51045vfc c51045vfc, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-967902719);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(c51045vfc) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-967902719, i2, -1, "com.okinc.tradingbot.impl.futures_grid.TickerItem (FuturesGridWithdrawProfitSheet.kt:509)");
            }
            C52730wWf.KWHzl(null, InterfaceC52731wWg.StateListAnimator.copydefault(InterfaceC52731wWg.StateListAnimator.KWHzl(C33069mpW.KWHzl((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), C48033uCm.Fragment.UfveVb, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str))))), AEQbTJ((androidx.compose.runtime.State<java.lang.String>) SnapshotStateKt.collectAsState(c51045vfc.AEQbTJ(), "--", null, composerStartRestartGroup, 48, 2)), 0L, 0L, composerStartRestartGroup, 0, 25);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.veT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50979veP.EZpvd(str, c51045vfc, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final uLU<C51045vfc.Activity> copydefault(androidx.compose.runtime.State<? extends uLU<C51045vfc.Activity>> state) {
        return state.getValue();
    }

    public static final C51045vfc.StateListAnimator KWHzl(androidx.compose.runtime.State<C51045vfc.StateListAnimator> state) {
        return state.getValue();
    }

    public static final Function1<java.lang.String, java.lang.String> OLrzqt(androidx.compose.runtime.State<? extends Function1<? super java.lang.String, java.lang.String>> state) {
        return (Function1) state.getValue();
    }

    public static final C52794wYp copydefault(MutableState<C52794wYp> mutableState) {
        return mutableState.getValue();
    }

    public static final java.lang.String AEQbTJ(androidx.compose.runtime.State<java.lang.String> state) {
        return state.getValue();
    }
}
