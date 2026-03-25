package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.SwipeProgress;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList$2$1;
import com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList$3$1;
import com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList$4$1;
import com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$1;
import com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$SwipeableItem$1$1;
import com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$SwipeableItem$2$1;
import com.okinc.cruilib.compose.library.revealswipe.RevealDirection;
import com.okinc.cruilib.compose.library.revealswipe.RevealValue;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.mDK;
import o.mDL;
import o.mEF;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes23.dex */
public final class mDL {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.util.List list, Function1 function1, Function1 function12, Function2 function2, Function2 function22, float f, boolean z, Function1 function13, CornerBasedShape cornerBasedShape, Modifier modifier, boolean z2, boolean z3, boolean z4, java.util.Set set, Function0 function0, yHO yho, yHQ yhq, int i, int i2, int i3, Composer composer, int i4) {
        copydefault(list, function1, function12, function2, function22, f, z, function13, cornerBasedShape, modifier, z2, z3, z4, set, function0, yho, yhq, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(InterfaceC31808mEr interfaceC31808mEr, mDK mdk, SwipeableState swipeableState, Function1 function1, Function1 function12, boolean z, boolean z2, float f, float f2, boolean z3, Function1 function13, CornerBasedShape cornerBasedShape, Modifier modifier, yHO yho, yHT yht, int i, int i2, int i3, Composer composer, int i4) {
        AEQbTJ(interfaceC31808mEr, mdk, swipeableState, function1, function12, z, z2, f, f2, z3, function13, cornerBasedShape, modifier, yho, yht, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Id, Item extends mDK<Id>> void copydefault(@NotNull final java.util.List<? extends Item> list, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, @NotNull final Function1<? super java.lang.Boolean, Unit> function12, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2, @NotNull final Function2<? super Id, ? super java.lang.Boolean, Unit> function22, final float f, final boolean z, @NotNull final Function1<? super Item, Unit> function13, @NotNull final CornerBasedShape cornerBasedShape, Modifier modifier, boolean z2, boolean z3, boolean z4, java.util.Set<? extends Id> set, Function0<Unit> function0, yHO<? super Item, ? super Composer, ? super java.lang.Integer, Unit> yho, yHQ<? super InterfaceC31808mEr, ? super Item, ? super java.lang.Boolean, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yhq, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yho2;
        int i13;
        boolean z5;
        boolean z6;
        boolean z7;
        java.util.Set<? extends Id> setCopydefault;
        Function0<Unit> function02;
        final yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yhoEZpvd;
        final yHQ<? super InterfaceC31808mEr, ? super Item, ? super java.lang.Boolean, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yhqAEQbTJ;
        LazyListState lazyListStateRememberLazyListState;
        boolean zChanged;
        boolean z8;
        java.lang.Object objRememberedValue;
        boolean z9;
        java.lang.Object objRememberedValue2;
        final mEL melEZpvd;
        java.lang.Object objRememberedValue3;
        Composer.Companion companion;
        final mDT mdtEZpvd;
        boolean zChangedInstance;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue4;
        boolean zChangedInstance3;
        boolean zChangedInstance4;
        boolean z10;
        java.lang.Object objRememberedValue5;
        boolean zChangedInstance5;
        boolean z11;
        boolean z12;
        boolean zChangedInstance6;
        boolean zChangedInstance7;
        java.util.Set<? extends Id> set2;
        boolean z13;
        Function0<Unit> function03;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i14;
        boolean z19;
        boolean z20;
        boolean z21;
        java.lang.Object objRememberedValue6;
        int i15;
        java.util.Set<? extends Id> set3;
        Function0<Unit> function04;
        LazyListState lazyListState;
        Composer composer2;
        final Modifier modifier2;
        final java.util.Set<? extends Id> set4;
        final Function0<Unit> function05;
        final boolean z22;
        final boolean z23;
        final boolean z24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        int i17;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(cornerBasedShape, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850516905);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
            }
            if ((i3 & 128) != 0) {
                i17 = (12582912 & i) == 0 ? composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304 : 12582912;
                if ((i3 & 256) == 0) {
                    i16 = (100663296 & i) == 0 ? composerStartRestartGroup.changed(cornerBasedShape) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE : 100663296;
                    i5 = i3 & 512;
                    if (i5 == 0) {
                        i4 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else if ((i & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
                    }
                    i6 = i3 & 1024;
                    if (i6 == 0) {
                        i7 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i7 = i2 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                    } else {
                        i7 = i2;
                    }
                    i8 = i3 & 2048;
                    if (i8 == 0) {
                        i7 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i7 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                    }
                    int i18 = i7;
                    i9 = i3 & 4096;
                    if (i9 == 0) {
                        i18 |= MLKEMEngine.KyberPolyBytes;
                    } else {
                        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                            i18 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                        }
                        i10 = i3 & 8192;
                        if (i10 != 0) {
                            i18 |= 3072;
                        } else {
                            if ((i2 & 3072) == 0) {
                                i18 |= composerStartRestartGroup.changedInstance(set) ? 2048 : 1024;
                            }
                            i11 = i3 & 16384;
                            if (i11 != 0) {
                                if ((i2 & 24576) == 0) {
                                    i18 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                                }
                                i12 = i3 & 32768;
                                if (i12 != 0) {
                                    i18 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    yho2 = yho;
                                } else {
                                    yho2 = yho;
                                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i18 |= composerStartRestartGroup.changedInstance(yho2) ? 131072 : 65536;
                                    }
                                }
                                i13 = i3 & 65536;
                                if (i13 != 0) {
                                    i18 |= 1572864;
                                } else if ((i2 & 1572864) == 0) {
                                    i18 |= composerStartRestartGroup.changedInstance(yhq) ? 1048576 : 524288;
                                }
                                if ((i4 & 306783379) != 306783378 || (599187 & i18) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier3 = i5 == 0 ? Modifier.Companion : modifier;
                                    z5 = i6 == 0 ? true : z2;
                                    z6 = i8 == 0 ? true : z3;
                                    z7 = i9 == 0 ? true : z4;
                                    setCopydefault = i10 == 0 ? yEE.copydefault() : set;
                                    if (i11 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-1323188820);
                                        java.lang.Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                                            objRememberedValue7 = new Function0() { // from class: o.mDJ
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return mDL.AEQbTJ();
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        function02 = (Function0) objRememberedValue7;
                                    } else {
                                        function02 = function0;
                                    }
                                    yhoEZpvd = i12 == 0 ? mDE.EZpvd.EZpvd() : yho2;
                                    yhqAEQbTJ = i13 == 0 ? mDE.EZpvd.AEQbTJ() : yhq;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1850516905, i4, i18, "com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableList (ReorderableSwipeableList.kt:68)");
                                    }
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    boolean canScrollBackward = lazyListStateRememberLazyListState.getCanScrollBackward();
                                    composerStartRestartGroup.startReplaceableGroup(-1323177825);
                                    zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                                    z8 = (i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!(zChanged | z8) || objRememberedValue == Composer.Companion.getEmpty()) {
                                        objRememberedValue = new ReorderableSwipeableListKt$ReorderableSwipeableList$2$1(lazyListStateRememberLazyListState, function1, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(canScrollBackward), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(-1323171176);
                                    z9 = (i4 & 7168) != 2048;
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!z9 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                        objRememberedValue2 = new Function2() { // from class: o.mDI
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return mDL.AEQbTJ(function2, (LazyListItemInfo) obj, (LazyListItemInfo) obj2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    melEZpvd = mEF.EZpvd(lazyListStateRememberLazyListState, 0.0f, 0.0f, false, (Function2) objRememberedValue2, composerStartRestartGroup, 0, 14);
                                    composerStartRestartGroup.startReplaceableGroup(773894976);
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.Companion;
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i19 = i4 & 14;
                                    mdtEZpvd = EZpvd(list, coroutineScope, composerStartRestartGroup, i19);
                                    composerStartRestartGroup.startReplaceableGroup(-1323160705);
                                    zChangedInstance = composerStartRestartGroup.changedInstance(mdtEZpvd);
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(list);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!(zChangedInstance | zChangedInstance2) || objRememberedValue4 == companion.getEmpty()) {
                                        objRememberedValue4 = new ReorderableSwipeableListKt$ReorderableSwipeableList$3$1(mdtEZpvd, list, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    C31802mEl.AEQbTJ(list, (Function2) objRememberedValue4, composerStartRestartGroup, i19);
                                    composerStartRestartGroup.startReplaceableGroup(-1323157805);
                                    zChangedInstance3 = composerStartRestartGroup.changedInstance(mdtEZpvd);
                                    zChangedInstance4 = composerStartRestartGroup.changedInstance(setCopydefault);
                                    z10 = (57344 & i18) != 16384;
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!(zChangedInstance3 | zChangedInstance4 | z10) || objRememberedValue5 == companion.getEmpty()) {
                                        objRememberedValue5 = new ReorderableSwipeableListKt$ReorderableSwipeableList$4$1(mdtEZpvd, setCopydefault, function02, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    C31802mEl.AEQbTJ(setCopydefault, (Function2) objRememberedValue5, composerStartRestartGroup, (i18 >> 9) & 14);
                                    composerStartRestartGroup.startReplaceableGroup(-1323147950);
                                    zChangedInstance5 = composerStartRestartGroup.changedInstance(list);
                                    z11 = (i4 & FaceDetector.NUM_BOXES) != 256;
                                    z12 = (i18 & 14) != 4;
                                    zChangedInstance6 = composerStartRestartGroup.changedInstance(melEZpvd);
                                    zChangedInstance7 = composerStartRestartGroup.changedInstance(mdtEZpvd);
                                    set2 = setCopydefault;
                                    z13 = (i18 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                                    function03 = function02;
                                    z14 = (57344 & i4) != 16384;
                                    z15 = (i18 & FaceDetector.NUM_BOXES) != 256;
                                    z16 = (458752 & i4) != 131072;
                                    z17 = (3670016 & i4) != 1048576;
                                    z18 = (29360128 & i4) != 8388608;
                                    i14 = i4;
                                    z19 = (234881024 & i4) != 67108864;
                                    z20 = (458752 & i18) != 131072;
                                    z21 = (i18 & 3670016) != 1048576;
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if ((!(z19 | z13 | zChangedInstance5 | z11 | z12 | zChangedInstance6 | zChangedInstance7 | z14 | z15 | z16 | z17 | z18 | z20) && !z21) || objRememberedValue6 == companion.getEmpty()) {
                                        i15 = i14;
                                        final boolean z25 = z5;
                                        final boolean z26 = z7;
                                        set3 = set2;
                                        function04 = function03;
                                        lazyListState = lazyListStateRememberLazyListState;
                                        final yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yho3 = yhoEZpvd;
                                        final boolean z27 = z6;
                                        final yHQ<? super InterfaceC31808mEr, ? super Item, ? super java.lang.Boolean, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yhq2 = yhqAEQbTJ;
                                        objRememberedValue6 = new Function1() { // from class: o.mDO
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return mDL.OLrzqt(list, function12, z25, melEZpvd, mdtEZpvd, function22, z26, f, z, function13, cornerBasedShape, yho3, z27, yhq2, (LazyListScope) obj);
                                            }
                                        };
                                        composer2 = composerStartRestartGroup;
                                        composer2.updateRememberedValue(objRememberedValue6);
                                    } else {
                                        lazyListState = lazyListStateRememberLazyListState;
                                        i15 = i14;
                                        composer2 = composerStartRestartGroup;
                                        set3 = set2;
                                        function04 = function03;
                                    }
                                    composer2.endReplaceableGroup();
                                    LazyDslKt.LazyColumn(modifier3, lazyListState, null, false, null, null, null, false, (Function1) objRememberedValue6, composer2, (i15 >> 27) & 14, 252);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    set4 = set3;
                                    function05 = function04;
                                    z22 = z5;
                                    z23 = z6;
                                    z24 = z7;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    z23 = z3;
                                    z24 = z4;
                                    set4 = set;
                                    function05 = function0;
                                    yhqAEQbTJ = yhq;
                                    composer2 = composerStartRestartGroup;
                                    yhoEZpvd = yho2;
                                    z22 = z2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.mDR
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return mDL.AEQbTJ(list, function1, function12, function2, function22, f, z, function13, cornerBasedShape, modifier2, z22, z23, z24, set4, function05, yhoEZpvd, yhqAEQbTJ, i, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i18 |= 24576;
                            i12 = i3 & 32768;
                            if (i12 != 0) {
                            }
                            i13 = i3 & 65536;
                            if (i13 != 0) {
                            }
                            if ((i4 & 306783379) != 306783378) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                boolean canScrollBackward2 = lazyListStateRememberLazyListState.getCanScrollBackward();
                                composerStartRestartGroup.startReplaceableGroup(-1323177825);
                                zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                                if ((i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!(zChanged | z8)) {
                                    objRememberedValue = new ReorderableSwipeableListKt$ReorderableSwipeableList$2$1(lazyListStateRememberLazyListState, function1, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(canScrollBackward2), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(-1323171176);
                                    if ((i4 & 7168) != 2048) {
                                    }
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!z9) {
                                        objRememberedValue2 = new Function2() { // from class: o.mDI
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return mDL.AEQbTJ(function2, (LazyListItemInfo) obj, (LazyListItemInfo) obj2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        melEZpvd = mEF.EZpvd(lazyListStateRememberLazyListState, 0.0f, 0.0f, false, (Function2) objRememberedValue2, composerStartRestartGroup, 0, 14);
                                        composerStartRestartGroup.startReplaceableGroup(773894976);
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.Companion;
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        int i192 = i4 & 14;
                                        mdtEZpvd = EZpvd(list, coroutineScope2, composerStartRestartGroup, i192);
                                        composerStartRestartGroup.startReplaceableGroup(-1323160705);
                                        zChangedInstance = composerStartRestartGroup.changedInstance(mdtEZpvd);
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(list);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (!(zChangedInstance | zChangedInstance2)) {
                                            objRememberedValue4 = new ReorderableSwipeableListKt$ReorderableSwipeableList$3$1(mdtEZpvd, list, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            C31802mEl.AEQbTJ(list, (Function2) objRememberedValue4, composerStartRestartGroup, i192);
                                            composerStartRestartGroup.startReplaceableGroup(-1323157805);
                                            zChangedInstance3 = composerStartRestartGroup.changedInstance(mdtEZpvd);
                                            zChangedInstance4 = composerStartRestartGroup.changedInstance(setCopydefault);
                                            if ((57344 & i18) != 16384) {
                                            }
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (!(zChangedInstance3 | zChangedInstance4 | z10)) {
                                                objRememberedValue5 = new ReorderableSwipeableListKt$ReorderableSwipeableList$4$1(mdtEZpvd, setCopydefault, function02, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                C31802mEl.AEQbTJ(setCopydefault, (Function2) objRememberedValue5, composerStartRestartGroup, (i18 >> 9) & 14);
                                                composerStartRestartGroup.startReplaceableGroup(-1323147950);
                                                zChangedInstance5 = composerStartRestartGroup.changedInstance(list);
                                                if ((i4 & FaceDetector.NUM_BOXES) != 256) {
                                                }
                                                if ((i18 & 14) != 4) {
                                                }
                                                zChangedInstance6 = composerStartRestartGroup.changedInstance(melEZpvd);
                                                zChangedInstance7 = composerStartRestartGroup.changedInstance(mdtEZpvd);
                                                set2 = setCopydefault;
                                                if ((i18 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                                }
                                                function03 = function02;
                                                if ((57344 & i4) != 16384) {
                                                }
                                                if ((i18 & FaceDetector.NUM_BOXES) != 256) {
                                                }
                                                if ((458752 & i4) != 131072) {
                                                }
                                                if ((3670016 & i4) != 1048576) {
                                                }
                                                if ((29360128 & i4) != 8388608) {
                                                }
                                                i14 = i4;
                                                if ((234881024 & i4) != 67108864) {
                                                }
                                                if ((458752 & i18) != 131072) {
                                                }
                                                if ((i18 & 3670016) != 1048576) {
                                                }
                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                if (!(z19 | z13 | zChangedInstance5 | z11 | z12 | zChangedInstance6 | zChangedInstance7 | z14 | z15 | z16 | z17 | z18 | z20 | z21)) {
                                                    i15 = i14;
                                                    final boolean z252 = z5;
                                                    final boolean z262 = z7;
                                                    set3 = set2;
                                                    function04 = function03;
                                                    lazyListState = lazyListStateRememberLazyListState;
                                                    final yHO yho32 = yhoEZpvd;
                                                    final boolean z272 = z6;
                                                    final yHQ yhq22 = yhqAEQbTJ;
                                                    objRememberedValue6 = new Function1() { // from class: o.mDO
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return mDL.OLrzqt(list, function12, z252, melEZpvd, mdtEZpvd, function22, z262, f, z, function13, cornerBasedShape, yho32, z272, yhq22, (LazyListScope) obj);
                                                        }
                                                    };
                                                    composer2 = composerStartRestartGroup;
                                                    composer2.updateRememberedValue(objRememberedValue6);
                                                    composer2.endReplaceableGroup();
                                                    LazyDslKt.LazyColumn(modifier3, lazyListState, null, false, null, null, null, false, (Function1) objRememberedValue6, composer2, (i15 >> 27) & 14, 252);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    modifier2 = modifier3;
                                                    set4 = set3;
                                                    function05 = function04;
                                                    z22 = z5;
                                                    z23 = z6;
                                                    z24 = z7;
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
                        i11 = i3 & 16384;
                        if (i11 != 0) {
                        }
                        i12 = i3 & 32768;
                        if (i12 != 0) {
                        }
                        i13 = i3 & 65536;
                        if (i13 != 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 = i3 & 8192;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 16384;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 32768;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 65536;
                    if (i13 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 |= i16;
                i5 = i3 & 512;
                if (i5 == 0) {
                }
                i6 = i3 & 1024;
                if (i6 == 0) {
                }
                i8 = i3 & 2048;
                if (i8 == 0) {
                }
                int i182 = i7;
                i9 = i3 & 4096;
                if (i9 == 0) {
                }
                i10 = i3 & 8192;
                if (i10 != 0) {
                }
                i11 = i3 & 16384;
                if (i11 != 0) {
                }
                i12 = i3 & 32768;
                if (i12 != 0) {
                }
                i13 = i3 & 65536;
                if (i13 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i4 |= i17;
            if ((i3 & 256) == 0) {
            }
            i4 |= i16;
            i5 = i3 & 512;
            if (i5 == 0) {
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
            }
            i8 = i3 & 2048;
            if (i8 == 0) {
            }
            int i1822 = i7;
            i9 = i3 & 4096;
            if (i9 == 0) {
            }
            i10 = i3 & 8192;
            if (i10 != 0) {
            }
            i11 = i3 & 16384;
            if (i11 != 0) {
            }
            i12 = i3 & 32768;
            if (i12 != 0) {
            }
            i13 = i3 & 65536;
            if (i13 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i4 |= i17;
        if ((i3 & 256) == 0) {
        }
        i4 |= i16;
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i8 = i3 & 2048;
        if (i8 == 0) {
        }
        int i18222 = i7;
        i9 = i3 & 4096;
        if (i9 == 0) {
        }
        i10 = i3 & 8192;
        if (i10 != 0) {
        }
        i11 = i3 & 16384;
        if (i11 != 0) {
        }
        i12 = i3 & 32768;
        if (i12 != 0) {
        }
        i13 = i3 & 65536;
        if (i13 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final Unit AEQbTJ(Function2 function2, LazyListItemInfo lazyListItemInfo, LazyListItemInfo lazyListItemInfo2) {
        Intrinsics.checkNotNullParameter(lazyListItemInfo, "");
        Intrinsics.checkNotNullParameter(lazyListItemInfo2, "");
        function2.invoke(java.lang.Integer.valueOf(lazyListItemInfo.getIndex() - 1), java.lang.Integer.valueOf(lazyListItemInfo2.getIndex() - 1));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final java.util.List list, final Function1 function1, final boolean z, final mEL mel, final mDT mdt, final Function2 function2, final boolean z2, final float f, final boolean z3, final Function1 function12, final CornerBasedShape cornerBasedShape, final yHO yho, final boolean z4, final yHQ yhq, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        LazyListScope.item$default(lazyListScope, null, null, mDE.EZpvd.copydefault(), 3, null);
        final Function1 function13 = new Function1() { // from class: o.mDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mDL.copydefault((mDK) obj);
            }
        };
        final ReorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$1 reorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$1 = new Function1() { // from class: com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Item item) {
                return null;
            }
        };
        lazyListScope.items(list.size(), new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$2
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
                return function13.invoke(list.get(i));
            }
        }, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$3
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
                return reorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableListKt$ReorderableSwipeableList_cecGK18$lambda$18$lambda$17$$inlined$items$default$4
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                }
                mDK mdk = (mDK) list.get(i);
                composer.startReplaceableGroup(-1366477772);
                composer.startReplaceableGroup(-875366103);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                composer.endReplaceableGroup();
                boolean zEZpvd = mDL.EZpvd((MutableState<Boolean>) mutableState);
                composer.startReplaceableGroup(-875363375);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ReorderableSwipeableListKt$ReorderableSwipeableList$5$1$2$1$1(function1, mutableState, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                boolean z5 = false;
                EffectsKt.LaunchedEffect(Boolean.valueOf(zEZpvd), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                composer.startReplaceableGroup(-875359992);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                MutableIntState mutableIntState = (MutableIntState) objRememberedValue3;
                composer.endReplaceableGroup();
                if (z && mdk.KWHzl()) {
                    z5 = true;
                }
                Id idAEQbTJ = mdk.AEQbTJ();
                Intrinsics.copydefault(idAEQbTJ, "");
                Modifier.Companion companion2 = Modifier.Companion;
                composer.startReplaceableGroup(-875349705);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new mDL.TaskDescription(mutableIntState);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                mEF.copydefault(lazyItemScope, mel, idAEQbTJ, OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) objRememberedValue4), z5, ComposableLambdaKt.composableLambda(composer, -1964949525, true, new mDL.Activity(mdk, mdt, function2, z2, f, z3, function12, cornerBasedShape, yho, mutableState, z4, mutableIntState, yhq)), composer, (i3 & 14) | 199680, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final java.lang.Object copydefault(mDK mdk) {
        Intrinsics.checkNotNullParameter(mdk, "");
        Id idAEQbTJ = mdk.AEQbTJ();
        Intrinsics.copydefault(idAEQbTJ, "");
        return idAEQbTJ;
    }

    public static final class TaskDescription implements Function1<IntSize, Unit> {
        public final /* synthetic */ MutableIntState AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(MutableIntState mutableIntState) {
            this.AEQbTJ = mutableIntState;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(IntSize intSize) {
            KWHzl(intSize.m5578unboximpl());
            return Unit.INSTANCE;
        }

        public final void KWHzl(long j) {
            mDL.KWHzl(this.AEQbTJ, IntSize.m5574getWidthimpl(j));
        }
    }

    public static final class Activity implements yHT<InterfaceC31808mEr, java.lang.Boolean, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ yHO<Item, Composer, java.lang.Integer, Unit> AYXKKw;
        public final /* synthetic */ Function1<Item, Unit> AhwBna;
        public final /* synthetic */ mDT<Id, Item> DbNXlk;

        /* JADX INFO: Incorrect field signature: TItem; */
        public final /* synthetic */ mDK EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ MutableState<java.lang.Boolean> copydefault;
        public final /* synthetic */ yHQ<InterfaceC31808mEr, Item, java.lang.Boolean, java.lang.Float, Composer, java.lang.Integer, Unit> djBIcL;
        public final /* synthetic */ MutableIntState gEmmrt;
        public final /* synthetic */ Function2<Id, java.lang.Boolean, Unit> isConnected;
        public final /* synthetic */ float valueOf;
        public final /* synthetic */ CornerBasedShape values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Incorrect types in method signature: (TItem;Lo/mDT<TId;TItem;>;Lkotlin/jvm/functions/Function2<-TId;-Ljava/lang/Boolean;Lkotlin/Unit;>;ZFZLkotlin/jvm/functions/Function1<-TItem;Lkotlin/Unit;>;Landroidx/compose/foundation/shape/CornerBasedShape;Lo/yHO<-TItem;-Landroidx/compose/runtime/Composer;-Ljava/lang/Integer;Lkotlin/Unit;>;Landroidx/compose/runtime/MutableState<Ljava/lang/Boolean;>;ZLandroidx/compose/runtime/MutableIntState;Lo/yHQ<-Lo/mEr;-TItem;-Ljava/lang/Boolean;-Ljava/lang/Float;-Landroidx/compose/runtime/Composer;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
        public Activity(mDK mdk, mDT mdt, Function2 function2, boolean z, float f, boolean z2, Function1 function1, CornerBasedShape cornerBasedShape, yHO yho, MutableState mutableState, boolean z3, MutableIntState mutableIntState, yHQ yhq) {
            this.EZpvd = mdk;
            this.DbNXlk = mdt;
            this.isConnected = function2;
            this.AEQbTJ = z;
            this.valueOf = f;
            this.KWHzl = z2;
            this.AhwBna = function1;
            this.values = cornerBasedShape;
            this.AYXKKw = yho;
            this.copydefault = mutableState;
            this.OLrzqt = z3;
            this.gEmmrt = mutableIntState;
            this.djBIcL = yhq;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(InterfaceC31808mEr interfaceC31808mEr, java.lang.Boolean bool, Composer composer, java.lang.Integer num) {
            OLrzqt(interfaceC31808mEr, bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void OLrzqt(InterfaceC31808mEr interfaceC31808mEr, boolean z, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(interfaceC31808mEr, "");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(interfaceC31808mEr) : composer.changedInstance(interfaceC31808mEr) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1964949525, i2, -1, "com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderableSwipeableList.kt:128)");
                }
                mDL.copydefault(this.copydefault, z);
                composer.startReplaceableGroup(1164161852);
                mDT<Id, Item> mdt = this.DbNXlk;
                mDK mdk = this.EZpvd;
                boolean z2 = this.OLrzqt;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new StateListAnimator(mdt, mdk, z2));
                    composer.updateRememberedValue(objRememberedValue);
                }
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) objRememberedValue;
                composer.endReplaceableGroup();
                mDK mdk2 = this.EZpvd;
                SwipeableState<RevealValue> swipeableStateAEQbTJ = this.DbNXlk.AEQbTJ(mdk2.AEQbTJ());
                composer.startReplaceableGroup(1164185254);
                boolean zChangedInstance = composer.changedInstance(this.DbNXlk);
                boolean zChangedInstance2 = composer.changedInstance(this.EZpvd);
                boolean zChanged = composer.changed(this.isConnected);
                mDT<Id, Item> mdt2 = this.DbNXlk;
                mDK mdk3 = this.EZpvd;
                Function2<Id, java.lang.Boolean, Unit> function2 = this.isConnected;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if ((zChangedInstance | zChangedInstance2 | zChanged) || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Application(mdt2, mdk3, function2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1164200866);
                boolean zChangedInstance3 = composer.changedInstance(this.DbNXlk);
                boolean zChangedInstance4 = composer.changedInstance(this.EZpvd);
                mDT<Id, Item> mdt3 = this.DbNXlk;
                mDK mdk4 = this.EZpvd;
                java.lang.Object objRememberedValue3 = composer.rememberedValue();
                if ((zChangedInstance3 | zChangedInstance4) || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new C0876Activity(mdt3, mdk4);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function12 = (Function1) objRememberedValue3;
                composer.endReplaceableGroup();
                boolean z3 = KWHzl(state) && this.EZpvd.OLrzqt();
                boolean z4 = this.AEQbTJ;
                float f = this.valueOf;
                float fMo513toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo513toDpu2uoSUM(mDL.AEQbTJ(this.gEmmrt));
                boolean z5 = this.KWHzl;
                Function1<Item, Unit> function13 = this.AhwBna;
                CornerBasedShape cornerBasedShape = this.values;
                yHO<Item, Composer, java.lang.Integer, Unit> yho = this.AYXKKw;
                final yHQ<InterfaceC31808mEr, Item, java.lang.Boolean, java.lang.Float, Composer, java.lang.Integer, Unit> yhq = this.djBIcL;
                final mDK mdk5 = this.EZpvd;
                final mDT<Id, Item> mdt4 = this.DbNXlk;
                mDL.AEQbTJ(interfaceC31808mEr, mdk2, swipeableStateAEQbTJ, function1, function12, z3, z4, f, fMo513toDpu2uoSUM, z5, function13, cornerBasedShape, null, yho, ComposableLambdaKt.composableLambda(composer, 2087249997, true, new yHT<InterfaceC31808mEr, java.lang.Float, Composer, java.lang.Integer, Unit>() { // from class: o.mDL.Activity.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // o.yHT
                    public /* synthetic */ Unit invoke(InterfaceC31808mEr interfaceC31808mEr2, java.lang.Float f2, Composer composer2, java.lang.Integer num) {
                        EZpvd(interfaceC31808mEr2, f2.floatValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v1 boolean
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                        */
                    public final void EZpvd(o.InterfaceC31808mEr r11, float r12, androidx.compose.runtime.Composer r13, int r14) {
                        /*
                            r10 = this;
                            java.lang.String r0 = ""
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                            r0 = r14 & 6
                            if (r0 != 0) goto L1d
                            r0 = r14 & 8
                            if (r0 != 0) goto L12
                            boolean r0 = r13.changed(r11)
                            goto L16
                        L12:
                            boolean r0 = r13.changedInstance(r11)
                        L16:
                            if (r0 == 0) goto L1a
                            r0 = 4
                            goto L1b
                        L1a:
                            r0 = 2
                        L1b:
                            r0 = r0 | r14
                            goto L1e
                        L1d:
                            r0 = r14
                        L1e:
                            r14 = r14 & 48
                            if (r14 != 0) goto L2e
                            boolean r14 = r13.changed(r12)
                            if (r14 == 0) goto L2b
                            r14 = 32
                            goto L2d
                        L2b:
                            r14 = 16
                        L2d:
                            r0 = r0 | r14
                        L2e:
                            r14 = r0 & 147(0x93, float:2.06E-43)
                            r1 = 146(0x92, float:2.05E-43)
                            if (r14 != r1) goto L3f
                            boolean r14 = r13.getSkipping()
                            if (r14 != 0) goto L3b
                            goto L3f
                        L3b:
                            r13.skipToGroupEnd()
                            goto L7d
                        L3f:
                            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r14 == 0) goto L4e
                            r14 = -1
                            java.lang.String r1 = "com.okinc.cruilib.compose.composable.common.list.ReorderableSwipeableList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderableSwipeableList.kt:171)"
                            r2 = 2087249997(0x7c68e84d, float:4.837298E36)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r0, r14, r1)
                        L4e:
                            o.yHQ<o.mEr, Item, java.lang.Boolean, java.lang.Float, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r3 = r1
                            o.mDK r5 = r2
                            o.mDT<Id, Item> r14 = r3
                            java.lang.Object r1 = r5.AEQbTJ()
                            boolean r14 = r14.OLrzqt(r1)
                            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)
                            java.lang.Float r7 = java.lang.Float.valueOf(r12)
                            r12 = r0 & 14
                            int r14 = r0 << 6
                            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
                            r12 = r12 | r14
                            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
                            r4 = r11
                            r8 = r13
                            r3.invoke(r4, r5, r6, r7, r8, r9)
                            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r11 == 0) goto L7d
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L7d:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.mDL.Activity.AnonymousClass1.EZpvd(o.mEr, float, androidx.compose.runtime.Composer, int):void");
                    }
                }), composer, i2 & 14, 24576, 2048);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final class StateListAnimator implements Function0<java.lang.Boolean> {
            public final /* synthetic */ mDT<Id, Item> EZpvd;

            /* JADX INFO: Incorrect field signature: TItem; */
            public final /* synthetic */ mDK OLrzqt;
            public final /* synthetic */ boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Incorrect types in method signature: (Lo/mDT<TId;TItem;>;TItem;Z)V */
            public StateListAnimator(mDT mdt, mDK mdk, boolean z) {
                this.EZpvd = mdt;
                this.OLrzqt = mdk;
                this.copydefault = z;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                boolean z;
                SnapshotStateMap snapshotStateMapCopydefault = this.EZpvd.copydefault();
                if (snapshotStateMapCopydefault.isEmpty()) {
                    z = true;
                } else {
                    java.util.Iterator it = snapshotStateMapCopydefault.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((mDS) ((Map.Entry) it.next()).getValue()).AEQbTJ()) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                }
                mDS mds = (mDS) snapshotStateMapCopydefault.get(this.OLrzqt.AEQbTJ());
                boolean z2 = mds != null && mds.AEQbTJ();
                mDS mds2 = (mDS) snapshotStateMapCopydefault.get(this.OLrzqt.AEQbTJ());
                return java.lang.Boolean.valueOf(this.copydefault && (z || z2) && !(mds2 != null && mds2.KWHzl()));
            }
        }

        public static final class Application implements Function1<java.lang.Boolean, Unit> {
            public final /* synthetic */ Function2<Id, java.lang.Boolean, Unit> EZpvd;

            /* JADX INFO: Incorrect field signature: TItem; */
            public final /* synthetic */ mDK KWHzl;
            public final /* synthetic */ mDT<Id, Item> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Incorrect types in method signature: (Lo/mDT<TId;TItem;>;TItem;Lkotlin/jvm/functions/Function2<-TId;-Ljava/lang/Boolean;Lkotlin/Unit;>;)V */
            public Application(mDT mdt, mDK mdk, Function2 function2) {
                this.copydefault = mdt;
                this.KWHzl = mdk;
                this.EZpvd = function2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
                KWHzl(bool.booleanValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void KWHzl(boolean z) {
                if (this.copydefault.EZpvd(this.KWHzl.AEQbTJ(), z)) {
                    this.EZpvd.invoke(this.KWHzl.AEQbTJ(), java.lang.Boolean.valueOf(z));
                }
            }
        }

        /* JADX INFO: renamed from: o.mDL$Activity$Activity, reason: collision with other inner class name */
        public static final class C0876Activity implements Function1<java.lang.Boolean, Unit> {
            public final /* synthetic */ mDT<Id, Item> AEQbTJ;

            /* JADX INFO: Incorrect field signature: TItem; */
            public final /* synthetic */ mDK OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Incorrect types in method signature: (Lo/mDT<TId;TItem;>;TItem;)V */
            public C0876Activity(mDT mdt, mDK mdk) {
                this.AEQbTJ = mdt;
                this.OLrzqt = mdk;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
                OLrzqt(bool.booleanValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void OLrzqt(boolean z) {
                this.AEQbTJ.AEQbTJ(this.OLrzqt.AEQbTJ(), z);
            }
        }

        public static final boolean KWHzl(androidx.compose.runtime.State<java.lang.Boolean> state) {
            return state.getValue().booleanValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Id, Item extends mDK<Id>> void AEQbTJ(final InterfaceC31808mEr interfaceC31808mEr, final Item item, final SwipeableState<RevealValue> swipeableState, final Function1<? super java.lang.Boolean, Unit> function1, final Function1<? super java.lang.Boolean, Unit> function12, final boolean z, final boolean z2, final float f, final float f2, final boolean z3, final Function1<? super Item, Unit> function13, final CornerBasedShape cornerBasedShape, Modifier modifier, yHO<? super Item, ? super Composer, ? super java.lang.Integer, Unit> yho, yHT<? super InterfaceC31808mEr, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        androidx.compose.runtime.State state;
        java.lang.Object objRememberedValue2;
        androidx.compose.runtime.State state2;
        boolean z4;
        boolean z5;
        java.lang.Object objRememberedValue3;
        boolean z6;
        java.lang.Object objRememberedValue4;
        boolean z7;
        java.lang.Object objRememberedValue5;
        boolean z8;
        java.lang.Object objRememberedValue6;
        Composer composer2;
        final Modifier modifier2;
        final yHT<? super InterfaceC31808mEr, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht2;
        final yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yho2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-457480861);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interfaceC31808mEr) : composerStartRestartGroup.changedInstance(interfaceC31808mEr) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(item) : composerStartRestartGroup.changedInstance(item) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= composerStartRestartGroup.changed(swipeableState) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 8) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((i3 & 16) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
            }
            if ((i3 & 32) == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i3 & 64) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
            }
            if ((i3 & 128) == 0) {
                i4 |= 100663296;
            } else {
                if ((100663296 & i) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                }
                if ((i3 & 256) != 0) {
                    i4 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((805306368 & i) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                    }
                    if ((i3 & 512) == 0) {
                        i5 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i5 = (composerStartRestartGroup.changedInstance(function13) ? 4 : 2) | i2;
                    } else {
                        i5 = i2;
                    }
                    if ((i3 & 1024) == 0) {
                        i5 |= 48;
                    } else {
                        if ((i2 & 48) == 0) {
                            i5 |= composerStartRestartGroup.changed(cornerBasedShape) ? 32 : 16;
                        }
                        i6 = i3 & 2048;
                        if (i6 != 0) {
                            i5 |= MLKEMEngine.KyberPolyBytes;
                        } else {
                            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                            }
                            i7 = i3 & 4096;
                            if (i7 == 0) {
                                i5 |= 3072;
                            } else {
                                if ((i2 & 3072) == 0) {
                                    i5 |= composerStartRestartGroup.changedInstance(yho) ? 2048 : 1024;
                                }
                                i8 = i3 & 8192;
                                if (i8 == 0) {
                                    if ((i2 & 24576) == 0) {
                                        i5 |= composerStartRestartGroup.changedInstance(yht) ? 16384 : 8192;
                                    }
                                    if ((i4 & 306783379) == 306783378 || (i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier3 = i6 == 0 ? Modifier.Companion : modifier;
                                        yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yhoKWHzl = i7 == 0 ? mDE.EZpvd.KWHzl() : yho;
                                        yHT<? super InterfaceC31808mEr, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yhtOLrzqt = i8 == 0 ? mDE.EZpvd.OLrzqt() : yht;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-457480861, i4, i5, "com.okinc.cruilib.compose.composable.common.list.SwipeableItem (ReorderableSwipeableList.kt:200)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(386610705);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.Companion;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.mDN
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return java.lang.Boolean.valueOf(mDL.OLrzqt(swipeableState));
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        state = (androidx.compose.runtime.State) objRememberedValue;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(386619711);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.mDP
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return java.lang.Boolean.valueOf(mDL.EZpvd(swipeableState));
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        state2 = (androidx.compose.runtime.State) objRememberedValue2;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        boolean zAEQbTJ = AEQbTJ((androidx.compose.runtime.State<java.lang.Boolean>) state2);
                                        composerStartRestartGroup.startReplaceableGroup(386636365);
                                        int i9 = i5;
                                        z4 = (i5 & 14) != 4;
                                        z5 = (i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(item));
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (!(z4 | z5) || objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new ReorderableSwipeableListKt$SwipeableItem$1$1(function13, item, state2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        C31802mEl.AEQbTJ(java.lang.Boolean.valueOf(zAEQbTJ), (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                                        boolean zKWHzl = KWHzl((androidx.compose.runtime.State<java.lang.Boolean>) state);
                                        composerStartRestartGroup.startReplaceableGroup(386642600);
                                        z6 = (i4 & 7168) != 2048;
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (!z6 || objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = new ReorderableSwipeableListKt$SwipeableItem$2$1(function1, state, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        C31802mEl.AEQbTJ(java.lang.Boolean.valueOf(zKWHzl), (Function2) objRememberedValue4, composerStartRestartGroup, 0);
                                        java.util.Set setAEQbTJ = yED.AEQbTJ(RevealDirection.EndToStart);
                                        long jM3184getTransparent0d7_KjU = Color.Companion.m3184getTransparent0d7_KjU();
                                        composerStartRestartGroup.startReplaceableGroup(386652365);
                                        int i10 = 57344 & i4;
                                        z7 = i10 != 16384;
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!z7 || objRememberedValue5 == companion.getEmpty()) {
                                            objRememberedValue5 = new Function0() { // from class: o.mDQ
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return mDL.AEQbTJ(function12);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        }
                                        Function0 function0 = (Function0) objRememberedValue5;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(386654734);
                                        z8 = i10 == 16384;
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!z8 || objRememberedValue6 == companion.getEmpty()) {
                                            objRememberedValue6 = new Function0() { // from class: o.mDV
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return mDL.EZpvd(function12);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        int i11 = i4 >> 12;
                                        int i12 = i4 >> 6;
                                        yHT<? super InterfaceC31808mEr, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht3 = yhtOLrzqt;
                                        composer2 = composerStartRestartGroup;
                                        yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yho3 = yhoKWHzl;
                                        C31825mFh.AEQbTJ(modifier3, z, z2, function0, (Function0) objRememberedValue6, null, null, null, null, null, false, false, false, cornerBasedShape, null, f, f2, z3, 0.0f, setAEQbTJ, 0L, null, 0.0f, 0L, jM3184getTransparent0d7_KjU, 0L, null, swipeableState, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1588195697, true, new Application(yhoKWHzl, item, i4)), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1055458389, true, new StateListAnimator(yhtOLrzqt, interfaceC31808mEr)), composer2, ((i9 >> 6) & 14) | (i11 & WalletImportError.ERROR_CODE_AA_EXIST) | (i11 & FaceDetector.NUM_BOXES), ((i9 << 6) & 7168) | 805306752 | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128), ((i4 << 15) & 29360128) | 100687872, 6, 653545440);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier2 = modifier3;
                                        yht2 = yht3;
                                        yho2 = yho3;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        yho2 = yho;
                                        yht2 = yht;
                                        composer2 = composerStartRestartGroup;
                                        modifier2 = modifier;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.mDU
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return mDL.copydefault(interfaceC31808mEr, item, swipeableState, function1, function12, z, z2, f, f2, z3, function13, cornerBasedShape, modifier2, yho2, yht2, i, i2, i3, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i5 |= 24576;
                                if ((i4 & 306783379) == 306783378) {
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(386610705);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.Companion;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    state = (androidx.compose.runtime.State) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(386619711);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                    }
                                    state2 = (androidx.compose.runtime.State) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    boolean zAEQbTJ2 = AEQbTJ((androidx.compose.runtime.State<java.lang.Boolean>) state2);
                                    composerStartRestartGroup.startReplaceableGroup(386636365);
                                    int i92 = i5;
                                    if ((i5 & 14) != 4) {
                                    }
                                    if ((i4 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (!(z4 | z5)) {
                                            objRememberedValue3 = new ReorderableSwipeableListKt$SwipeableItem$1$1(function13, item, state2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            C31802mEl.AEQbTJ(java.lang.Boolean.valueOf(zAEQbTJ2), (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                                            boolean zKWHzl2 = KWHzl((androidx.compose.runtime.State<java.lang.Boolean>) state);
                                            composerStartRestartGroup.startReplaceableGroup(386642600);
                                            if ((i4 & 7168) != 2048) {
                                            }
                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (!z6) {
                                                objRememberedValue4 = new ReorderableSwipeableListKt$SwipeableItem$2$1(function1, state, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                C31802mEl.AEQbTJ(java.lang.Boolean.valueOf(zKWHzl2), (Function2) objRememberedValue4, composerStartRestartGroup, 0);
                                                java.util.Set setAEQbTJ2 = yED.AEQbTJ(RevealDirection.EndToStart);
                                                long jM3184getTransparent0d7_KjU2 = Color.Companion.m3184getTransparent0d7_KjU();
                                                composerStartRestartGroup.startReplaceableGroup(386652365);
                                                int i102 = 57344 & i4;
                                                if (i102 != 16384) {
                                                }
                                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                if (!z7) {
                                                    objRememberedValue5 = new Function0() { // from class: o.mDQ
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Object invoke() {
                                                            return mDL.AEQbTJ(function12);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                    Function0 function02 = (Function0) objRememberedValue5;
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.startReplaceableGroup(386654734);
                                                    if (i102 == 16384) {
                                                    }
                                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                    if (!z8) {
                                                        objRememberedValue6 = new Function0() { // from class: o.mDV
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Object invoke() {
                                                                return mDL.EZpvd(function12);
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        int i112 = i4 >> 12;
                                                        int i122 = i4 >> 6;
                                                        yHT<? super InterfaceC31808mEr, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht32 = yhtOLrzqt;
                                                        composer2 = composerStartRestartGroup;
                                                        yHO<java.lang.Object, Composer, java.lang.Integer, Unit> yho32 = yhoKWHzl;
                                                        C31825mFh.AEQbTJ(modifier3, z, z2, function02, (Function0) objRememberedValue6, null, null, null, null, null, false, false, false, cornerBasedShape, null, f, f2, z3, 0.0f, setAEQbTJ2, 0L, null, 0.0f, 0L, jM3184getTransparent0d7_KjU2, 0L, null, swipeableState, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1588195697, true, new Application(yhoKWHzl, item, i4)), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1055458389, true, new StateListAnimator(yhtOLrzqt, interfaceC31808mEr)), composer2, ((i92 >> 6) & 14) | (i112 & WalletImportError.ERROR_CODE_AA_EXIST) | (i112 & FaceDetector.NUM_BOXES), ((i92 << 6) & 7168) | 805306752 | (i122 & 458752) | (i122 & 3670016) | (i122 & 29360128), ((i4 << 15) & 29360128) | 100687872, 6, 653545440);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        modifier2 = modifier3;
                                                        yht2 = yht32;
                                                        yho2 = yho32;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i8 = i3 & 8192;
                            if (i8 == 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i7 = i3 & 4096;
                        if (i7 == 0) {
                        }
                        i8 = i3 & 8192;
                        if (i8 == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i6 = i3 & 2048;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 == 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i3 & 512) == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                i6 = i3 & 2048;
                if (i6 != 0) {
                }
                i7 = i3 & 4096;
                if (i7 == 0) {
                }
                i8 = i3 & 8192;
                if (i8 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            i6 = i3 & 2048;
            if (i6 != 0) {
            }
            i7 = i3 & 4096;
            if (i7 == 0) {
            }
            i8 = i3 & 8192;
            if (i8 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        i6 = i3 & 2048;
        if (i6 != 0) {
        }
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        i8 = i3 & 8192;
        if (i8 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final boolean OLrzqt(SwipeableState swipeableState) {
        SwipeProgress progress = swipeableState.getProgress();
        if (progress.getFraction() == 1.0f) {
            java.lang.Object from = progress.getFrom();
            RevealValue revealValue = RevealValue.Default;
            if (from == revealValue && progress.getTo() == revealValue) {
                return true;
            }
        }
        return false;
    }

    public static final boolean EZpvd(SwipeableState swipeableState) {
        SwipeProgress progress = swipeableState.getProgress();
        if (progress.getFraction() == 1.0f) {
            java.lang.Object from = progress.getFrom();
            RevealValue revealValue = RevealValue.FullyRevealedStart;
            if (from != revealValue || progress.getTo() != revealValue) {
                java.lang.Object from2 = progress.getFrom();
                RevealValue revealValue2 = RevealValue.FullyRevealedEnd;
                if (from2 != revealValue2 || progress.getTo() != revealValue2) {
                }
            }
            return true;
        }
        return false;
    }

    public static final Unit AEQbTJ(Function1 function1) {
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final class Application implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ yHO<Item, Composer, java.lang.Integer, Unit> AEQbTJ;
        public final /* synthetic */ int OLrzqt;

        /* JADX INFO: Incorrect field signature: TItem; */
        public final /* synthetic */ mDK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Incorrect types in method signature: (Lo/yHO<-TItem;-Landroidx/compose/runtime/Composer;-Ljava/lang/Integer;Lkotlin/Unit;>;TItem;I)V */
        public Application(yHO yho, mDK mdk, int i) {
            this.AEQbTJ = yho;
            this.copydefault = mdk;
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            KWHzl(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void KWHzl(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1588195697, i, -1, "com.okinc.cruilib.compose.composable.common.list.SwipeableItem.<anonymous> (ReorderableSwipeableList.kt:253)");
            }
            this.AEQbTJ.invoke((Item) this.copydefault, composer, java.lang.Integer.valueOf((this.OLrzqt >> 3) & 8));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final class StateListAnimator implements yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ InterfaceC31808mEr KWHzl;
        public final /* synthetic */ yHT<InterfaceC31808mEr, java.lang.Float, Composer, java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super o.mEr, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(yHT<? super InterfaceC31808mEr, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht, InterfaceC31808mEr interfaceC31808mEr) {
            this.copydefault = yht;
            this.KWHzl = interfaceC31808mEr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(Shape shape, java.lang.Float f, Composer composer, java.lang.Integer num) {
            copydefault(shape, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Shape shape, float f, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(shape, "");
            if ((i & 48) == 0) {
                i |= composer.changed(f) ? 32 : 16;
            }
            if ((i & CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055458389, i, -1, "com.okinc.cruilib.compose.composable.common.list.SwipeableItem.<anonymous> (ReorderableSwipeableList.kt:256)");
            }
            this.copydefault.invoke(this.KWHzl, java.lang.Float.valueOf(f), composer, java.lang.Integer.valueOf(i & WalletImportError.ERROR_CODE_AA_EXIST));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final <Id, Item extends mDK<Id>> mDT<Id, Item> EZpvd(java.util.List<? extends Item> list, CoroutineScope coroutineScope, Composer composer, int i) {
        composer.startReplaceableGroup(-890418733);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-890418733, i, -1, "com.okinc.cruilib.compose.composable.common.list.rememberSwipeableListState (ReorderableSwipeableList.kt:264)");
        }
        composer.startReplaceableGroup(-2060257577);
        java.lang.Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new mDT(list, coroutineScope);
            composer.updateRememberedValue(objRememberedValue);
        }
        mDT<Id, Item> mdt = (mDT) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mdt;
    }

    public static final boolean EZpvd(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void copydefault(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final int AEQbTJ(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void KWHzl(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final boolean KWHzl(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean AEQbTJ(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }
}
