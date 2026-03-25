package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.widget.TextViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.widget.compose.BotIconStacksStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52716wVs;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52716wVs {

    /* JADX INFO: renamed from: o.wVs$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotIconStacksStyle.values().length];
            try {
                iArr[BotIconStacksStyle.COMPACT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotIconStacksStyle.SPACIOUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, java.util.List list, int i, int i2, float f, int i3, Composer composer, int i4) {
        copydefault(modifier, (java.util.List<java.lang.String>) list, i, i2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, java.util.List list, int i, float f, int i2, boolean z, int i3, int i4, Composer composer, int i5) {
        copydefault(modifier, list, i, f, i2, z, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, java.util.List list, float f, int i, int i2, BotIconStacksStyle botIconStacksStyle, boolean z, int i3, int i4, Composer composer, int i5) {
        AEQbTJ(modifier, list, f, i, i2, botIconStacksStyle, z, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, DisplaySign displaySign, int i, int i2, int i3, int i4, Composer composer, int i5) {
        copydefault(modifier, displaySign, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(Modifier modifier, java.util.List list, float f, int i, int i2, BotIconStacksStyle botIconStacksStyle, boolean z, int i3, int i4, Composer composer, int i5) {
        AEQbTJ(modifier, list, f, i, i2, botIconStacksStyle, z, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, @NotNull final java.util.List<java.lang.String> list, float f, int i, int i2, BotIconStacksStyle botIconStacksStyle, boolean z, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        final float fM5414constructorimpl;
        final int i12;
        int i13;
        final BotIconStacksStyle botIconStacksStyle2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(list, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1533171120);
        int i14 = i4 & 1;
        if (i14 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i15 = i4 & 4;
        if (i15 != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                f2 = f;
                i5 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    i7 = i;
                    i5 |= composerStartRestartGroup.changed(i7) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                    if ((i3 & 24576) == 0) {
                        i9 = i2;
                        i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= composerStartRestartGroup.changed(botIconStacksStyle) ? 131072 : 65536;
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                    }
                    if ((i5 & 599187) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        botIconStacksStyle2 = botIconStacksStyle;
                        fM5414constructorimpl = f2;
                        i12 = i7;
                        i13 = i9;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        fM5414constructorimpl = i15 == 0 ? androidx.compose.ui.unit.Dp.m5414constructorimpl(20) : f2;
                        i12 = i6 == 0 ? 8 : i7;
                        i13 = i8 == 0 ? 2 : i9;
                        BotIconStacksStyle botIconStacksStyle3 = i10 == 0 ? BotIconStacksStyle.COMPACT : botIconStacksStyle;
                        boolean z3 = i11 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1533171120, i5, -1, "com.okinc.tradingbot.impl.widget.compose.BotIconStacks (BotIconStacks.kt:66)");
                        }
                        if (!list.isEmpty()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                final Modifier modifier3 = modifier2;
                                final int i16 = i13;
                                final BotIconStacksStyle botIconStacksStyle4 = botIconStacksStyle3;
                                final boolean z4 = z3;
                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: o.wVt
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return C52716wVs.OLrzqt(modifier3, list, fM5414constructorimpl, i12, i16, botIconStacksStyle4, z4, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1538078818);
                        boolean zChanged = composerStartRestartGroup.changed(list);
                        int i17 = i5 & 57344;
                        boolean z5 = i17 == 16384;
                        java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if ((zChanged | z5) || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, i13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        java.util.List list2 = (java.util.List) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(1538081635);
                        boolean zChanged2 = composerStartRestartGroup.changed(list);
                        boolean z6 = i17 == 16384;
                        java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if ((zChanged2 | z6) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = java.lang.Integer.valueOf(list.size() - i13);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        int iIntValue = ((java.lang.Number) objRememberedValue2).intValue();
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = ActionBar.KWHzl[botIconStacksStyle3.ordinal()];
                        if (i18 == 1) {
                            composerStartRestartGroup.startReplaceableGroup(1538085733);
                            int i19 = i5 << 3;
                            copydefault(modifier2, list2, iIntValue, fM5414constructorimpl, i12, z3, composerStartRestartGroup, (i19 & 57344) | (i5 & 14) | (i19 & 7168) | ((i5 >> 3) & 458752), 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (i18 != 2) {
                                composerStartRestartGroup.startReplaceableGroup(1538084346);
                                composerStartRestartGroup.endReplaceableGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceableGroup(1538095221);
                            copydefault(modifier2, (java.util.List<java.lang.String>) list2, iIntValue, list.size(), fM5414constructorimpl, composerStartRestartGroup, (i5 & 14) | ((i5 << 6) & 57344));
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        botIconStacksStyle2 = botIconStacksStyle3;
                        z2 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final int i20 = i13;
                        final boolean z7 = z2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C52716wVs.copydefault(modifier4, list, fM5414constructorimpl, i12, i20, botIconStacksStyle2, z7, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                i9 = i2;
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) != 599186) {
                    if (i14 != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!list.isEmpty()) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i2;
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        f2 = f;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i2;
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145  */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(final Modifier modifier, final java.util.List<java.lang.String> list, final int i, final float f, final int i2, boolean z, Composer composer, final int i3, final int i4) {
        int i5;
        boolean z2;
        int i6;
        boolean zChangedInstance;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1544610312);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
        }
        int i7 = i4 & 32;
        if (i7 == 0) {
            if ((196608 & i3) == 0) {
                z2 = z;
                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
            }
            i6 = i5;
            if ((74899 & i6) == 74898 || !composerStartRestartGroup.getSkipping()) {
                boolean z7 = i7 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1544610312, i6, -1, "com.okinc.tradingbot.impl.widget.compose.CompactIconStacks (BotIconStacks.kt:103)");
                }
                Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(modifier, f);
                composerStartRestartGroup.startReplaceableGroup(-1595892548);
                zChangedInstance = composerStartRestartGroup.changedInstance(list);
                ?? r8 = 0;
                z3 = (i6 & 7168) != 2048;
                z4 = (i6 & FaceDetector.NUM_BOXES) != 256;
                z5 = (57344 & i6) != 16384;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChangedInstance | z3 | z4 | z5) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Application(list, i, f, i2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM704height3ABfNKs);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(1877246073);
                int i8 = 0;
                for (java.lang.Object obj : list) {
                    if (i8 < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m718size3ABfNKs(companion2, f), RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), r8, composerStartRestartGroup, r8);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
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
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    C52727wWc.OLrzqt(SizeKt.m718size3ABfNKs(companion2, f), str, C52761wXj.TaskDescription.DuR, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    i8++;
                    r8 = 0;
                }
                boolean z8 = r8;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1877262721);
                if (i > 0) {
                    Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(BackgroundKt.m349backgroundbw27NRU(BorderKt.m361borderxT4_qwU(ClipKt.clip(SizeKt.m718size3ABfNKs(Modifier.Companion, f), RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.unit.Dp.m5414constructorimpl(z7 ? 1 : z8 ? 1.0f : 0.0f), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialaKhcqp, composerStartRestartGroup, z8 ? 1 : 0), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialDPHOMC, composerStartRestartGroup, z8 ? 1 : 0), RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.unit.Dp.m5414constructorimpl(2), 0.0f, 2, null);
                    Alignment center = Alignment.Companion.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, z8, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z8 ? 1 : 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM673paddingVpY3zN4$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                        composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, java.lang.Integer.valueOf(z8 ? 1 : 0));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    copydefault((Modifier) null, DisplaySign.EXCEPT_ZERO, 12, i, composerStartRestartGroup, ((i6 << 3) & 7168) | 432, 1);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z6 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return C52716wVs.KWHzl(modifier, list, i, f, i2, z6, i3, i4, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        i6 = i5;
        if ((74899 & i6) == 74898) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM704height3ABfNKs2 = SizeKt.m704height3ABfNKs(modifier, f);
            composerStartRestartGroup.startReplaceableGroup(-1595892548);
            zChangedInstance = composerStartRestartGroup.changedInstance(list);
            ?? r82 = 0;
            if ((i6 & 7168) != 2048) {
            }
            if ((i6 & FaceDetector.NUM_BOXES) != 256) {
            }
            if ((57344 & i6) != 16384) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChangedInstance | z3 | z4 | z5)) {
                objRememberedValue = new Application(list, i, f, i2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM704height3ABfNKs2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM2783constructorimpl.getInserting()) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    yhoModifierMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(1877246073);
                    int i82 = 0;
                    while (r9.hasNext()) {
                    }
                    boolean z82 = r82;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1877262721);
                    if (i > 0) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z6 = z7;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: renamed from: o.wVs$Application */
    public static final class Application implements MeasurePolicy {
        public final /* synthetic */ float AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ java.util.List<java.lang.String> OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.util.List<java.lang.String> list, int i, float f, int i2) {
            this.OLrzqt = list;
            this.EZpvd = i;
            this.AEQbTJ = f;
            this.copydefault = i2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo202measure3p2s80s(final MeasureScope measureScope, java.util.List<? extends Measurable> list, long j) {
            Intrinsics.checkNotNullParameter(measureScope, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, this.OLrzqt.size());
            float f = this.AEQbTJ;
            final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(((Measurable) it.next()).mo4385measureBRTryo0(Constraints.Companion.m5378fixedJhjzzOo(measureScope.mo510roundToPx0680j_4(f), measureScope.mo510roundToPx0680j_4(f))));
            }
            final Placeable placeableMo4385measureBRTryo0 = (this.EZpvd <= 0 || list.size() <= this.OLrzqt.size()) ? null : ((Measurable) CollectionsKt___CollectionsKt.AubY(list)).mo4385measureBRTryo0(Constraints.m5361copyZbe2FdA$default(j, measureScope.mo510roundToPx0680j_4(this.AEQbTJ), 0, measureScope.mo510roundToPx0680j_4(this.AEQbTJ), 0, 10, null));
            int iMo510roundToPx0680j_4 = arrayList.isEmpty() ^ true ? measureScope.mo510roundToPx0680j_4(this.AEQbTJ) + ((arrayList.size() - 1) * measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(this.copydefault))) : 0;
            if (placeableMo4385measureBRTryo0 != null) {
                iMo510roundToPx0680j_4 = java.lang.Math.max(iMo510roundToPx0680j_4, (this.OLrzqt.size() * measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(this.copydefault))) + placeableMo4385measureBRTryo0.getWidth());
            }
            int i = iMo510roundToPx0680j_4;
            int iMo510roundToPx0680j_42 = measureScope.mo510roundToPx0680j_4(this.AEQbTJ);
            final java.util.List<java.lang.String> list2 = this.OLrzqt;
            final int i2 = this.copydefault;
            return MeasureScope.layout$default(measureScope, i, iMo510roundToPx0680j_42, null, new Function1() { // from class: o.wVD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52716wVs.Application.copydefault(arrayList, placeableMo4385measureBRTryo0, list2, measureScope, i2, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }

        public static final Unit copydefault(java.util.List list, Placeable placeable, java.util.List list2, MeasureScope measureScope, int i, Placeable.PlacementScope placementScope) {
            Intrinsics.checkNotNullParameter(placementScope, "");
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i2 * measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(i)), 0, 0.0f, 4, null);
                i2++;
            }
            if (placeable != null) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, list2.size() * measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(i)), 0, 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(final Modifier modifier, final java.util.List<java.lang.String> list, final int i, final int i2, final float f, Composer composer, final int i3) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1378463498);
        int i4 = (i3 & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        int i5 = i4;
        if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1378463498, i5, -1, "com.okinc.tradingbot.impl.widget.compose.SpaciousIconStacks (BotIconStacks.kt:206)");
            }
            int i6 = (int) (0.3333f * f);
            float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(12);
            Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(modifier, f);
            composerStartRestartGroup.startReplaceableGroup(325141504);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            boolean z = (57344 & i5) == 16384;
            boolean z2 = (i5 & FaceDetector.NUM_BOXES) == 256;
            boolean zChanged = composerStartRestartGroup.changed(i6);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z | z2 | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                StateListAnimator stateListAnimator = new StateListAnimator(list, i, fM5414constructorimpl, f, i6);
                composerStartRestartGroup.updateRememberedValue(stateListAnimator);
                objRememberedValue = stateListAnimator;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            int i7 = -1323940314;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM704height3ABfNKs);
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
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(1820870032);
            for (java.lang.String str : list) {
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM350backgroundbw27NRU$default = BackgroundKt.m350backgroundbw27NRU$default(ClipKt.clip(SizeKt.m718size3ABfNKs(companion2, f), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(C52761wXj.Activity.EZpvd, composerStartRestartGroup, 0), null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(i7);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM350backgroundbw27NRU$default);
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
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                C52727wWc.OLrzqt(PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d)), str, C52761wXj.TaskDescription.DuR, composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                i7 = -1323940314;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1820891143);
            if (i > 0) {
                Modifier modifierM349backgroundbw27NRU = BackgroundKt.m349backgroundbw27NRU(BorderKt.m361borderxT4_qwU(SizeKt.m718size3ABfNKs(Modifier.Companion, fM5414constructorimpl), androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 0.5d), ColorResources_androidKt.colorResource(C52761wXj.Activity.zuBGHE, composerStartRestartGroup, 0), RoundedCornerShapeKt.getCircleShape()), ColorResources_androidKt.colorResource(C52761wXj.Activity.djBIcL, composerStartRestartGroup, 0), RoundedCornerShapeKt.getCircleShape());
                Alignment center = Alignment.Companion.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM349backgroundbw27NRU);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                    composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2 = composerStartRestartGroup;
                copydefault((Modifier) null, (DisplaySign) null, 10, i2, composer2, (i5 & 7168) | MLKEMEngine.KyberPolyBytes, 3);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C52716wVs.EZpvd(modifier, list, i, i2, f, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.wVs$StateListAnimator */
    public static final class StateListAnimator implements MeasurePolicy {
        public final /* synthetic */ java.util.List<java.lang.String> AEQbTJ;
        public final /* synthetic */ float EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.util.List<java.lang.String> list, int i, float f, float f2, int i2) {
            this.AEQbTJ = list;
            this.OLrzqt = i;
            this.EZpvd = f;
            this.copydefault = f2;
            this.KWHzl = i2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo202measure3p2s80s(final MeasureScope measureScope, java.util.List<? extends Measurable> list, long j) {
            Intrinsics.checkNotNullParameter(measureScope, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, this.AEQbTJ.size());
            float f = this.copydefault;
            final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(((Measurable) it.next()).mo4385measureBRTryo0(Constraints.Companion.m5378fixedJhjzzOo(measureScope.mo510roundToPx0680j_4(f), measureScope.mo510roundToPx0680j_4(f))));
            }
            final Placeable placeableMo4385measureBRTryo0 = (this.OLrzqt <= 0 || list.size() <= this.AEQbTJ.size()) ? null : ((Measurable) CollectionsKt___CollectionsKt.AubY(list)).mo4385measureBRTryo0(Constraints.Companion.m5378fixedJhjzzOo(measureScope.mo510roundToPx0680j_4(this.EZpvd), measureScope.mo510roundToPx0680j_4(this.EZpvd)));
            final int iMo510roundToPx0680j_4 = arrayList.isEmpty() ^ true ? measureScope.mo510roundToPx0680j_4(this.copydefault) + ((arrayList.size() - 1) * measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(this.KWHzl))) : 0;
            final int iMo510roundToPx0680j_42 = measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(2));
            int iMax = placeableMo4385measureBRTryo0 != null ? java.lang.Math.max(iMo510roundToPx0680j_4, (iMo510roundToPx0680j_4 - measureScope.mo510roundToPx0680j_4(this.EZpvd)) + iMo510roundToPx0680j_42 + placeableMo4385measureBRTryo0.getWidth()) : iMo510roundToPx0680j_4;
            int iMo510roundToPx0680j_43 = measureScope.mo510roundToPx0680j_4(this.copydefault);
            final float f2 = this.EZpvd;
            final float f3 = this.copydefault;
            final int i = this.KWHzl;
            return MeasureScope.layout$default(measureScope, iMax, iMo510roundToPx0680j_43, null, new Function1() { // from class: o.wVC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52716wVs.StateListAnimator.OLrzqt(arrayList, placeableMo4385measureBRTryo0, iMo510roundToPx0680j_4, measureScope, f2, iMo510roundToPx0680j_42, f3, i, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }

        public static final Unit OLrzqt(java.util.List list, Placeable placeable, int i, MeasureScope measureScope, float f, int i2, float f2, int i3, Placeable.PlacementScope placementScope) {
            Intrinsics.checkNotNullParameter(placementScope, "");
            int i4 = 0;
            for (java.lang.Object obj : list) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, measureScope.mo510roundToPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(i3)) * i4, 0, 0.0f, 4, null);
                i4++;
            }
            if (placeable != null) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - measureScope.mo510roundToPx0680j_4(f)) + i2, measureScope.mo510roundToPx0680j_4(f2) - placeable.getHeight(), 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(Modifier modifier, DisplaySign displaySign, int i, final int i2, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        DisplaySign displaySign2;
        int i6;
        final int i7;
        Modifier modifier3;
        final DisplaySign displaySign3;
        boolean z;
        java.lang.Object objRememberedValue;
        boolean z2;
        boolean z3;
        java.lang.Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1009562850);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i9 = i4 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                displaySign2 = displaySign;
                i5 |= composerStartRestartGroup.changed(displaySign2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i7 = i;
                    i5 |= composerStartRestartGroup.changed(i7) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changed(i2) ? 2048 : 1024;
                }
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i8 == 0 ? Modifier.Companion : modifier2;
                    displaySign3 = i9 == 0 ? DisplaySign.AUTO : displaySign2;
                    if (i6 != 0) {
                        i7 = 12;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1009562850, i5, -1, "com.okinc.tradingbot.impl.widget.compose.Counter (BotIconStacks.kt:304)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-109863473);
                    z = (i5 & FaceDetector.NUM_BOXES) != 256;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: o.wVw
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C52716wVs.copydefault(i7, (android.content.Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-109847004);
                    z2 = (i5 & 7168) != 2048;
                    z3 = (i5 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | z3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.wVy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C52716wVs.OLrzqt(i2, displaySign3, (AppCompatTextView) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function1, modifierFillMaxSize$default, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    displaySign2 = displaySign3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                final int i10 = i7;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final DisplaySign displaySign4 = displaySign2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wVA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C52716wVs.copydefault(modifier4, displaySign4, i10, i2, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= MLKEMEngine.KyberPolyBytes;
            i7 = i;
            if ((i4 & 8) != 0) {
            }
            if ((i5 & 1171) != 1170) {
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-109863473);
                if ((i5 & FaceDetector.NUM_BOXES) != 256) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: o.wVw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C52716wVs.copydefault(i7, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function12 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-109847004);
                    if ((i5 & 7168) != 2048) {
                    }
                    if ((i5 & WalletImportError.ERROR_CODE_AA_EXIST) == 32) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | z3)) {
                        objRememberedValue2 = new Function1() { // from class: o.wVy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C52716wVs.OLrzqt(i2, displaySign3, (AppCompatTextView) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(function12, modifierFillMaxSize$default2, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        displaySign2 = displaySign3;
                    }
                }
            }
            final int i102 = i7;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        displaySign2 = displaySign;
        i6 = i4 & 4;
        if (i6 != 0) {
        }
        i7 = i;
        if ((i4 & 8) != 0) {
        }
        if ((i5 & 1171) != 1170) {
        }
        final int i1022 = i7;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final AppCompatTextView copydefault(int i, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.USBtdM);
        appCompatTextView.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, context));
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatTextView, 6, i, 1, 2);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        return appCompatTextView;
    }

    public static final Unit OLrzqt(int i, DisplaySign displaySign, AppCompatTextView appCompatTextView) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        appCompatTextView.setText(pTB.formatICUNumber$default(java.lang.Integer.valueOf(i), null, C38307pTy.Companion.EZpvd(0), displaySign, null, 9, null));
        return Unit.INSTANCE;
    }
}
