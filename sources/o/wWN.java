package o;

import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.uLU;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes19.dex */
public final class wWN {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i2, int i3, Composer composer, int i4) {
        AEQbTJ(modifier, i, str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, Modifier modifier2, Modifier modifier3, uLU ulu, Function0 function0, yHO yho, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, modifier2, modifier3, ulu, function0, yho, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, int i, java.lang.String str, int i2, int i3, Composer composer, int i4) {
        AEQbTJ(modifier, i, str, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(Modifier modifier, Modifier modifier2, Modifier modifier3, @NotNull final uLU<?> ulu, Function0<Unit> function0, @NotNull final yHO<? super BoxScope, ? super Composer, ? super java.lang.Integer, Unit> yho, Composer composer, final int i, final int i2) {
        Modifier modifier4;
        int i3;
        Modifier modifier5;
        int i4;
        Modifier modifier6;
        int i5;
        Function0<Unit> function02;
        Function0<Unit> function03;
        boolean z;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        Modifier modifier7;
        final Modifier modifier8;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ulu, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-447687698);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier4 = modifier;
        } else if ((i & 6) == 0) {
            modifier4 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier4) ? 4 : 2) | i;
        } else {
            modifier4 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier5 = modifier2;
                i3 |= composerStartRestartGroup.changed(modifier5) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    modifier6 = modifier3;
                    i3 |= composerStartRestartGroup.changed(modifier6) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(ulu) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(yho) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier9 = i6 == 0 ? Modifier.Companion : modifier4;
                        Modifier modifier10 = i7 == 0 ? Modifier.Companion : modifier5;
                        Modifier modifier11 = i4 == 0 ? Modifier.Companion : modifier6;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(409478842);
                            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: o.wWV
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return wWN.EZpvd();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function03 = (Function0) objRememberedValue;
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-447687698, i3, -1, "com.okinc.tradingbot.impl.widget.compose.StatefulView (StatefulView.kt:27)");
                        }
                        z = !(ulu instanceof uLU.TaskDescription) && ((uLU.TaskDescription) ulu).AEQbTJ();
                        boolean z2 = ulu instanceof uLU.Activity;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion = Alignment.Companion;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier9);
                        Modifier modifier12 = modifier9;
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
                        if (!z) {
                            composerStartRestartGroup.startReplaceableGroup(1112590207);
                            copydefault(boxScopeInstance.align(modifier10, companion.getCenter()), composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier7 = modifier11;
                        } else if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(1112694925);
                            modifier7 = modifier11;
                            AEQbTJ(boxScopeInstance.align(modifier11, companion.getCenter()), 0, null, null, null, function03, composerStartRestartGroup, (i3 << 3) & 458752, 30);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            modifier7 = modifier11;
                            composerStartRestartGroup.startReplaceableGroup(1112853738);
                            yho.invoke(boxScopeInstance, composerStartRestartGroup, java.lang.Integer.valueOf(((i3 >> 12) & WalletImportError.ERROR_CODE_AA_EXIST) | 6));
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier8 = modifier10;
                        modifier6 = modifier7;
                        function04 = function03;
                        modifier4 = modifier12;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier8 = modifier5;
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier13 = modifier4;
                        final Modifier modifier14 = modifier6;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWT
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return wWN.KWHzl(modifier13, modifier8, modifier14, ulu, function04, yho, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (ulu instanceof uLU.TaskDescription) {
                        boolean z22 = ulu instanceof uLU.Activity;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.Companion;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier9);
                        Modifier modifier122 = modifier9;
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
                            if (!z) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier8 = modifier10;
                            modifier6 = modifier7;
                            function04 = function03;
                            modifier4 = modifier122;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier6 = modifier3;
            if ((i2 & 8) != 0) {
            }
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier5 = modifier2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier6 = modifier3;
        if ((i2 & 8) != 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void copydefault(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1093396658);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1093396658, i3, -1, "com.okinc.tradingbot.impl.widget.compose.LoadingView (StatefulView.kt:46)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1066162941);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.wWZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return wWN.AEQbTJ((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1066161008);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.wXa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return wWN.copydefault((C55113xdn) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) objRememberedValue2, composerStartRestartGroup, ((i3 << 3) & WalletImportError.ERROR_CODE_AA_EXIST) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return wWN.EZpvd(modifier, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final C55113xdn AEQbTJ(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C55113xdn(context, null, 0, 6, null);
    }

    public static final Unit copydefault(C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        c55113xdn.KWHzl(0L);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, int i, java.lang.String str, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-643041317);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(str)) ? 256 : 128;
        }
        if ((i4 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                AEQbTJ(modifier, i, null, str, null, null, composerStartRestartGroup, (i4 & 14) | 221568 | (i4 & WalletImportError.ERROR_CODE_AA_EXIST) | ((i4 << 3) & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (i5 != 0) {
                    modifier = Modifier.Companion;
                }
                if (i6 != 0) {
                    i = 6;
                }
                if ((i3 & 4) != 0) {
                    str = C33070mpX.AYXKKw(C55688xof.Application.putInt);
                    i4 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-643041317, i4, -1, "com.okinc.tradingbot.impl.widget.compose.EmptyView (StatefulView.kt:63)");
                }
                AEQbTJ(modifier, i, null, str, null, null, composerStartRestartGroup, (i4 & 14) | 221568 | (i4 & WalletImportError.ERROR_CODE_AA_EXIST) | ((i4 << 3) & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final int i7 = i;
        final java.lang.String str2 = str;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return wWN.OLrzqt(modifier2, i7, str2, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        int i6;
        Function0<Unit> function02;
        Modifier modifier3;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        boolean z2;
        Modifier modifier4;
        boolean z3;
        boolean z4;
        boolean zChanged;
        java.lang.Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(412661103);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 48) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i2 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i3 & 4) == 0) {
                    strAYXKKw = str;
                    int i9 = composerStartRestartGroup.changed(strAYXKKw) ? 256 : 128;
                    i4 |= i9;
                } else {
                    strAYXKKw = str;
                }
                i4 |= i9;
            } else {
                strAYXKKw = str;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    strAYXKKw2 = str2;
                    int i10 = composerStartRestartGroup.changed(strAYXKKw2) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    strAYXKKw2 = str2;
                }
                i4 |= i10;
            } else {
                strAYXKKw2 = str2;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    strAYXKKw3 = str3;
                    int i11 = composerStartRestartGroup.changed(strAYXKKw3) ? 16384 : 8192;
                    i4 |= i11;
                } else {
                    strAYXKKw3 = str3;
                }
                i4 |= i11;
            } else {
                strAYXKKw3 = str3;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
            }
            if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.Companion : modifier2;
                    if (i8 != 0) {
                        i5 = 8;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityApi33Impl);
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.putInt);
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.AuCTel);
                    }
                    if (i6 != 0) {
                        function02 = null;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(412661103, i4, -1, "com.okinc.tradingbot.impl.widget.compose.EmptyView (StatefulView.kt:82)");
                }
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i4 >> 15) & 14);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(287041942);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.wWS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return wWN.copydefault((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(287044314);
                z = (((i4 & FaceDetector.NUM_BOXES) ^ MLKEMEngine.KyberPolyBytes) <= 256 && composerStartRestartGroup.changed(strAYXKKw)) || (i4 & MLKEMEngine.KyberPolyBytes) == 256;
                z2 = (((i4 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(strAYXKKw2)) || (i4 & 3072) == 2048;
                modifier4 = modifier3;
                z3 = (i4 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
                z4 = (((57344 & i4) ^ 24576) > 16384 && composerStartRestartGroup.changed(strAYXKKw3)) || (i4 & 24576) == 16384;
                zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if ((z3 | z2 | z | z4 | zChanged) || objRememberedValue2 == companion.getEmpty()) {
                    final java.lang.String str4 = strAYXKKw;
                    final java.lang.String str5 = strAYXKKw2;
                    final int i12 = i5;
                    final java.lang.String str6 = strAYXKKw3;
                    objRememberedValue2 = new Function1() { // from class: o.wWU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return wWN.OLrzqt(str4, str5, i12, str6, stateRememberUpdatedState, (C55173xeu) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function1, modifierFillMaxWidth$default, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            final int i13 = i5;
            final java.lang.String str7 = strAYXKKw;
            final java.lang.String str8 = strAYXKKw2;
            final java.lang.String str9 = strAYXKKw3;
            final Function0<Unit> function03 = function02;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return wWN.KWHzl(modifier5, i13, str7, str8, str9, function03, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        i5 = i;
        if ((i2 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        if ((i4 & 74899) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function02, composerStartRestartGroup, (i4 >> 15) & 14);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(287041942);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(287044314);
                if (((i4 & FaceDetector.NUM_BOXES) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                    if (((i4 & 7168) ^ 3072) > 2048) {
                        modifier4 = modifier3;
                        if ((i4 & WalletImportError.ERROR_CODE_AA_EXIST) == 32) {
                        }
                        if (((57344 & i4) ^ 24576) > 16384) {
                            zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z3 | z2 | z | z4 | zChanged) {
                                final java.lang.String str42 = strAYXKKw;
                                final java.lang.String str52 = strAYXKKw2;
                                final int i122 = i5;
                                final java.lang.String str62 = strAYXKKw3;
                                objRememberedValue2 = new Function1() { // from class: o.wWU
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return wWN.OLrzqt(str42, str52, i122, str62, stateRememberUpdatedState, (C55173xeu) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifierFillMaxWidth$default2, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        } else {
                            zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z3 | z2 | z | z4 | zChanged) {
                            }
                        }
                    } else {
                        modifier4 = modifier3;
                        if ((i4 & WalletImportError.ERROR_CODE_AA_EXIST) == 32) {
                        }
                        if (((57344 & i4) ^ 24576) > 16384) {
                        }
                    }
                } else {
                    if (((i4 & 7168) ^ 3072) > 2048) {
                    }
                }
            }
        }
        final int i132 = i5;
        final java.lang.String str72 = strAYXKKw;
        final java.lang.String str82 = strAYXKKw2;
        final java.lang.String str92 = strAYXKKw3;
        final Function0 function032 = function02;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final C55173xeu copydefault(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C55173xeu(context, null, 0, 6, null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, androidx.compose.runtime.State state, C55173xeu c55173xeu) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        if (str != null) {
            c55173xeu.setTitle(str);
        }
        if (str2 != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        }
        c55173xeu.setEmptyTypeImage(i);
        if (str3 != null) {
            c55173xeu.setRetry(str3);
        }
        final Function0<Unit> function0KWHzl = KWHzl((androidx.compose.runtime.State<? extends Function0<Unit>>) state);
        if (function0KWHzl != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.wXb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wWN.AEQbTJ(function0KWHzl, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final Function0<Unit> KWHzl(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
