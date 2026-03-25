package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.wYX;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wWy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52749wWy {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(Modifier modifier, java.util.List list, int i, int i2, int i3, int i4, Function2 function2, int i5, int i6, Composer composer, int i7) {
        copydefault(modifier, list, i, i2, i3, i4, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void copydefault(Modifier modifier, @NotNull final java.util.List<wWR<T>> list, int i, int i2, int i3, int i4, Function2<? super java.lang.Integer, ? super wWR<T>, Unit> function2, Composer composer, final int i5, final int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        final int i10;
        int i11;
        int i12;
        int i13;
        Function2<? super java.lang.Integer, ? super wWR<T>, Unit> function22;
        Modifier modifier3;
        int i14;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        boolean zChanged;
        boolean z;
        Function2<? super java.lang.Integer, ? super wWR<T>, Unit> function23;
        int i15;
        boolean z2;
        java.lang.Object obj;
        final java.util.List list2;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        final Activity activity;
        boolean z3;
        boolean zChangedInstance;
        java.lang.Object objRememberedValue2;
        boolean zChanged2;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue3;
        final int i16;
        final int i17;
        final Function2<? super java.lang.Integer, ? super wWR<T>, Unit> function24;
        final int i18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(list, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1262133570);
        int i19 = i6 & 1;
        if (i19 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i7 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i20 = i6 & 4;
        if (i20 != 0) {
            i7 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
                i8 = i;
                i7 |= composerStartRestartGroup.changed(i8) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    i10 = i2;
                    i7 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
                }
                i11 = i6 & 32;
                if (i11 == 0) {
                    if ((196608 & i5) == 0) {
                        i12 = i4;
                        i7 |= composerStartRestartGroup.changed(i12) ? 131072 : 65536;
                    }
                    i13 = i6 & 64;
                    if (i13 == 0) {
                        i7 |= 1572864;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i5 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                    }
                    if ((i7 & 590995) == 590994 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i19 == 0 ? Modifier.Companion : modifier2;
                        if (i20 != 0) {
                            i8 = -1;
                        }
                        if (i9 != 0) {
                            i10 = 4;
                        }
                        i14 = (i6 & 16) == 0 ? 3 : i3;
                        int i21 = i11 == 0 ? 44 : i12;
                        if (i13 != 0) {
                            function22 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1262133570, i7, -1, "com.okinc.tradingbot.impl.widget.compose.OKSelectionChipGroupWrap (OKSelectionChipGroupWrap.kt:56)");
                        }
                        androidx.compose.runtime.State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function22, composerStartRestartGroup, (i7 >> 18) & 14);
                        androidx.compose.runtime.State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(list, composerStartRestartGroup, (i7 >> 3) & 14);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(java.lang.Integer.valueOf(i8), composerStartRestartGroup, (i7 >> 6) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-651409167);
                        zChanged = composerStartRestartGroup.changed(list);
                        z = (458752 & i7) != 131072;
                        java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!(z || zChanged) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            int i22 = 0;
                            for (T t : list) {
                                if (i22 < 0) {
                                    yDY.AYXKKw();
                                }
                                java.lang.String strOLrzqt = ((wWR) t).OLrzqt();
                                Function2<? super java.lang.Integer, ? super wWR<T>, Unit> function25 = function22;
                                int i23 = i14;
                                arrayList.add(new wYO(strOLrzqt, i21, i8 == i22, true));
                                i22++;
                                function22 = function25;
                                i14 = i23;
                            }
                            function23 = function22;
                            i15 = i14;
                            z2 = true;
                            composerStartRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                        } else {
                            function23 = function22;
                            i15 = i14;
                            z2 = true;
                            obj = objRememberedValue4;
                        }
                        list2 = (java.util.List) obj;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-651399062);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Activity(stateRememberUpdatedState3, stateRememberUpdatedState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        activity = (Activity) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-651382944);
                        z3 = (i7 & 7168) == 2048 ? z2 : false;
                        zChangedInstance = composerStartRestartGroup.changedInstance(list2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | zChangedInstance) || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: o.wWC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return C52749wWy.KWHzl(i10, list2, activity, (android.content.Context) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-651368790);
                        zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(list2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(zChanged2 | zChangedInstance2) || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: o.wWz
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return C52749wWy.OLrzqt(stateRememberUpdatedState, list2, (wYX) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue3, composerStartRestartGroup, (i7 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i16 = i21;
                        i17 = i10;
                        function24 = function23;
                        i18 = i15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function24 = function22;
                        modifier3 = modifier2;
                        i17 = i10;
                        i16 = i12;
                        i18 = i3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final int i24 = i8;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.wWA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return C52749wWy.KWHzl(modifier4, list, i24, i17, i18, i16, function24, i5, i6, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 = i4;
                i13 = i6 & 64;
                if (i13 == 0) {
                }
                if ((i7 & 590995) == 590994) {
                    if (i19 == 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i6 & 16) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State stateRememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(function22, composerStartRestartGroup, (i7 >> 18) & 14);
                    androidx.compose.runtime.State stateRememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(list, composerStartRestartGroup, (i7 >> 3) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(java.lang.Integer.valueOf(i8), composerStartRestartGroup, (i7 >> 6) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-651409167);
                    zChanged = composerStartRestartGroup.changed(list);
                    if ((458752 & i7) != 131072) {
                    }
                    java.lang.Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChanged)) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        int i222 = 0;
                        while (r10.hasNext()) {
                        }
                        function23 = function22;
                        i15 = i14;
                        z2 = true;
                        composerStartRestartGroup.updateRememberedValue(arrayList2);
                        obj = arrayList2;
                        list2 = (java.util.List) obj;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-651399062);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        activity = (Activity) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-651382944);
                        if ((i7 & 7168) == 2048) {
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(list2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z3 | zChangedInstance)) {
                            objRememberedValue2 = new Function1() { // from class: o.wWC
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return C52749wWy.KWHzl(i10, list2, activity, (android.content.Context) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Function1 function12 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-651368790);
                            zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(list2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(zChanged2 | zChangedInstance2)) {
                                objRememberedValue3 = new Function1() { // from class: o.wWz
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return C52749wWy.OLrzqt(stateRememberUpdatedState, list2, (wYX) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifier3, (Function1) objRememberedValue3, composerStartRestartGroup, (i7 << 3) & WalletImportError.ERROR_CODE_AA_EXIST, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i16 = i21;
                                i17 = i10;
                                function24 = function23;
                                i18 = i15;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i10 = i2;
            i11 = i6 & 32;
            if (i11 == 0) {
            }
            i12 = i4;
            i13 = i6 & 64;
            if (i13 == 0) {
            }
            if ((i7 & 590995) == 590994) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i;
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i6 & 32;
        if (i11 == 0) {
        }
        i12 = i4;
        i13 = i6 & 64;
        if (i13 == 0) {
        }
        if ((i7 & 590995) == 590994) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: renamed from: o.wWy$Activity */
    public static final class Activity implements wYX.ActionBar {
        public final /* synthetic */ androidx.compose.runtime.State<java.util.List<wWR<T>>> EZpvd;
        public final /* synthetic */ androidx.compose.runtime.State<Function2<java.lang.Integer, wWR<T>, Unit>> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.compose.runtime.State<? extends java.util.List<o.wWR<T>>> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.wWR<T>, kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(androidx.compose.runtime.State<? extends java.util.List<wWR<T>>> state, androidx.compose.runtime.State<? extends Function2<? super java.lang.Integer, ? super wWR<T>, Unit>> state2) {
            this.EZpvd = state;
            this.copydefault = state2;
        }

        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Function2 function2;
            Intrinsics.checkNotNullParameter(wys, "");
            java.util.List list = (java.util.List) this.EZpvd.getValue();
            java.util.Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd(((wWR) it.next()).OLrzqt(), wys.getText())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0 || i >= list.size() || (function2 = (Function2) this.copydefault.getValue()) == null) {
                return;
            }
            function2.invoke(java.lang.Integer.valueOf(i), list.get(i));
        }
    }

    public static final wYX KWHzl(final int i, java.util.List list, Activity activity, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final wYX wyx = new wYX(context, null, 0, 6, null);
        wyx.setColumnCount(i);
        wyx.setSelectionChipBeans(list);
        wyx.setOnChipClickListener(activity);
        if (C55296xhK.OLrzqt(context)) {
            wyx.post(new java.lang.Runnable() { // from class: o.wWB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C52749wWy.OLrzqt(wyx, i);
                }
            });
        }
        return wyx;
    }

    public static final void OLrzqt(wYX wyx, int i) {
        EZpvd(wyx, i);
    }

    public static final Unit OLrzqt(androidx.compose.runtime.State state, java.util.List list, wYX wyx) {
        Intrinsics.checkNotNullParameter(wyx, "");
        int iIntValue = ((java.lang.Number) state.getValue()).intValue();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((wYO) obj).KWHzl(i == iIntValue);
            i++;
        }
        wyx.setSelectionChipBeans(list);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(wYX wyx, int i) {
        RecyclerView recyclerViewCopydefault = copydefault(wyx);
        if (recyclerViewCopydefault == null || recyclerViewCopydefault.getItemDecorationCount() == 0 || recyclerViewCopydefault.getChildCount() == 0 || (recyclerViewCopydefault.getItemDecorationAt(0) instanceof wWP)) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        RecyclerView.ItemDecoration itemDecorationAt = recyclerViewCopydefault.getItemDecorationAt(0);
        android.view.View childAt = recyclerViewCopydefault.getChildAt(0);
        Intrinsics.copydefault(childAt);
        itemDecorationAt.getItemOffsets(rect, childAt, recyclerViewCopydefault, new RecyclerView.State());
        int i2 = rect.right;
        if (i2 <= 0) {
            return;
        }
        while (recyclerViewCopydefault.getItemDecorationCount() > 0) {
            recyclerViewCopydefault.removeItemDecorationAt(0);
        }
        recyclerViewCopydefault.addItemDecoration(new wWP(i, i2));
    }

    public static final RecyclerView copydefault(android.view.ViewGroup viewGroup) {
        RecyclerView recyclerViewCopydefault;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof android.view.ViewGroup) && (recyclerViewCopydefault = copydefault((android.view.ViewGroup) childAt)) != null) {
                return recyclerViewCopydefault;
            }
        }
        return null;
    }
}
