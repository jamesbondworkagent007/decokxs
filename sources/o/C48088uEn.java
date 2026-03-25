package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48088uEn {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.lang.String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        copydefault(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(@NotNull final java.lang.String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jColorResource;
        long jColorResource2;
        boolean z;
        boolean zChanged;
        boolean zChanged2;
        java.lang.Object objRememberedValue;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(455849893);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(455849893, i3, -1, "com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownViewComposable (BotMarkdownViewComposable.kt:24)");
                }
                jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.QKudOq, composerStartRestartGroup, 0);
                jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1656234907);
                z = (i3 & 14) != 4;
                zChanged = composerStartRestartGroup.changed(jColorResource);
                zChanged2 = composerStartRestartGroup.changed(jColorResource2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = C48093uEs.EZpvd.copydefault(str, jColorResource, jColorResource2, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? -1 : 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BasicTextKt.m931BasicTextRWo7tUw((AnnotatedString) objRememberedValue, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), null, 0, false, 0, 0, null, null, composer2, 0, 1016);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uEr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C48088uEn.KWHzl(str, modifier3, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            jColorResource = ColorResources_androidKt.colorResource(C52761wXj.Activity.QKudOq, composerStartRestartGroup, 0);
            jColorResource2 = ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1656234907);
            if ((i3 & 14) != 4) {
            }
            zChanged = composerStartRestartGroup.changed(jColorResource);
            zChanged2 = composerStartRestartGroup.changed(jColorResource2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z | zChanged | zChanged2)) {
                objRememberedValue = C48093uEs.EZpvd.copydefault(str, jColorResource, jColorResource2, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? -1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceableGroup();
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BasicTextKt.m931BasicTextRWo7tUw((AnnotatedString) objRememberedValue, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C52698wVa.OLrzqt(C52761wXj.LoaderManager.KWHzl, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl), composerStartRestartGroup, 0, 0), null, 0, false, 0, 0, null, null, composer2, 0, 1016);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
