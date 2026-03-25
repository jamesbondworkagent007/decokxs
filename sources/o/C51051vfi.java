package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC52731wWg;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.vfi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51051vfi {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(BalanceDetailInfoDto balanceDetailInfoDto, java.lang.String str, java.lang.String str2, int i, Composer composer, int i2) {
        OLrzqt(balanceDetailInfoDto, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final BalanceDetailInfoDto balanceDetailInfoDto, final java.lang.String str, final java.lang.String str2, Composer composer, final int i) {
        int i2;
        java.lang.String withdrawnGridProfit;
        java.lang.String str3;
        int i3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.content.Context context;
        java.lang.Object pnlUnit$default;
        int i4;
        int i5;
        java.lang.String str7;
        java.lang.String str8;
        boolean z;
        Composer composer2;
        boolean z2;
        int i6;
        int i7;
        int i8;
        Composer composer3;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        boolean z4;
        android.content.Context context2;
        int i15;
        java.lang.String frozenGridProfit;
        java.lang.String displayCurGridProfit;
        java.lang.String displayAccGridProfit;
        Composer composerStartRestartGroup = composer.startRestartGroup(1139900561);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(balanceDetailInfoDto) : composerStartRestartGroup.changedInstance(balanceDetailInfoDto) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1139900561, i2, -1, "com.okinc.tradingbot.impl.futures_grid.GridProfitContent (GridProfitBottomSheet.kt:131)");
            }
            android.content.Context context3 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.String str9 = (balanceDetailInfoDto == null || (displayAccGridProfit = balanceDetailInfoDto.getDisplayAccGridProfit()) == null) ? "" : displayAccGridProfit;
            java.lang.String str10 = (balanceDetailInfoDto == null || (displayCurGridProfit = balanceDetailInfoDto.getDisplayCurGridProfit()) == null) ? "" : displayCurGridProfit;
            if (balanceDetailInfoDto == null || (withdrawnGridProfit = balanceDetailInfoDto.getWithdrawnGridProfit()) == null) {
                withdrawnGridProfit = "";
            }
            java.lang.String str11 = (balanceDetailInfoDto == null || (frozenGridProfit = balanceDetailInfoDto.getFrozenGridProfit()) == null) ? "" : frozenGridProfit;
            composerStartRestartGroup.startReplaceableGroup(-160428128);
            int i16 = i2 & WalletImportError.ERROR_CODE_AA_EXIST;
            boolean z5 = i16 == 32;
            int i17 = i2 & FaceDetector.NUM_BOXES;
            boolean z6 = i17 == 256;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z5 || z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                str3 = withdrawnGridProfit;
                i3 = i17;
                str4 = str10;
                str5 = str9;
                str6 = "";
                context = context3;
                pnlUnit$default = C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, str, str2, null, 4, null);
                composerStartRestartGroup.updateRememberedValue(pnlUnit$default);
            } else {
                str3 = withdrawnGridProfit;
                str4 = str10;
                str5 = str9;
                str6 = "";
                context = context3;
                pnlUnit$default = objRememberedValue;
                i3 = i17;
            }
            java.lang.String str12 = (java.lang.String) pnlUnit$default;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-160420438);
            boolean zChanged = composerStartRestartGroup.changed(str5);
            boolean z7 = i16 == 32;
            boolean z8 = i3 == 256;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (((zChanged | z7) || z8) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                i4 = i16;
                i5 = i3;
                str7 = str6;
                str8 = str5;
                z = false;
                objRememberedValue2 = C56033xvF.getBotPnl$default(str, str2, str5, null, true, false, null, false, str12, null, null, 1736, null);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                i4 = i16;
                i5 = i3;
                str7 = str6;
                str8 = str5;
                z = false;
                composer2 = composerStartRestartGroup;
            }
            java.lang.String str13 = (java.lang.String) objRememberedValue2;
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-160410454);
            java.lang.String str14 = str4;
            boolean zChanged2 = composer2.changed(str14);
            int i18 = i4;
            if (i18 == 32) {
                i6 = i5;
                z2 = true;
            } else {
                z2 = z;
                i6 = i5;
            }
            boolean z9 = i6 == 256 ? true : z;
            java.lang.Object objRememberedValue3 = composer2.rememberedValue();
            if (((zChanged2 | z2) || z9) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                i7 = i6;
                i8 = i18;
                composer3 = composer2;
                objRememberedValue3 = C56033xvF.getBotPnl$default(str, str2, str14, null, true, false, null, false, str12, null, null, 1736, null);
                composer3.updateRememberedValue(objRememberedValue3);
            } else {
                i7 = i6;
                i8 = i18;
                composer3 = composer2;
            }
            java.lang.String str15 = (java.lang.String) objRememberedValue3;
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(-160400402);
            java.lang.String str16 = str3;
            boolean zChanged3 = composer3.changed(str16);
            int i19 = i8;
            int i20 = i7;
            boolean z10 = i19 == 32;
            boolean z11 = i20 == 256;
            java.lang.Object objRememberedValue4 = composer3.rememberedValue();
            if (((zChanged3 | z10) || z11) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                i9 = i20;
                i10 = i19;
                objRememberedValue4 = C56033xvF.getBotPnl$default(str, str2, str16, null, true, false, null, false, str12, null, null, 1736, null);
                composer3.updateRememberedValue(objRememberedValue4);
            } else {
                i9 = i20;
                i10 = i19;
            }
            java.lang.String str17 = (java.lang.String) objRememberedValue4;
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(-160390224);
            java.lang.String str18 = str11;
            boolean zChanged4 = composer3.changed(str18);
            int i21 = i9;
            if (i10 == 32) {
                i11 = 256;
                z3 = true;
            } else {
                i11 = 256;
                z3 = false;
            }
            boolean z12 = i21 == i11;
            java.lang.Object objRememberedValue5 = composer3.rememberedValue();
            if (((zChanged4 | z3) || z12) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                i12 = i21;
                objRememberedValue5 = C56033xvF.getBotPnl$default(str, str2, str18, null, true, false, null, false, str12, null, null, 1736, null);
                composer3.updateRememberedValue(objRememberedValue5);
            } else {
                i12 = i21;
            }
            java.lang.String str19 = (java.lang.String) objRememberedValue5;
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(-160380470);
            if (i10 == 32) {
                i13 = i12;
                i14 = 256;
                z4 = true;
            } else {
                i13 = i12;
                i14 = 256;
                z4 = false;
            }
            boolean z13 = i13 == i14;
            java.lang.Object objRememberedValue6 = composer3.rememberedValue();
            if ((z13 || z4) || objRememberedValue6 == Composer.Companion.getEmpty()) {
                context2 = context;
                objRememberedValue6 = C33069mpW.KWHzl(context2, C48033uCm.Fragment.DSiOMJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, str, str2, null, 4, null))));
                composer3.updateRememberedValue(objRememberedValue6);
            } else {
                context2 = context;
            }
            java.lang.String str20 = (java.lang.String) objRememberedValue6;
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(-160370041);
            boolean zChanged5 = composer3.changed(str8);
            java.lang.Object objRememberedValue7 = composer3.rememberedValue();
            if (zChanged5 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                i15 = 2;
                objRememberedValue7 = Color.m3139boximpl(ColorKt.Color(C56033xvF.getTradeDefaultColor$default(str8, 0, 2, null)));
                composer3.updateRememberedValue(objRememberedValue7);
            } else {
                i15 = 2;
            }
            long jM3159unboximpl = ((Color) objRememberedValue7).m3159unboximpl();
            composer3.endReplaceableGroup();
            Modifier.Companion companion = Modifier.Companion;
            float f = 24;
            Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, i15, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 5, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
            composer3.startReplaceableGroup(-483455358);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, companion2.getStart(), composer3, 6);
            composer3.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer3);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = arrangement.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(4));
            composer3.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, companion2.getStart(), composer3, 6);
            composer3.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer3);
            Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            Composer composer4 = composer3;
            TextKt.m2072Text4IGK_g(str20, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.zuBGHE, java.lang.Integer.valueOf(C52761wXj.Activity.DCUTEIddSDPG), composer3, 0, 0), composer4, 48, 0, 65532);
            TextKt.m2072Text4IGK_g(str13, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), jM3159unboximpl, TextUnitKt.getSp(24), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.DCUTEI, null, composer3, 0, 2), composer4, 3120, 0, 65520);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            java.lang.String string = context2.getString(C48033uCm.Fragment.DrqXHJ);
            java.lang.String str21 = str7;
            Intrinsics.checkNotNullExpressionValue(string, str21);
            Composer composer5 = composer3;
            C52730wWf.KWHzl(modifierFillMaxWidth$default2, InterfaceC52731wWg.StateListAnimator.copydefault(InterfaceC52731wWg.StateListAnimator.KWHzl(string)), str15, 0L, 0L, composer5, 6, 24);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            java.lang.String string2 = context2.getString(C48033uCm.Fragment.DIIpTV);
            Intrinsics.checkNotNullExpressionValue(string2, str21);
            C52730wWf.KWHzl(modifierFillMaxWidth$default3, InterfaceC52731wWg.StateListAnimator.copydefault(InterfaceC52731wWg.StateListAnimator.KWHzl(string2)), str19, 0L, 0L, composer5, 6, 24);
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            java.lang.String string3 = context2.getString(C55688xof.Application.invalidateOptionsMenu);
            Intrinsics.checkNotNullExpressionValue(string3, str21);
            C52730wWf.KWHzl(modifierFillMaxWidth$default4, InterfaceC52731wWg.StateListAnimator.copydefault(InterfaceC52731wWg.StateListAnimator.KWHzl(string3)), str17, 0L, 0L, composer5, 6, 24);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.vfe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C51051vfi.EZpvd(balanceDetailInfoDto, str, str2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
