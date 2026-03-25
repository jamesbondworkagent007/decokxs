package o;

import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.content.res.ResourcesCompat;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.buysell.view.banner.BannerPillButtonKt$BannerPillButton$1;
import com.okinc.buysell.view.banner.BannerPillButtonKt$ShowPopUp$1$1;
import com.okinc.okx.paymentapi.service.SupportBanner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C31351lsQ;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30342lUv {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.util.List list, java.util.List list2, Function2 function2, Function1 function1, Function0 function0, Function1 function12, int i, Composer composer, int i2) {
        AEQbTJ(list, list2, function2, function1, function0, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.util.List list, java.util.List list2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Function2 function2, Function1 function1, int i, Composer composer, int i2) {
        AEQbTJ((java.util.List<SupportBanner>) list, (java.util.List<SupportBanner>) list2, (MutableState<java.util.List<SupportBanner>>) mutableState, (MutableState<java.lang.Boolean>) mutableState2, (MutableState<Offset>) mutableState3, (Function2<? super java.lang.String, ? super java.lang.Integer, Unit>) function2, (Function1<? super java.util.List<SupportBanner>, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, androidx.compose.runtime.MutableState] */
    public static final void AEQbTJ(final java.util.List<SupportBanner> list, @NotNull final java.util.List<SupportBanner> list2, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, @NotNull final Function1<? super java.util.List<SupportBanner>, Unit> function1, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.lang.Boolean, Unit> function12, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(999545432);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999545432, i3, -1, "com.okinc.buysell.view.banner.BannerPillButton (BannerPillButton.kt:37)");
            }
            composerStartRestartGroup.startReplaceableGroup(2039605921);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2039607873);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2039609799);
            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2899boximpl(Offset.Companion.m2926getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2039611842);
            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m2967boximpl(androidx.compose.ui.geometry.Size.Companion.m2988getZeroNHjbRc()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            composerStartRestartGroup.startReplaceableGroup(2039614771);
            java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(yDY.AhwBna(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            objectRef.element = (MutableState) objRememberedValue5;
            EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(list2.hashCode()), new BannerPillButtonKt$BannerPillButton$1(list2, function12, mutableState, objectRef, mutableState2, null), composerStartRestartGroup, 0);
            int i4 = i3 << 9;
            AEQbTJ(list, list2, (MutableState<java.util.List<SupportBanner>>) objectRef.element, (MutableState<java.lang.Boolean>) mutableState, (MutableState<Offset>) mutableState3, function2, function1, composerStartRestartGroup, (i3 & 14) | 27648 | (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | (458752 & i4) | (i4 & 3670016));
            if (EZpvd(mutableState2)) {
                function12.invoke(java.lang.Boolean.TRUE);
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(Modifier.Companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.giSNqX, composerStartRestartGroup, 0), 0.0f, PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.giSNqX, composerStartRestartGroup, 0), 5, null);
                composerStartRestartGroup.startReplaceableGroup(2039650819);
                java.lang.Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: o.lUt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C30342lUv.EZpvd(mutableState3, mutableState4, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM675paddingqDBjuR0$default, (Function1) objRememberedValue6);
                composerStartRestartGroup.startReplaceableGroup(2039657917);
                java.lang.Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: o.lUx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C30342lUv.copydefault((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue7, modifierOnGloballyPositioned, new Function1() { // from class: o.lUC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C30342lUv.copydefault(list2, objectRef, mutableState, function0, (C54989xbV) obj);
                    }
                }, composerStartRestartGroup, 6, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.lUA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C30342lUv.EZpvd(list, list2, function2, function1, function0, function12, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void copydefault(MutableState<androidx.compose.ui.geometry.Size> mutableState, long j) {
        mutableState.setValue(androidx.compose.ui.geometry.Size.m2967boximpl(j));
    }

    public static final Unit EZpvd(MutableState mutableState, MutableState mutableState2, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        mutableState.setValue(Offset.m2899boximpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates)));
        copydefault(mutableState2, IntSizeKt.m5584toSizeozmzZPI(layoutCoordinates.mo4392getSizeYbymL2g()));
        return Unit.INSTANCE;
    }

    public static final C54989xbV copydefault(android.content.Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "");
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setStyle(C52761wXj.LoaderManager.aKErDB);
        if (C33492mxV.OLrzqt()) {
            c54989xbV.setBackgroundColor(context.getColor(C52761wXj.Activity.aCSzUz));
            i = C52761wXj.Activity.YFmri;
        } else {
            c54989xbV.setBackgroundColor(context.getColor(C52761wXj.Activity.YFmri));
            i = C52761wXj.Activity.aCSzUz;
        }
        C55296xhK.EZpvd(c54989xbV, c54989xbV.getResources().getDimension(C52761wXj.StateListAnimator.gGvvIC));
        c54989xbV.setForegroundGravity(17);
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        int dimension = (int) textViewEZpvd.getResources().getDimension(C52761wXj.StateListAnimator.giSNqX);
        textViewEZpvd.setPadding(dimension, textViewEZpvd.getPaddingTop(), dimension, textViewEZpvd.getPaddingBottom());
        textViewEZpvd.setTextColor(textViewEZpvd.getResources().getColor(i, null));
        android.widget.ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
        imageViewOLrzqt.setVisibility(0);
        imageViewOLrzqt.setImageDrawable(ResourcesCompat.getDrawable(imageViewOLrzqt.getResources(), C52761wXj.TaskDescription.bindToGooglePlayService, null));
        imageViewOLrzqt.setColorFilter(imageViewOLrzqt.getResources().getColor(i, null));
        android.widget.ImageView imageViewAEQbTJ = c54989xbV.AEQbTJ();
        imageViewAEQbTJ.setImageDrawable(ResourcesCompat.getDrawable(imageViewAEQbTJ.getResources(), C52761wXj.TaskDescription.shErWi, null));
        imageViewAEQbTJ.setVisibility(0);
        imageViewAEQbTJ.setColorFilter(imageViewAEQbTJ.getResources().getColor(C52761wXj.Activity.invokespecialsiEkQe, null));
        return c54989xbV;
    }

    public static final Unit copydefault(final java.util.List list, final Ref.ObjectRef objectRef, final MutableState mutableState, final Function0 function0, C54989xbV c54989xbV) {
        Intrinsics.checkNotNullParameter(c54989xbV, "");
        c54989xbV.EZpvd().setText(copydefault(list.size()));
        c54989xbV.setOnClickListener(new View.OnClickListener() { // from class: o.lUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30342lUv.copydefault(objectRef, list, mutableState, function0, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.ObjectRef objectRef, java.util.List list, MutableState mutableState, Function0 function0, android.view.View view) {
        ((MutableState) objectRef.element).setValue(list);
        mutableState.setValue(java.lang.Boolean.TRUE);
        function0.invoke();
    }

    public static final void AEQbTJ(final java.util.List<SupportBanner> list, @NotNull final java.util.List<SupportBanner> list2, @NotNull final MutableState<java.util.List<SupportBanner>> mutableState, @NotNull final MutableState<java.lang.Boolean> mutableState2, @NotNull final MutableState<Offset> mutableState3, @NotNull final Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2, @NotNull final Function1<? super java.util.List<SupportBanner>, Unit> function1, Composer composer, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        java.lang.Integer num;
        int i5;
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(mutableState, "");
        Intrinsics.checkNotNullParameter(mutableState2, "");
        Intrinsics.checkNotNullParameter(mutableState3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1696125848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i6 = i2;
        if ((599187 & i6) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1696125848, i6, -1, "com.okinc.buysell.view.banner.ShowPopUp (BannerPillButton.kt:149)");
            }
            boolean z2 = list != null && (list.isEmpty() ^ true);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(list != null ? list.hashCode() : 0);
            composerStartRestartGroup.startReplaceableGroup(-874177113);
            boolean zChanged = composerStartRestartGroup.changed(z2);
            boolean z3 = (i6 & FaceDetector.NUM_BOXES) == 256;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            int i7 = i6 & 7168;
            boolean z4 = i7 == 2048;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(list2);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (((zChanged | z3 | zChangedInstance | z4) || zChangedInstance2) || objRememberedValue == Composer.Companion.getEmpty()) {
                z = true;
                i3 = i6;
                i4 = i7;
                num = numValueOf;
                i5 = 2048;
                BannerPillButtonKt$ShowPopUp$1$1 bannerPillButtonKt$ShowPopUp$1$1 = new BannerPillButtonKt$ShowPopUp$1$1(z2, mutableState, list, mutableState2, list2, null);
                composerStartRestartGroup.updateRememberedValue(bannerPillButtonKt$ShowPopUp$1$1);
                objRememberedValue = bannerPillButtonKt$ShowPopUp$1$1;
            } else {
                i3 = i6;
                i4 = i7;
                i5 = 2048;
                num = numValueOf;
                z = true;
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (mutableState2.getValue().booleanValue()) {
                java.util.List<SupportBanner> value = mutableState.getValue();
                long jM2920unboximpl = mutableState3.getValue().m2920unboximpl();
                composerStartRestartGroup.startReplaceableGroup(-874164881);
                boolean z5 = i4 == i5 ? z : false;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(list);
                boolean z6 = (i3 & 3670016) == 1048576 ? z : false;
                java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if ((z6 | z5 | zChangedInstance3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: o.lUB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C30342lUv.KWHzl(mutableState2, list, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                C30346lUz.AEQbTJ(value, jM2920unboximpl, (Function0) objRememberedValue2, function2, composerStartRestartGroup, (i3 >> 6) & 7168);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.lUy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C30342lUv.OLrzqt(list, list2, mutableState, mutableState2, mutableState3, function2, function1, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit KWHzl(MutableState mutableState, java.util.List list, Function1 function1) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        if (list != null) {
            function1.invoke(list);
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String copydefault(int i) {
        if (i == 1) {
            return C33069mpW.getFormattedString$default(C33070mpX.AYXKKw(C31351lsQ.Activity.ODWQjV), null, 2, null);
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.DXXBbs), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i))));
    }

    public static final boolean EZpvd(MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void OLrzqt(MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }
}
