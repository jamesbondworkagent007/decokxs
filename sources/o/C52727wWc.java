package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.wWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52727wWc {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, java.lang.String str, int i, int i2, int i3, Composer composer, int i4) {
        OLrzqt(modifier, str, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Modifier modifier, final java.lang.String str, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        boolean z2;
        java.lang.Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(391437232);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(i)) ? 256 : 128;
        }
        if ((i4 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.Companion;
                }
                if ((i3 & 4) != 0) {
                    i = C52761wXj.TaskDescription.DuR;
                    i4 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(391437232, i4, -1, "com.okinc.tradingbot.impl.widget.compose.GlideImage (GlideImage.kt:18)");
                }
                composerStartRestartGroup.startReplaceableGroup(-742835550);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.wWb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C52727wWc.AEQbTJ((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-742833637);
                z = (i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                z2 = (((i4 & FaceDetector.NUM_BOXES) ^ MLKEMEngine.KyberPolyBytes) <= 256 && composerStartRestartGroup.changed(i)) || (i4 & MLKEMEngine.KyberPolyBytes) == 256;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if ((z | z2) || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.wVZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C52727wWc.OLrzqt(str, i, (android.widget.ImageView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function1, modifier, (Function1) objRememberedValue2, composerStartRestartGroup, ((i4 << 3) & WalletImportError.ERROR_CODE_AA_EXIST) | 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(-742835550);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                }
                Function1 function12 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-742833637);
                if ((i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                }
                if (((i4 & FaceDetector.NUM_BOXES) ^ MLKEMEngine.KyberPolyBytes) <= 256) {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z | z2) {
                        objRememberedValue2 = new Function1() { // from class: o.wVZ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C52727wWc.OLrzqt(str, i, (android.widget.ImageView) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(function12, modifier, (Function1) objRememberedValue2, composerStartRestartGroup, ((i4 << 3) & WalletImportError.ERROR_CODE_AA_EXIST) | 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                } else {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z | z2) {
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final int i6 = i;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C52727wWc.OLrzqt(modifier2, str, i6, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.ImageView AEQbTJ(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new android.widget.ImageView(context);
    }

    public static final Unit OLrzqt(java.lang.String str, int i, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        OLrzqt(imageView, context, str, i);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadImage$default(android.widget.ImageView imageView, android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C52761wXj.TaskDescription.DuR;
        }
        OLrzqt(imageView, context, str, i);
    }

    public static final void OLrzqt(android.widget.ImageView imageView, android.content.Context context, java.lang.String str, int i) {
        if (str == null || str.length() == 0 || !copydefault(context)) {
            return;
        }
        Glide.AEQbTJ(context).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().KWHzl(i).copydefault(i).copydefault(AbstractC5360Os.copydefault).copydefault(false)).djBIcL().EZpvd(imageView);
    }

    public static final boolean copydefault(android.content.Context context) {
        if (context == null) {
            return false;
        }
        android.app.Activity activityOLrzqt = OLrzqt(context);
        if (activityOLrzqt != null) {
            return (activityOLrzqt.isDestroyed() || activityOLrzqt.isFinishing()) ? false : true;
        }
        return true;
    }

    public static final android.app.Activity OLrzqt(android.content.Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
