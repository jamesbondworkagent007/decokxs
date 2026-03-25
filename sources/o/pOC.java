package o;

import android.widget.ImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes9.dex */
public final class pOC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Modifier modifier, java.lang.String str, java.lang.Integer num, android.graphics.drawable.Drawable drawable, java.lang.String str2, java.lang.Integer num2, android.graphics.drawable.Drawable drawable2, int i, int i2, Composer composer, int i3) {
        copydefault(modifier, str, num, drawable, str2, num2, drawable2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(Modifier modifier, java.lang.String str, java.lang.Integer num, android.graphics.drawable.Drawable drawable, java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num2, android.graphics.drawable.Drawable drawable2, Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str3;
        int i4;
        java.lang.Integer num3;
        int i5;
        android.graphics.drawable.Drawable drawable3;
        int i6;
        final java.lang.String str4;
        int i7;
        java.lang.Integer num4;
        int i8;
        android.graphics.drawable.Drawable drawable4;
        final int i9;
        final boolean zEZpvd;
        boolean z;
        java.lang.Object objRememberedValue;
        boolean zChanged;
        boolean zChangedInstance;
        boolean zChangedInstance2;
        Modifier modifier2;
        boolean z2;
        boolean z3;
        boolean zChanged2;
        boolean z4;
        java.lang.Object objRememberedValue2;
        final java.lang.String str5;
        final java.lang.Integer num5;
        final java.lang.Integer num6;
        final android.graphics.drawable.Drawable drawable5;
        final android.graphics.drawable.Drawable drawable6;
        final java.lang.String str6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(726863955);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    num3 = num;
                    i3 |= composerStartRestartGroup.changed(num3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        drawable3 = drawable;
                        i3 |= composerStartRestartGroup.changedInstance(drawable3) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            str4 = str2;
                            i3 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            num4 = num2;
                        } else {
                            num4 = num2;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= composerStartRestartGroup.changed(num4) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            drawable4 = drawable2;
                        } else {
                            drawable4 = drawable2;
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(drawable4) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i10 == 0 ? Modifier.Companion : modifier;
                            if (i11 != 0) {
                                str3 = null;
                            }
                            if (i4 != 0) {
                                num3 = null;
                            }
                            if (i5 != 0) {
                                drawable3 = null;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i7 != 0) {
                                num4 = null;
                            }
                            if (i8 != 0) {
                                drawable4 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(726863955, i3, -1, "com.okinc.lifecycle.ui.composeview.GlideImage (GlideImage.kt:22)");
                            }
                            i9 = C52761wXj.TaskDescription.aJFbMH;
                            zEZpvd = EZpvd(composerStartRestartGroup, 0);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-195998702);
                            z = (57344 & i3) != 16384;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: o.pOA
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return pOC.AEQbTJ(str4, (android.content.Context) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-195989541);
                            zChanged = composerStartRestartGroup.changed(zEZpvd);
                            zChangedInstance = composerStartRestartGroup.changedInstance(drawable3);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(drawable4);
                            modifier2 = modifier3;
                            z2 = (i3 & FaceDetector.NUM_BOXES) != 256;
                            java.lang.String str7 = str4;
                            z3 = (458752 & i3) != 131072;
                            zChanged2 = composerStartRestartGroup.changed(i9);
                            z4 = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | zChanged | zChangedInstance | zChangedInstance2 | z3 | zChanged2 | z4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                final android.graphics.drawable.Drawable drawable7 = drawable3;
                                final android.graphics.drawable.Drawable drawable8 = drawable4;
                                final java.lang.Integer num7 = num3;
                                final java.lang.Integer num8 = num4;
                                final java.lang.String str8 = str3;
                                objRememberedValue2 = new Function1() { // from class: o.pOD
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return pOC.OLrzqt(zEZpvd, drawable7, drawable8, num7, num8, i9, str8, (android.widget.ImageView) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView(function1, modifierFillMaxWidth$default, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str5 = str3;
                            num5 = num4;
                            num6 = num3;
                            drawable5 = drawable3;
                            drawable6 = drawable4;
                            str6 = str7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            str6 = str4;
                            str5 = str3;
                            num5 = num4;
                            num6 = num3;
                            drawable5 = drawable3;
                            drawable6 = drawable4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.pOF
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return pOC.AEQbTJ(modifier4, str5, num6, drawable5, str6, num5, drawable6, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    str4 = str2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if ((i3 & 599187) != 599186) {
                        if (i10 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i9 = C52761wXj.TaskDescription.aJFbMH;
                        zEZpvd = EZpvd(composerStartRestartGroup, 0);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-195998702);
                        if ((57344 & i3) != 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function1() { // from class: o.pOA
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return pOC.AEQbTJ(str4, (android.content.Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Function1 function12 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-195989541);
                            zChanged = composerStartRestartGroup.changed(zEZpvd);
                            zChangedInstance = composerStartRestartGroup.changedInstance(drawable3);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(drawable4);
                            modifier2 = modifier3;
                            if ((i3 & FaceDetector.NUM_BOXES) != 256) {
                            }
                            java.lang.String str72 = str4;
                            if ((458752 & i3) != 131072) {
                            }
                            zChanged2 = composerStartRestartGroup.changed(i9);
                            if ((i3 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | zChanged | zChangedInstance | zChangedInstance2 | z3 | zChanged2 | z4)) {
                                final android.graphics.drawable.Drawable drawable72 = drawable3;
                                final android.graphics.drawable.Drawable drawable82 = drawable4;
                                final java.lang.Integer num72 = num3;
                                final java.lang.Integer num82 = num4;
                                final java.lang.String str82 = str3;
                                objRememberedValue2 = new Function1() { // from class: o.pOD
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return pOC.OLrzqt(zEZpvd, drawable72, drawable82, num72, num82, i9, str82, (android.widget.ImageView) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifierFillMaxWidth$default2, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str5 = str3;
                                num5 = num4;
                                num6 = num3;
                                drawable5 = drawable3;
                                drawable6 = drawable4;
                                str6 = str72;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                drawable3 = drawable;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                str4 = str2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if ((i3 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            num3 = num;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            drawable3 = drawable;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            str4 = str2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        num3 = num;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        drawable3 = drawable;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        str4 = str2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final android.widget.ImageView AEQbTJ(java.lang.String str, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setContentDescription(str);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    public static final Unit OLrzqt(boolean z, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.String str, android.widget.ImageView imageView) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtAEQbTJ;
        C5335Nt<android.graphics.drawable.Drawable> c5335Nt;
        C5335Nt<android.graphics.drawable.Drawable> c5335Nt2;
        Intrinsics.checkNotNullParameter(imageView, "");
        if (!z) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(imageView);
            if (str != null) {
                c5335NtAEQbTJ = componentCallbacks2C5333NrKWHzl.EZpvd(str);
            } else if (num != null) {
                c5335NtAEQbTJ = componentCallbacks2C5333NrKWHzl.OLrzqt(num);
            } else if (drawable != null) {
                c5335NtAEQbTJ = componentCallbacks2C5333NrKWHzl.AEQbTJ(drawable);
            } else if (num2 != null) {
                c5335NtAEQbTJ = componentCallbacks2C5333NrKWHzl.OLrzqt(num2);
            } else if (drawable2 != null) {
                c5335NtAEQbTJ = componentCallbacks2C5333NrKWHzl.AEQbTJ(drawable2);
            } else {
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullExpressionValue(c5335NtAEQbTJ, "");
            if (num2 != null && (c5335Nt2 = (C5335Nt) c5335NtAEQbTJ.KWHzl(num2.intValue())) != null) {
                c5335NtAEQbTJ = c5335Nt2;
            }
            if (drawable2 != null && (c5335Nt = (C5335Nt) c5335NtAEQbTJ.AEQbTJ(drawable2)) != null) {
                c5335NtAEQbTJ = c5335Nt;
            }
            c5335NtAEQbTJ.EZpvd(imageView);
        } else if (drawable == null && drawable2 == null) {
            if (num != null) {
                i = num.intValue();
            } else if (num2 != null) {
                i = num2.intValue();
            }
            imageView.setImageResource(i);
        } else {
            imageView.setImageDrawable(drawable2);
        }
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(Composer composer, int i) {
        composer.startReplaceableGroup(916859756);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916859756, i, -1, "com.okinc.lifecycle.ui.composeview.isPreview (GlideImage.kt:80)");
        }
        boolean zBooleanValue = ((java.lang.Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zBooleanValue;
    }
}
