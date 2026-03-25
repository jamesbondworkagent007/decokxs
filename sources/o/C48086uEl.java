package o;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1;
import com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48086uEl {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, TextFieldValue textFieldValue, Function1 function1, java.lang.String str, int i, int i2, int i3, Composer composer, int i4) {
        OLrzqt(modifier, textFieldValue, function1, str, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Modifier modifier, @NotNull final TextFieldValue textFieldValue, @NotNull final Function1<? super TextFieldValue, Unit> function1, java.lang.String str, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        java.lang.String str2;
        int i5;
        int i6;
        java.lang.String str3;
        int i7;
        long jColorResource;
        long jColorResource2;
        long jColorResource3;
        long jColorResource4;
        boolean zChanged;
        boolean zChanged2;
        boolean zChanged3;
        boolean z;
        java.lang.Object objRememberedValue;
        java.lang.Object objRememberedValue2;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        final ScrollState scrollStateRememberScrollState;
        java.lang.Object objRememberedValue3;
        final MutableIntState mutableIntState;
        java.lang.Object objRememberedValue4;
        final MutableState mutableState;
        boolean zChanged4;
        java.lang.Object objRememberedValue5;
        final float fMo516toPx0680j_4;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        boolean zChanged5;
        boolean zChanged6;
        int i8;
        boolean z2;
        java.lang.Object objRememberedValue6;
        int i9;
        java.lang.Object objRememberedValue7;
        Composer composer2;
        boolean zChanged7;
        ScrollState scrollState;
        boolean z3;
        boolean zChanged8;
        java.lang.Object objRememberedValue8;
        final Modifier modifier3;
        final java.lang.String str4;
        final int i10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(textFieldValue, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1210616577);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                str2 = str;
                i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i11 == 0 ? Modifier.Companion : modifier2;
                    str3 = i12 == 0 ? "" : str2;
                    i7 = i5 == 0 ? Integer.MAX_VALUE : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1210616577, i4, -1, "com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorComposable (BotMarkdownEditorComposable.kt:44)");
                    }
                    jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.gkZNMa, composerStartRestartGroup, 0);
                    jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                    jColorResource3 = ColorResources_androidKt.colorResource(C52761wXj.Activity.OJuSTm, composerStartRestartGroup, 0);
                    jColorResource4 = ColorResources_androidKt.colorResource(C52761wXj.Activity.clearRegistrations, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2143579439);
                    zChanged = composerStartRestartGroup.changed(jColorResource);
                    zChanged2 = composerStartRestartGroup.changed(jColorResource2);
                    zChanged3 = composerStartRestartGroup.changed(jColorResource4);
                    z = (i4 & 57344) != 16384;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged | zChanged2 | zChanged3 | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new C48094uEt(jColorResource, jColorResource2, jColorResource4, i7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    C48094uEt c48094uEt = (C48094uEt) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceableGroup(2143591646);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    mutableIntState = (MutableIntState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(2143594110);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(2143595950);
                    zChanged4 = composerStartRestartGroup.changed(jColorResource3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new SolidColor(jColorResource3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    SolidColor solidColor = (SolidColor) objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    fMo516toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(28));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
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
                    Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-2047022277);
                    if (textFieldValue.getText().length() == 0 && str3.length() > 0) {
                        TextKt.m2072Text4IGK_g(str3, PaddingKt.m672paddingVpY3zN4(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(3), androidx.compose.ui.unit.Dp.m5414constructorimpl(10)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.UlJrfe), composerStartRestartGroup, 0, 0), composerStartRestartGroup, ((i4 >> 9) & 14) | 48, 0, 65532);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-2047006174);
                    zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
                    zChanged5 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    zChanged6 = composerStartRestartGroup.changed(fMo516toPx0680j_4);
                    i8 = i4 & WalletImportError.ERROR_CODE_AA_EXIST;
                    z2 = i8 != 32;
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if ((!(zChangedInstance | zChanged5 | zChanged6) && !z2) || objRememberedValue6 == companion.getEmpty()) {
                        i9 = i4;
                        Function1 function12 = new Function1() { // from class: o.uEj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C48086uEl.KWHzl(coroutineScope, scrollStateRememberScrollState, fMo516toPx0680j_4, textFieldValue, mutableState, mutableIntState, (IntSize) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function12);
                        objRememberedValue6 = function12;
                    } else {
                        i9 = i4;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierFillMaxSize$default, (Function1) objRememberedValue6);
                    TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.startReplaceableGroup(-2046952655);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: o.uEk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C48086uEl.KWHzl(mutableState, (TextLayoutResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i13 = i9 >> 3;
                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierOnSizeChanged, false, false, textStyleOLrzqt, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) c48094uEt, (Function1<? super TextLayoutResult, Unit>) objRememberedValue7, (MutableInteractionSource) null, (Brush) solidColor, (yHO<? super Function2<? super Composer, ? super java.lang.Integer, Unit>, ? super Composer, ? super java.lang.Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1533853116, true, new Activity(scrollStateRememberScrollState)), composerStartRestartGroup, (i13 & 14) | (i13 & WalletImportError.ERROR_CODE_AA_EXIST), 196992, 10200);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    TextRange textRangeM4911boximpl = TextRange.m4911boximpl(textFieldValue.m5142getSelectiond9O1mEE());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(2143686761);
                    zChanged7 = composer2.changed(fMo516toPx0680j_4);
                    if (i8 != 32) {
                        z3 = true;
                        scrollState = scrollStateRememberScrollState;
                    } else {
                        scrollState = scrollStateRememberScrollState;
                        z3 = false;
                    }
                    zChanged8 = composer2.changed(scrollState);
                    objRememberedValue8 = composer2.rememberedValue();
                    if (!(zChanged7 | z3 | zChanged8) || objRememberedValue8 == companion.getEmpty()) {
                        BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1 botMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1 = new BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1(fMo516toPx0680j_4, textFieldValue, scrollState, mutableState, mutableIntState, null);
                        composer2.updateRememberedValue(botMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1);
                        objRememberedValue8 = botMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1;
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(textRangeM4911boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue8, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    str4 = str3;
                    i10 = i7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str4 = str2;
                    composer2 = composerStartRestartGroup;
                    i10 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uEp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C48086uEl.AEQbTJ(modifier3, textFieldValue, function1, str4, i10, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) != 9362) {
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.gkZNMa, composerStartRestartGroup, 0);
                jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                jColorResource3 = ColorResources_androidKt.colorResource(C52761wXj.Activity.OJuSTm, composerStartRestartGroup, 0);
                jColorResource4 = ColorResources_androidKt.colorResource(C52761wXj.Activity.clearRegistrations, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2143579439);
                zChanged = composerStartRestartGroup.changed(jColorResource);
                zChanged2 = composerStartRestartGroup.changed(jColorResource2);
                zChanged3 = composerStartRestartGroup.changed(jColorResource4);
                if ((i4 & 57344) != 16384) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChanged2 | zChanged3 | z)) {
                    objRememberedValue = new C48094uEt(jColorResource, jColorResource2, jColorResource4, i7, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    C48094uEt c48094uEt2 = (C48094uEt) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceableGroup(2143591646);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    mutableIntState = (MutableIntState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(2143594110);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    mutableState = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(2143595950);
                    zChanged4 = composerStartRestartGroup.changed(jColorResource3);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4) {
                        objRememberedValue5 = new SolidColor(jColorResource3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        SolidColor solidColor2 = (SolidColor) objRememberedValue5;
                        composerStartRestartGroup.endReplaceableGroup();
                        fMo516toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(28));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM2783constructorimpl.getInserting()) {
                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(-2047022277);
                            if (textFieldValue.getText().length() == 0) {
                                TextKt.m2072Text4IGK_g(str3, PaddingKt.m672paddingVpY3zN4(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(3), androidx.compose.ui.unit.Dp.m5414constructorimpl(10)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.UlJrfe), composerStartRestartGroup, 0, 0), composerStartRestartGroup, ((i4 >> 9) & 14) | 48, 0, 65532);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-2047006174);
                            zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
                            zChanged5 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                            zChanged6 = composerStartRestartGroup.changed(fMo516toPx0680j_4);
                            i8 = i4 & WalletImportError.ERROR_CODE_AA_EXIST;
                            if (i8 != 32) {
                            }
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (!(zChangedInstance | zChanged5 | zChanged6 | z2)) {
                                i9 = i4;
                                Function1 function122 = new Function1() { // from class: o.uEj
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C48086uEl.KWHzl(coroutineScope, scrollStateRememberScrollState, fMo516toPx0680j_4, textFieldValue, mutableState, mutableIntState, (IntSize) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function122);
                                objRememberedValue6 = function122;
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierOnSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(modifierFillMaxSize$default2, (Function1) objRememberedValue6);
                                TextStyle textStyleOLrzqt2 = C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.startReplaceableGroup(-2046952655);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int i132 = i9 >> 3;
                                BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierOnSizeChanged2, false, false, textStyleOLrzqt2, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) c48094uEt2, (Function1<? super TextLayoutResult, Unit>) objRememberedValue7, (MutableInteractionSource) null, (Brush) solidColor2, (yHO<? super Function2<? super Composer, ? super java.lang.Integer, Unit>, ? super Composer, ? super java.lang.Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1533853116, true, new Activity(scrollStateRememberScrollState)), composerStartRestartGroup, (i132 & 14) | (i132 & WalletImportError.ERROR_CODE_AA_EXIST), 196992, 10200);
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                TextRange textRangeM4911boximpl2 = TextRange.m4911boximpl(textFieldValue.m5142getSelectiond9O1mEE());
                                composer2 = composerStartRestartGroup;
                                composer2.startReplaceableGroup(2143686761);
                                zChanged7 = composer2.changed(fMo516toPx0680j_4);
                                if (i8 != 32) {
                                }
                                zChanged8 = composer2.changed(scrollState);
                                objRememberedValue8 = composer2.rememberedValue();
                                if (!(zChanged7 | z3 | zChanged8)) {
                                    BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1 botMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$12 = new BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1(fMo516toPx0680j_4, textFieldValue, scrollState, mutableState, mutableIntState, null);
                                    composer2.updateRememberedValue(botMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$12);
                                    objRememberedValue8 = botMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$12;
                                    composer2.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(textRangeM4911boximpl2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue8, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
                                    str4 = str3;
                                    i10 = i7;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Unit KWHzl(CoroutineScope coroutineScope, ScrollState scrollState, float f, TextFieldValue textFieldValue, MutableState mutableState, MutableIntState mutableIntState, IntSize intSize) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1(intSize, scrollState, f, textFieldValue, mutableState, mutableIntState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uEl$Activity */
    public static final class Activity implements yHO<Function2<? super Composer, ? super java.lang.Integer, ? extends Unit>, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ ScrollState AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ScrollState scrollState) {
            this.AEQbTJ = scrollState;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(Function2<? super Composer, ? super java.lang.Integer, ? extends Unit> function2, Composer composer, java.lang.Integer num) {
            OLrzqt(function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Function2<? super Composer, ? super java.lang.Integer, Unit> function2, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(function2, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changedInstance(function2) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1533853116, i2, -1, "com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorComposable.<anonymous>.<anonymous> (BotMarkdownEditorComposable.kt:124)");
                }
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(ScrollKt.verticalScroll$default(Modifier.Companion, this.AEQbTJ, false, null, false, 14, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(10), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 5, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composer, java.lang.Integer.valueOf(i2 & 14));
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
    }

    public static final Unit KWHzl(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "");
        OLrzqt(mutableState, textLayoutResult);
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(TextFieldValue textFieldValue, TextLayoutResult textLayoutResult, float f, float f2) {
        int iAEQbTJ = AEQbTJ(textFieldValue, textLayoutResult);
        return textLayoutResult.getLineBottom(iAEQbTJ) <= f + f2 && textLayoutResult.getLineTop(iAEQbTJ) >= f2;
    }

    public static final float AEQbTJ(TextFieldValue textFieldValue, TextLayoutResult textLayoutResult, float f, float f2) {
        int iAEQbTJ = AEQbTJ(textFieldValue, textLayoutResult);
        float lineTop = textLayoutResult.getLineTop(iAEQbTJ);
        float lineBottom = textLayoutResult.getLineBottom(iAEQbTJ);
        if (lineTop < f2) {
            return -(f2 - lineTop);
        }
        float f3 = f + f2;
        if (lineBottom > f3) {
            return lineBottom - f3;
        }
        return 0.0f;
    }

    public static final float OLrzqt(TextFieldValue textFieldValue, TextLayoutResult textLayoutResult, float f, float f2, float f3) {
        float lineBottom = textLayoutResult.getLineBottom(AEQbTJ(textFieldValue, textLayoutResult));
        if (lineBottom > f + f3 || f2 + f3 > lineBottom) {
            return 0.0f;
        }
        return (f - f2) - (f - (lineBottom - f3));
    }

    public static final int AEQbTJ(TextFieldValue textFieldValue, TextLayoutResult textLayoutResult) {
        try {
            return textLayoutResult.getLineForOffset(TextRange.m4921getMinimpl(textFieldValue.m5142getSelectiond9O1mEE()));
        } catch (java.lang.IllegalArgumentException unused) {
            pUU.copydefault("BotMarkdownEditor", "Corrected Wrong Offset: " + TextRange.m4921getMinimpl(textFieldValue.m5142getSelectiond9O1mEE()));
            return textLayoutResult.getLineForOffset(C56548yJl.copydefault(TextRange.m4921getMinimpl(textFieldValue.m5142getSelectiond9O1mEE()) - 1, 0));
        }
    }

    public static final int KWHzl(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void AEQbTJ(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final TextLayoutResult KWHzl(MutableState<TextLayoutResult> mutableState) {
        return mutableState.getValue();
    }

    public static final void OLrzqt(MutableState<TextLayoutResult> mutableState, TextLayoutResult textLayoutResult) {
        mutableState.setValue(textLayoutResult);
    }
}
