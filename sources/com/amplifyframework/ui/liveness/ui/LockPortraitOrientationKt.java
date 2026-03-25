package com.amplifyframework.ui.liveness.ui;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amplifyframework.ui.liveness.util.ExtensionsKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LockPortraitOrientationKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LockPortraitOrientation$lambda$10(yHO yho, int i, Composer composer, int i2) {
        LockPortraitOrientation(yho, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LockPortraitOrientation$lambda$2(yHO yho, int i, Composer composer, int i2) {
        LockPortraitOrientation(yho, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LockPortraitOrientation(@NotNull final yHO<? super Function0<Unit>, ? super Composer, ? super Integer, Unit> yho, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(yho, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-168942456);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(yho) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-168942456, i2, -1, "com.amplifyframework.ui.liveness.ui.LockPortraitOrientation (LockPortraitOrientation.kt:30)");
            }
            final Activity activityFindActivity = ExtensionsKt.findActivity((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            composerStartRestartGroup.startReplaceableGroup(1489712867);
            if (activityFindActivity == null) {
                composerStartRestartGroup.startReplaceableGroup(1489714138);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.LockPortraitOrientationKt$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                yho.invoke((Function0) objRememberedValue, composerStartRestartGroup, Integer.valueOf(((i2 << 3) & WalletImportError.ERROR_CODE_AA_EXIST) | 6));
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.LockPortraitOrientationKt$$ExternalSyntheticLambda1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LockPortraitOrientationKt.LockPortraitOrientation$lambda$2(yho, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceableGroup(1489715817);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(activityFindActivity);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.LockPortraitOrientationKt$$ExternalSyntheticLambda2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LockPortraitOrientationKt.LockPortraitOrientation$lambda$4$lambda$3(activityFindActivity);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m2796rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.startReplaceableGroup(1489717936);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(activityFindActivity);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.LockPortraitOrientationKt$$ExternalSyntheticLambda3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LockPortraitOrientationKt.LockPortraitOrientation$lambda$7$lambda$6(activityFindActivity);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
            if (activityFindActivity.getResources().getConfiguration().orientation == 1) {
                composerStartRestartGroup.startReplaceableGroup(1489725347);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(activityFindActivity);
                boolean zChanged = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if ((zChangedInstance3 | zChanged) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.LockPortraitOrientationKt$$ExternalSyntheticLambda4
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LockPortraitOrientationKt.LockPortraitOrientation$lambda$9$lambda$8(activityFindActivity, mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                yho.invoke((Function0) objRememberedValue4, composerStartRestartGroup, Integer.valueOf((i2 << 3) & WalletImportError.ERROR_CODE_AA_EXIST));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.LockPortraitOrientationKt$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LockPortraitOrientationKt.LockPortraitOrientation$lambda$10(yho, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState LockPortraitOrientation$lambda$4$lambda$3(Activity activity) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(activity.getRequestedOrientation()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LockPortraitOrientation$lambda$7$lambda$6(Activity activity) {
        activity.setRequestedOrientation(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LockPortraitOrientation$lambda$9$lambda$8(Activity activity, MutableState mutableState) {
        activity.setRequestedOrientation(LockPortraitOrientation$lambda$5(mutableState));
        return Unit.INSTANCE;
    }

    private static final int LockPortraitOrientation$lambda$5(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}
