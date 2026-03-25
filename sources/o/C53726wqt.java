package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Density;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C52761wXj;
import o.C53711wqe;
import o.C53726wqt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53726wqt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, LazyListState lazyListState, C53652wpY c53652wpY, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, Function1 function1, int i, int i2, Composer composer, int i3) {
        AEQbTJ(modifier, lazyListState, c53652wpY, planetPublisherPluginPreviewType, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0169 A[EDGE_INSN: B:154:0x0169->B:107:0x0169 BREAK  A[LOOP:0: B:101:0x0152->B:106:0x0166], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, LazyListState lazyListState, C53652wpY c53652wpY, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, Function1<? super java.lang.String, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        C53652wpY c53652wpY2;
        int i4;
        PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType2;
        int i5;
        Function1<? super java.lang.String, Unit> function12;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        int i6;
        final Function1<? super java.lang.String, Unit> function13;
        final C53652wpY c53652wpY3;
        final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType3;
        int i7;
        Density density;
        boolean z;
        java.lang.Object objRememberedValue;
        java.util.Iterator<BotUiState> it;
        int i8;
        java.lang.Integer numValueOf;
        java.lang.Integer num;
        boolean zChanged;
        boolean z2;
        boolean z3;
        boolean zChanged2;
        java.lang.Object objRememberedValue2;
        boolean z4;
        boolean z5;
        boolean z6;
        java.lang.Object objRememberedValue3;
        final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType4;
        final Function1<? super java.lang.String, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-777991248);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i10 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i3 |= i10;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i10;
        } else {
            lazyListState2 = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                c53652wpY2 = c53652wpY;
                i3 |= composerStartRestartGroup.changed(c53652wpY2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
                    i3 |= composerStartRestartGroup.changed(planetPublisherPluginPreviewType2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i9 == 0 ? Modifier.Companion : modifier2;
                            if ((i2 & 2) == 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState2;
                            }
                            if (i11 != 0) {
                                c53652wpY2 = new C53652wpY(yDY.AhwBna());
                            }
                            if (i4 != 0) {
                                planetPublisherPluginPreviewType2 = null;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(1801033132);
                                java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: o.wqw
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return C53726wqt.OLrzqt((java.lang.String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                i6 = i3;
                                function13 = (Function1) objRememberedValue4;
                            }
                            c53652wpY3 = c53652wpY2;
                            planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType2;
                            composerStartRestartGroup.endDefaults();
                            i7 = -1;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-777991248, i6, -1, "com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsList (PlanetOngoingBotsListCompose.kt:56)");
                            }
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(1801038442);
                            int i12 = i6 & FaceDetector.NUM_BOXES;
                            z = i12 == 256;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                                it = c53652wpY3.KWHzl().iterator();
                                i8 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (it.next().isConnected()) {
                                        i7 = i8;
                                        break;
                                    }
                                    i8++;
                                }
                                numValueOf = java.lang.Integer.valueOf(i7);
                                if (numValueOf.intValue() < 0) {
                                    numValueOf = null;
                                }
                                composerStartRestartGroup.updateRememberedValue(numValueOf);
                                objRememberedValue = numValueOf;
                            }
                            num = (java.lang.Integer) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1801049452);
                            zChanged = composerStartRestartGroup.changed(num);
                            int i13 = i6 & 7168;
                            z2 = i13 != 2048;
                            int i14 = i6 & WalletImportError.ERROR_CODE_AA_EXIST;
                            z3 = ((i14 ^ 48) <= 32 && composerStartRestartGroup.changed(lazyListStateRememberLazyListState)) || (i6 & 48) == 32;
                            zChanged2 = composerStartRestartGroup.changed(density);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if ((zChanged | z2 | z3 | zChanged2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = new PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1(num, planetPublisherPluginPreviewType3, lazyListStateRememberLazyListState, density, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
                            PaddingValues paddingValuesM667PaddingValuesa9UjIt4 = PaddingKt.m667PaddingValuesa9UjIt4(PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(12), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(24));
                            composerStartRestartGroup.startReplaceableGroup(1801144722);
                            z4 = i12 != 256;
                            z5 = i13 != 2048;
                            z6 = (57344 & i6) != 16384;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z4 | z5 | z6) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: o.wqv
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C53726wqt.copydefault(c53652wpY3, planetPublisherPluginPreviewType3, function13, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function1<? super java.lang.String, Unit> function15 = function13;
                            LazyDslKt.LazyColumn(modifier3, lazyListStateRememberLazyListState, paddingValuesM667PaddingValuesa9UjIt4, false, horizontalOrVerticalM582spacedBy0680j_4, null, null, false, (Function1) objRememberedValue3, composerStartRestartGroup, (i6 & 14) | 24576 | i14, 232);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            c53652wpY2 = c53652wpY3;
                            planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                            function14 = function15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            modifier3 = modifier2;
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        i6 = i3;
                        function13 = function12;
                        c53652wpY3 = c53652wpY2;
                        planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType2;
                        composerStartRestartGroup.endDefaults();
                        i7 = -1;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1801038442);
                        int i122 = i6 & FaceDetector.NUM_BOXES;
                        if (i122 == 256) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                            it = c53652wpY3.KWHzl().iterator();
                            i8 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                }
                                i8++;
                            }
                            numValueOf = java.lang.Integer.valueOf(i7);
                            if (numValueOf.intValue() < 0) {
                            }
                            composerStartRestartGroup.updateRememberedValue(numValueOf);
                            objRememberedValue = numValueOf;
                            num = (java.lang.Integer) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1801049452);
                            zChanged = composerStartRestartGroup.changed(num);
                            int i132 = i6 & 7168;
                            if (i132 != 2048) {
                            }
                            int i142 = i6 & WalletImportError.ERROR_CODE_AA_EXIST;
                            if ((i142 ^ 48) <= 32) {
                                zChanged2 = composerStartRestartGroup.changed(density);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged | z2 | z3 | zChanged2) {
                                    objRememberedValue2 = new PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1(num, planetPublisherPluginPreviewType3, lazyListStateRememberLazyListState, density, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2, composerStartRestartGroup, 0);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16));
                                    PaddingValues paddingValuesM667PaddingValuesa9UjIt42 = PaddingKt.m667PaddingValuesa9UjIt4(PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(12), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.AEQbTJ, composerStartRestartGroup, 0), androidx.compose.ui.unit.Dp.m5414constructorimpl(24));
                                    composerStartRestartGroup.startReplaceableGroup(1801144722);
                                    if (i122 != 256) {
                                    }
                                    if (i132 != 2048) {
                                    }
                                    if ((57344 & i6) != 16384) {
                                    }
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!(z4 | z5 | z6)) {
                                        objRememberedValue3 = new Function1() { // from class: o.wqv
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return C53726wqt.copydefault(c53652wpY3, planetPublisherPluginPreviewType3, function13, (LazyListScope) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Function1<? super java.lang.String, Unit> function152 = function13;
                                        LazyDslKt.LazyColumn(modifier3, lazyListStateRememberLazyListState, paddingValuesM667PaddingValuesa9UjIt42, false, horizontalOrVerticalM582spacedBy0680j_42, null, null, false, (Function1) objRememberedValue3, composerStartRestartGroup, (i6 & 14) | 24576 | i142, 232);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        c53652wpY2 = c53652wpY3;
                                        planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType3;
                                        function14 = function152;
                                    }
                                }
                            } else {
                                zChanged2 = composerStartRestartGroup.changed(density);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged | z2 | z3 | zChanged2) {
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        lazyListStateRememberLazyListState = lazyListState2;
                        function14 = function12;
                        planetPublisherPluginPreviewType4 = planetPublisherPluginPreviewType2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                        final C53652wpY c53652wpY4 = c53652wpY2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wqB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C53726wqt.EZpvd(modifier4, lazyListState3, c53652wpY4, planetPublisherPluginPreviewType4, function14, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function12 = function1;
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 == 0) {
                        }
                        if ((i2 & 2) == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            i6 = i3;
                            function13 = function12;
                        }
                        c53652wpY3 = c53652wpY2;
                        planetPublisherPluginPreviewType3 = planetPublisherPluginPreviewType2;
                        composerStartRestartGroup.endDefaults();
                        i7 = -1;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1801038442);
                        int i1222 = i6 & FaceDetector.NUM_BOXES;
                        if (i1222 == 256) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function12 = function1;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        c53652wpY2 = c53652wpY;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Unit copydefault(C53652wpY c53652wpY, final PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, final Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List<BotUiState> listKWHzl = c53652wpY.KWHzl();
        final Function2 function2 = new Function2() { // from class: o.wqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53726wqt.KWHzl(((java.lang.Integer) obj).intValue(), (BotUiState) obj2);
            }
        };
        lazyListScope.items(listKWHzl.size(), new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$lambda$10$lambda$9$$inlined$itemsIndexed$default$1
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
                return function2.invoke(Integer.valueOf(i), listKWHzl.get(i));
            }
        }, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$lambda$10$lambda$9$$inlined$itemsIndexed$default$2
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
                listKWHzl.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$lambda$10$lambda$9$$inlined$itemsIndexed$default$3
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
                BotUiState botUiState = (BotUiState) listKWHzl.get(i);
                composer.startReplaceableGroup(-1394140258);
                PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType2 = planetPublisherPluginPreviewType;
                composer.startReplaceableGroup(-599158075);
                boolean zChanged = composer.changed(function1);
                boolean zChanged2 = composer.changed(botUiState);
                Object objRememberedValue = composer.rememberedValue();
                if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new C53726wqt.ActionBar(function1, botUiState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C53711wqe.EZpvd(null, botUiState, planetPublisherPluginPreviewType2, (Function0) objRememberedValue, composer, 0, 1);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final java.lang.Object KWHzl(int i, BotUiState botUiState) {
        Intrinsics.checkNotNullParameter(botUiState, "");
        return botUiState.KWHzl();
    }

    /* JADX INFO: renamed from: o.wqt$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ Function1<java.lang.String, Unit> AEQbTJ;
        public final /* synthetic */ BotUiState KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.String, Unit> function1, BotUiState botUiState) {
            this.AEQbTJ = function1;
            this.KWHzl = botUiState;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            this.AEQbTJ.invoke(this.KWHzl.KWHzl());
        }
    }
}
