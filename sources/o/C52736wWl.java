package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52736wWl {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(Modifier modifier, int i, int i2, java.lang.String str, java.lang.Integer num, android.graphics.drawable.Drawable drawable, Function0 function0, int i3, int i4, Composer composer, int i5) {
        KWHzl(modifier, i, i2, str, num, drawable, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(Modifier modifier, int i, int i2, @NotNull final java.lang.String str, @androidx.annotation.DrawableRes java.lang.Integer num, android.graphics.drawable.Drawable drawable, Function0<Unit> function0, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.Integer num2;
        int i10;
        android.graphics.drawable.Drawable drawable2;
        int i11;
        Function0<Unit> function02;
        int i12;
        int i13;
        java.lang.Integer num3;
        Function0<Unit> function03;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        boolean zChanged;
        java.lang.Object objRememberedValue;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zChangedInstance;
        boolean z4;
        java.lang.Object objRememberedValue2;
        int i14;
        Function0<Unit> function04;
        final Modifier modifier3;
        final int i15;
        final int i16;
        final java.lang.Integer num4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(69243966);
        int i17 = i4 & 1;
        if (i17 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i18 = i4 & 2;
        if (i18 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            i7 = i4 & 4;
            if (i7 == 0) {
                i5 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i8 = i2;
                    i5 |= composerStartRestartGroup.changed(i8) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
                }
                i9 = i4 & 16;
                if (i9 == 0) {
                    if ((i3 & 24576) == 0) {
                        num2 = num;
                        i5 |= composerStartRestartGroup.changed(num2) ? 16384 : 8192;
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        drawable2 = drawable;
                    } else {
                        drawable2 = drawable;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(drawable2) ? 131072 : 65536;
                        }
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i3 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                    }
                    if ((i5 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i17 == 0 ? Modifier.Companion : modifier2;
                        i12 = i18 == 0 ? 36 : i6;
                        i13 = i7 == 0 ? 257 : i8;
                        num3 = i9 == 0 ? null : num2;
                        if (i10 != 0) {
                            drawable2 = null;
                        }
                        if (i11 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1888278921);
                            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: o.wWk
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C52736wWl.AEQbTJ();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function03 = (Function0) objRememberedValue3;
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(69243966, i5, -1, "com.okinc.tradingbot.impl.widget.compose.OKButton (OKButtonCompose.kt:21)");
                        }
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i5 >> 18) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-1888274727);
                        zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: o.wWn
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C52736wWl.copydefault(stateRememberUpdatedState, (android.content.Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1888268310);
                        z = (i5 & FaceDetector.NUM_BOXES) != 256;
                        z2 = (i5 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                        z3 = (57344 & i5) != 16384;
                        zChangedInstance = composerStartRestartGroup.changedInstance(drawable2);
                        z4 = (i5 & 7168) == 2048;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if ((!(z | z2 | z3 | zChangedInstance) && !z4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            final int i19 = i13;
                            final int i20 = i12;
                            i14 = i5;
                            final java.lang.Integer num5 = num3;
                            final android.graphics.drawable.Drawable drawable3 = drawable2;
                            Function1 function12 = new Function1() { // from class: o.wWp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C52736wWl.AEQbTJ(i19, i20, num5, drawable3, str, (C52794wYp) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function12);
                            objRememberedValue2 = function12;
                        } else {
                            i14 = i5;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function05 = function03;
                        AndroidView_androidKt.AndroidView(function1, modifier4, (Function1) objRememberedValue2, composerStartRestartGroup, (i14 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function05;
                        modifier3 = modifier4;
                        i15 = i12;
                        i16 = i13;
                        num4 = num3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        i15 = i6;
                        i16 = i8;
                        function04 = function02;
                        num4 = num2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final android.graphics.drawable.Drawable drawable4 = drawable2;
                        final Function0<Unit> function06 = function04;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C52736wWl.EZpvd(modifier3, i15, i16, str, num4, drawable4, function06, i3, i4, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                num2 = num;
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) == 599186) {
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i5 >> 18) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-1888274727);
                    zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function1() { // from class: o.wWn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C52736wWl.copydefault(stateRememberUpdatedState, (android.content.Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        Function1 function13 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1888268310);
                        if ((i5 & FaceDetector.NUM_BOXES) != 256) {
                        }
                        if ((i5 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                        }
                        if ((57344 & i5) != 16384) {
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(drawable2);
                        if ((i5 & 7168) == 2048) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z | z2 | z3 | zChangedInstance | z4)) {
                            final int i192 = i13;
                            final int i202 = i12;
                            i14 = i5;
                            final java.lang.Integer num52 = num3;
                            final android.graphics.drawable.Drawable drawable32 = drawable2;
                            Function1 function122 = new Function1() { // from class: o.wWp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C52736wWl.AEQbTJ(i192, i202, num52, drawable32, str, (C52794wYp) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function122);
                            objRememberedValue2 = function122;
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0<Unit> function052 = function03;
                            AndroidView_androidKt.AndroidView(function13, modifier4, (Function1) objRememberedValue2, composerStartRestartGroup, (i14 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function04 = function052;
                            modifier3 = modifier4;
                            i15 = i12;
                            i16 = i13;
                            num4 = num3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i8 = i2;
            if ((i4 & 8) != 0) {
            }
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            num2 = num;
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i;
        i7 = i4 & 4;
        if (i7 == 0) {
        }
        i8 = i2;
        if ((i4 & 8) != 0) {
        }
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        num2 = num;
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final C52794wYp copydefault(final androidx.compose.runtime.State state, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.wWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52736wWl.KWHzl(state, view);
            }
        });
        return c52794wYp;
    }

    public static final void KWHzl(androidx.compose.runtime.State state, android.view.View view) {
        KWHzl(state).invoke();
    }

    public static final Unit AEQbTJ(int i, int i2, java.lang.Integer num, android.graphics.drawable.Drawable drawable, java.lang.String str, C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        c52794wYp.setOKDSType(i);
        c52794wYp.setOKDSSize(i2);
        if (num != null) {
            c52794wYp.setCompoundDrawablesRelativeWithIntrinsicBounds(num.intValue(), 0, 0, 0);
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context));
        }
        if (drawable != null) {
            c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
            android.content.Context context2 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c52794wYp.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context2));
        }
        c52794wYp.setText(str);
        return Unit.INSTANCE;
    }

    public static final Function0<Unit> KWHzl(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
