package o;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.resources.TextAppearance;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC38172pOx;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pOv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38170pOv {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.lang.String str, Modifier modifier, TextStyle textStyle, int i, boolean z, int i2, int i3, AbstractC38172pOx abstractC38172pOx, int i4, int i5, Composer composer, int i6) {
        EZpvd(str, modifier, textStyle, i, z, i2, i3, abstractC38172pOx, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(@NotNull final java.lang.String str, Modifier modifier, TextStyle textStyle, int i, boolean z, int i2, int i3, AbstractC38172pOx abstractC38172pOx, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        int iM5334getEllipsisgIe3tQ8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        final AbstractC38172pOx application;
        Modifier modifier3;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        final MutableState mutableState;
        java.lang.Object objRememberedValue2;
        final MutableState mutableState2;
        java.lang.Object objRememberedValue3;
        boolean z3;
        java.lang.Object objRememberedValue4;
        final int i14;
        final Modifier modifier4;
        final AbstractC38172pOx abstractC38172pOx2;
        final boolean z4;
        final TextStyle textStyle3;
        final int i15;
        final int i16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1963170290);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        iM5334getEllipsisgIe3tQ8 = i;
                        i6 |= composerStartRestartGroup.changed(iM5334getEllipsisgIe3tQ8) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 != 0) {
                        if ((i4 & 24576) == 0) {
                            z2 = z;
                            i6 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(i3) ? 1048576 : 524288;
                        }
                        if ((i4 & 12582912) == 0) {
                            i6 |= ((i5 & 128) == 0 && composerStartRestartGroup.changed(abstractC38172pOx)) ? 8388608 : 4194304;
                        }
                        if ((i6 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i17 == 0 ? Modifier.Companion : modifier2;
                                if (i7 != 0) {
                                    textStyle2 = TextStyle.Companion.getDefault();
                                }
                                if (i8 != 0) {
                                    iM5334getEllipsisgIe3tQ8 = TextOverflow.Companion.m5334getEllipsisgIe3tQ8();
                                }
                                if (i9 != 0) {
                                    z2 = true;
                                }
                                int i18 = i10 == 0 ? Integer.MAX_VALUE : i2;
                                int i19 = i11 == 0 ? 1 : i3;
                                if ((i5 & 128) == 0) {
                                    i6 &= -29360129;
                                    i12 = i18;
                                    i13 = i19;
                                    modifier3 = modifier5;
                                    application = new AbstractC38172pOx.Application(0L, 1, null);
                                } else {
                                    i12 = i18;
                                    i13 = i19;
                                    application = abstractC38172pOx;
                                    modifier3 = modifier5;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 128) != 0) {
                                    i6 &= -29360129;
                                }
                                i12 = i2;
                                i13 = i3;
                                application = abstractC38172pOx;
                                modifier3 = modifier2;
                            }
                            int i20 = iM5334getEllipsisgIe3tQ8;
                            boolean z5 = z2;
                            TextStyle textStyle4 = textStyle2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1963170290, i6, -1, "com.okinc.lifecycle.ui.composeview.AutoSizeText (AutoSizeText.kt:58)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(1252327795);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textStyle4, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1252329651);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            mutableState2 = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1252332679);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: o.pOy
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C38170pOv.copydefault(mutableState2, (ContentDrawScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            TextStyle textStyleKWHzl = KWHzl(mutableState);
                            composerStartRestartGroup.startReplaceableGroup(1252341407);
                            z3 = (((i6 & 29360128) ^ 12582912) <= 8388608 && composerStartRestartGroup.changed(application)) || (i6 & 12582912) == 8388608;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: o.pOE
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C38170pOv.copydefault(application, mutableState, mutableState2, (TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i21 = i6 << 3;
                            AbstractC38172pOx abstractC38172pOx3 = application;
                            Modifier modifier6 = modifier3;
                            BasicTextKt.m933BasicTextVhcvRP8(str, modifierDrawWithContent, textStyleKWHzl, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, i20, z5, i12, i13, (ColorProducer) null, composerStartRestartGroup, (i6 & 14) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i14 = i20;
                            modifier4 = modifier6;
                            abstractC38172pOx2 = abstractC38172pOx3;
                            z4 = z5;
                            textStyle3 = textStyle4;
                            i15 = i12;
                            i16 = i13;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i16 = i3;
                            modifier4 = modifier2;
                            textStyle3 = textStyle2;
                            i14 = iM5334getEllipsisgIe3tQ8;
                            z4 = z2;
                            i15 = i2;
                            abstractC38172pOx2 = abstractC38172pOx;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.pOB
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return C38170pOv.OLrzqt(str, modifier4, textStyle3, i14, z4, i15, i16, abstractC38172pOx2, i4, i5, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 |= 24576;
                    z2 = z;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    if ((i4 & 12582912) == 0) {
                    }
                    if ((i6 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if ((i5 & 128) == 0) {
                            }
                            int i202 = iM5334getEllipsisgIe3tQ8;
                            boolean z52 = z2;
                            TextStyle textStyle42 = textStyle2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(1252327795);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1252329651);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            mutableState2 = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1252332679);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent2 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            TextStyle textStyleKWHzl2 = KWHzl(mutableState);
                            composerStartRestartGroup.startReplaceableGroup(1252341407);
                            if (((i6 & 29360128) ^ 12582912) <= 8388608) {
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (z3) {
                                    objRememberedValue4 = new Function1() { // from class: o.pOE
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return C38170pOv.copydefault(application, mutableState, mutableState2, (TextLayoutResult) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i212 = i6 << 3;
                                    AbstractC38172pOx abstractC38172pOx32 = application;
                                    Modifier modifier62 = modifier3;
                                    BasicTextKt.m933BasicTextVhcvRP8(str, modifierDrawWithContent2, textStyleKWHzl2, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, i202, z52, i12, i13, (ColorProducer) null, composerStartRestartGroup, (i6 & 14) | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128), 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i14 = i202;
                                    modifier4 = modifier62;
                                    abstractC38172pOx2 = abstractC38172pOx32;
                                    z4 = z52;
                                    textStyle3 = textStyle42;
                                    i15 = i12;
                                    i16 = i13;
                                }
                            } else {
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (z3) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                iM5334getEllipsisgIe3tQ8 = i;
                i9 = i5 & 16;
                if (i9 != 0) {
                }
                z2 = z;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                if ((i4 & 12582912) == 0) {
                }
                if ((i6 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            iM5334getEllipsisgIe3tQ8 = i;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z2 = z;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            if ((i6 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        iM5334getEllipsisgIe3tQ8 = i;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z2 = z;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i6 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Unit copydefault(MutableState mutableState, ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "");
        if (EZpvd(mutableState)) {
            contentDrawScope.drawContent();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(AbstractC38172pOx abstractC38172pOx, MutableState<TextStyle> mutableState, MutableState<java.lang.Boolean> mutableState2) {
        long jM4945getFontSizeXSAIIZE = KWHzl(mutableState).m4945getFontSizeXSAIIZE();
        TextUnitKt.m5608checkArithmeticR2X_6o(jM4945getFontSizeXSAIIZE);
        long jPack = TextUnitKt.pack(TextUnit.m5593getRawTypeimpl(jM4945getFontSizeXSAIIZE), TextUnit.m5595getValueimpl(jM4945getFontSizeXSAIIZE) * 0.9f);
        if (!TextUnit.m5592equalsimpl0(abstractC38172pOx.EZpvd(), TextUnit.Companion.m5606getUnspecifiedXSAIIZE())) {
            long jEZpvd = abstractC38172pOx.EZpvd();
            TextUnitKt.m5609checkArithmeticNB67dxo(jPack, jEZpvd);
            if (java.lang.Float.compare(TextUnit.m5595getValueimpl(jPack), TextUnit.m5595getValueimpl(jEZpvd)) <= 0) {
                TextStyle textStyleKWHzl = KWHzl(mutableState);
                EZpvd(mutableState, textStyleKWHzl.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleKWHzl.spanStyle.m4882getColor0d7_KjU() : 0L, (16777214 & 2) != 0 ? textStyleKWHzl.spanStyle.m4883getFontSizeXSAIIZE() : abstractC38172pOx.EZpvd(), (16777214 & 4) != 0 ? textStyleKWHzl.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleKWHzl.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleKWHzl.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleKWHzl.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleKWHzl.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleKWHzl.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleKWHzl.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleKWHzl.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleKWHzl.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleKWHzl.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleKWHzl.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleKWHzl.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleKWHzl.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleKWHzl.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleKWHzl.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleKWHzl.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleKWHzl.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleKWHzl.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleKWHzl.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleKWHzl.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleKWHzl.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleKWHzl.paragraphStyle.getTextMotion() : null));
                AEQbTJ(mutableState2, true);
                return;
            }
        }
        TextStyle textStyleKWHzl2 = KWHzl(mutableState);
        long jM4945getFontSizeXSAIIZE2 = KWHzl(mutableState).m4945getFontSizeXSAIIZE();
        TextUnitKt.m5608checkArithmeticR2X_6o(jM4945getFontSizeXSAIIZE2);
        EZpvd(mutableState, textStyleKWHzl2.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleKWHzl2.spanStyle.m4882getColor0d7_KjU() : 0L, (16777214 & 2) != 0 ? textStyleKWHzl2.spanStyle.m4883getFontSizeXSAIIZE() : TextUnitKt.pack(TextUnit.m5593getRawTypeimpl(jM4945getFontSizeXSAIIZE2), TextUnit.m5595getValueimpl(jM4945getFontSizeXSAIIZE2) * 0.9f), (16777214 & 4) != 0 ? textStyleKWHzl2.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleKWHzl2.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleKWHzl2.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleKWHzl2.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleKWHzl2.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleKWHzl2.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleKWHzl2.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleKWHzl2.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleKWHzl2.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleKWHzl2.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleKWHzl2.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleKWHzl2.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleKWHzl2.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleKWHzl2.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleKWHzl2.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleKWHzl2.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleKWHzl2.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleKWHzl2.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleKWHzl2.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleKWHzl2.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleKWHzl2.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleKWHzl2.paragraphStyle.getTextMotion() : null));
    }

    public static final Unit copydefault(AbstractC38172pOx abstractC38172pOx, MutableState mutableState, MutableState mutableState2, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "");
        if (abstractC38172pOx instanceof AbstractC38172pOx.Activity) {
            if (textLayoutResult.getDidOverflowHeight()) {
                OLrzqt(abstractC38172pOx, mutableState, mutableState2);
            } else {
                AEQbTJ(mutableState2, true);
            }
        } else {
            if (!(abstractC38172pOx instanceof AbstractC38172pOx.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            if (textLayoutResult.getDidOverflowWidth()) {
                OLrzqt(abstractC38172pOx, mutableState, mutableState2);
            } else {
                AEQbTJ(mutableState2, true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final TextStyle KWHzl(@androidx.annotation.StyleRes int i, @androidx.annotation.ColorRes java.lang.Integer num, Composer composer, int i2, int i3) {
        long jColor;
        long jColor2;
        composer.startReplaceableGroup(656623204);
        java.lang.Integer num2 = (i3 & 2) != 0 ? null : num;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(656623204, i2, -1, "com.okinc.lifecycle.ui.composeview.styleResource (AutoSizeText.kt:111)");
        }
        android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        TextAppearance textAppearance = new TextAppearance((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = ((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).obtainStyledAttributes(i, androidx.appcompat.R.styleable.TextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.TextAppearance_textLocale);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.ColorStateList colorStateList = textAppearance.shadowColor;
        android.content.res.ColorStateList textColor = textAppearance.getTextColor();
        if (colorStateList == null) {
            jColor = ColorKt.Color(4278190080L);
        } else {
            jColor = ColorKt.Color(colorStateList.getDefaultColor());
        }
        long j = jColor;
        if (num2 != null) {
            composer.startReplaceableGroup(-138764306);
            jColor2 = ColorResources_androidKt.colorResource(num2.intValue(), composer, (i2 >> 3) & 14);
            composer.endReplaceableGroup();
        } else if (textColor == null) {
            composer.startReplaceableGroup(-138684078);
            jColor2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.DeEinT, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-138610112);
            composer.endReplaceableGroup();
            jColor2 = ColorKt.Color(textColor.getDefaultColor());
        }
        long j2 = jColor2;
        long jMo519toSpkPz2Gy4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo519toSpkPz2Gy4(textAppearance.getTextSize());
        FontSynthesis fontSynthesisM5025boximpl = FontSynthesis.m5025boximpl(FontSynthesis.Companion.m5035getNoneGVVA2EU());
        android.graphics.Typeface font = textAppearance.getFont((android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        Intrinsics.checkNotNullExpressionValue(font, "");
        TextStyle textStyle = new TextStyle(j2, jMo519toSpkPz2Gy4, (FontWeight) null, (FontStyle) null, fontSynthesisM5025boximpl, AndroidTypeface_androidKt.FontFamily(font), string, TextUnitKt.getSp(C55298xhM.AhwBna(textAppearance.letterSpacing, context)), BaselineShift.m5179boximpl(BaselineShift.Companion.m5189getNoney9eOQZs()), new TextGeometricTransform(0.0f, 0.0f, 3, null), string2 != null ? new androidx.compose.ui.text.intl.LocaleList(string2) : null, 0L, TextDecoration.Companion.getNone(), new Shadow(j, OffsetKt.Offset(textAppearance.shadowDx, textAppearance.shadowDy), textAppearance.shadowRadius, null), (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, Hyphens.m5198boximpl(Hyphens.Companion.m5206getNonevmbZdU8()), (TextMotion) null, 12568588, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }

    public static final TextStyle KWHzl(MutableState<TextStyle> mutableState) {
        return mutableState.getValue();
    }

    public static final void EZpvd(MutableState<TextStyle> mutableState, TextStyle textStyle) {
        mutableState.setValue(textStyle);
    }

    public static final boolean EZpvd(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void AEQbTJ(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }
}
