package o;

import androidx.compose.material3.TooltipKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.KlineTimeToolType;
import com.okinc.kline.timeanchor.KlineFastJumpManager$executeSmoothMoveAnimation$1$1;
import com.okinc.kline.timeanchor.KlineFastJumpManager$hidePositionLine$1;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import o.C36353oYq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36348oYl {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C36357oYu KWHzl = new C36357oYu();
    public final C36353oYq AEQbTJ = new C36353oYq();
    public KlineTimeAnchorType copydefault = KlineTimeAnchorType.AnchorCenter;
    public boolean OLrzqt = true;

    public final long OLrzqt(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* JADX INFO: renamed from: o.oYl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oYl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void OLrzqt(@NotNull C36250oUv c36250oUv, @NotNull androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, long j, long j2, @NotNull java.lang.String str3, @NotNull InterfaceC36351oYo interfaceC36351oYo, @NotNull KlineTimeToolType klineTimeToolType, @NotNull KlineTimeAnchorType klineTimeAnchorType, boolean z) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC36351oYo, "");
        Intrinsics.checkNotNullParameter(klineTimeToolType, "");
        Intrinsics.checkNotNullParameter(klineTimeAnchorType, "");
        this.copydefault = klineTimeAnchorType;
        this.OLrzqt = z;
        AEQbTJ(j, j2);
        if (klineTimeToolType == KlineTimeToolType.KLineJump && copydefault(c36250oUv, j)) {
            copydefault(c36250oUv, fragment, j, interfaceC36351oYo);
        } else {
            OLrzqt(c36250oUv, fragment, str, str2, OLrzqt(j, j2), str3, interfaceC36351oYo);
        }
    }

    public final void AEQbTJ(long j, long j2) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        c36246oUrCopydefault.iwGUEr().EZpvd(true);
        c36246oUrCopydefault.DbNXlk("NORMAL");
        c36246oUrCopydefault.zLjUOn().setFastKLineSelectAndStartTime(j, j2);
    }

    public final boolean copydefault(C36250oUv c36250oUv, long j) {
        com.okinc.kline.library.data.DataSource dataSource;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ = c36250oUv.ejfBZ();
        if (mapEjfBZ != null && (dataSource = mapEjfBZ.get(c36250oUv.fIwbmz())) != null) {
            long jValueOf = dataSource.valueOf();
            long jAYXKKw = dataSource.AYXKKw();
            if (jValueOf > 0 && jAYXKKw > 0 && (!c36250oUv.AkhnZx().isFastKLineMode() ? j >= jValueOf : !(jValueOf > j || j > jAYXKKw))) {
                return true;
            }
        }
        return false;
    }

    public final void copydefault(C36250oUv c36250oUv, androidx.fragment.app.Fragment fragment, long j, InterfaceC36351oYo interfaceC36351oYo) {
        OLrzqt(c36250oUv);
        AEQbTJ(c36250oUv, fragment, j, interfaceC36351oYo, true);
    }

    public final void OLrzqt(C36250oUv c36250oUv, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, InterfaceC36351oYo interfaceC36351oYo) {
        EZpvd(c36250oUv, interfaceC36351oYo);
        AEQbTJ(c36250oUv, fragment, str, str2, j, str3, interfaceC36351oYo);
    }

    public final void OLrzqt(C36250oUv c36250oUv) {
        c36250oUv.AkhnZx().setFastKLineMode(true);
        C36246oUr.copydefault().AhwBna(false);
        c36250oUv.invalidate();
    }

    public final void EZpvd(C36250oUv c36250oUv, InterfaceC36351oYo interfaceC36351oYo) {
        interfaceC36351oYo.AEQbTJ();
        interfaceC36351oYo.KWHzl();
        EZpvd(c36250oUv);
    }

    public final void EZpvd(C36250oUv c36250oUv) {
        com.okinc.kline.library.data.DataSource dataSource;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ = c36250oUv.ejfBZ();
        if (mapEjfBZ == null || (dataSource = mapEjfBZ.get(c36250oUv.fIwbmz())) == null) {
            return;
        }
        dataSource.KWHzl();
    }

    public final void AEQbTJ(final C36250oUv c36250oUv, final androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, final long j, java.lang.String str3, final InterfaceC36351oYo interfaceC36351oYo) {
        AEQbTJ(c36250oUv, str, str2);
        interfaceC36351oYo.EZpvd(fragment, str3, C33129mqd.gEmmrt(java.lang.Long.valueOf(((java.lang.Number) this.KWHzl.KWHzl(java.lang.Long.valueOf(j))).longValue())), oLT.djBIcL(), new Function1() { // from class: o.oYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36348oYl.AEQbTJ(this.EZpvd, c36250oUv, fragment, j, interfaceC36351oYo, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C36348oYl c36348oYl, C36250oUv c36250oUv, androidx.fragment.app.Fragment fragment, long j, InterfaceC36351oYo interfaceC36351oYo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c36348oYl.copydefault(c36250oUv, fragment, j, interfaceC36351oYo, str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C36250oUv c36250oUv, java.lang.String str, java.lang.String str2) {
        c36250oUv.setCurrentDataSource(str + str2 + JwtUtilsKt.JWT_DELIMITER + C36246oUr.copydefault().ODWQjV());
        c36250oUv.AkhnZx().setFastKLineMoveEnd(false);
        OLrzqt(c36250oUv);
    }

    public final void copydefault(C36250oUv c36250oUv, androidx.fragment.app.Fragment fragment, long j, InterfaceC36351oYo interfaceC36351oYo, java.lang.String str) {
        interfaceC36351oYo.EZpvd();
        if (str.length() > 0 && C33129mqd.AEQbTJ(str, 0)) {
            AEQbTJ(c36250oUv, fragment, j, interfaceC36351oYo, false);
            return;
        }
        c36250oUv.AkhnZx().setFastKLineMoveEnd(true);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            AEQbTJ(c36250oUv);
        } else {
            c36250oUv.AkhnZx().setFastKLineMode(false);
            EZpvd(fragment, interfaceC36351oYo);
        }
    }

    public final void AEQbTJ(C36250oUv c36250oUv, androidx.fragment.app.Fragment fragment, long j, InterfaceC36351oYo interfaceC36351oYo, boolean z) {
        kotlin.Pair<java.lang.Integer, java.lang.Float> pairAEQbTJ = AEQbTJ(j, z, this.copydefault);
        int iIntValue = pairAEQbTJ.getFirst().intValue();
        float fFloatValue = pairAEQbTJ.getSecond().floatValue();
        if (fFloatValue != 0.0f) {
            OLrzqt(c36250oUv, fragment, interfaceC36351oYo, iIntValue, fFloatValue);
        } else {
            c36250oUv.AkhnZx().setFastKLineMoveEnd(true);
            c36250oUv.AkhnZx().setFastKLineMode(false);
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Float> AEQbTJ(long j, boolean z, KlineTimeAnchorType klineTimeAnchorType) {
        return (kotlin.Pair) this.AEQbTJ.EZpvd((java.lang.Object) new C36353oYq.StateListAnimator(j, z, klineTimeAnchorType));
    }

    public final void OLrzqt(final C36250oUv c36250oUv, final androidx.fragment.app.Fragment fragment, final InterfaceC36351oYo interfaceC36351oYo, int i, final float f) {
        if (this.OLrzqt) {
            c36250oUv.AkhnZx().setFastKLineIndex(i);
        } else {
            c36250oUv.AkhnZx().clearFastKLineBean();
        }
        c36250oUv.post(new java.lang.Runnable() { // from class: o.oYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36348oYl.copydefault(fragment, this, c36250oUv, f, interfaceC36351oYo);
            }
        });
    }

    public static final void copydefault(androidx.fragment.app.Fragment fragment, C36348oYl c36348oYl, C36250oUv c36250oUv, float f, InterfaceC36351oYo interfaceC36351oYo) {
        if (!fragment.isAdded() || fragment.getView() == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineFastJumpManager$executeSmoothMoveAnimation$1$1(c36348oYl, c36250oUv, f, fragment, interfaceC36351oYo, null), 3, null);
    }

    public final java.lang.Object KWHzl(C36250oUv c36250oUv, float f, Continuation<? super Unit> continuation) {
        oWN own;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn = c36250oUv.zLjUOn();
        if (mapZLjUOn != null && (own = mapZLjUOn.get("ds0")) != null) {
            own.AhwBna(f);
        }
        c36250oUv.invalidate();
        c36250oUv.AkhnZx().setFastKLineMoveEnd(true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final C36250oUv c36250oUv, long j, @NotNull KlineTimeAnchorType klineTimeAnchorType, long j2, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(klineTimeAnchorType, "");
        final float fFloatValue = AEQbTJ(j, true, klineTimeAnchorType).getSecond().floatValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.oYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36348oYl.AEQbTJ(c36250oUv, fFloatValue, function02, function0);
            }
        };
        if (j2 > 0) {
            if (c36250oUv != null) {
                c36250oUv.postDelayed(runnable, j2);
                return;
            } else {
                if (function02 != null) {
                    function02.invoke();
                    return;
                }
                return;
            }
        }
        if (c36250oUv != null) {
            c36250oUv.post(runnable);
        } else if (function02 != null) {
            function02.invoke();
        }
    }

    public static final void AEQbTJ(C36250oUv c36250oUv, float f, Function0 function0, final Function0 function02) {
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        java.util.HashMap<java.lang.String, oWN> mapZLjUOn;
        com.okinc.kline.library.data.DataSource dataSource = null;
        oWN own = (c36250oUv == null || (mapZLjUOn = c36250oUv.zLjUOn()) == null) ? null : mapZLjUOn.get("ds0");
        if (c36250oUv != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null) {
            dataSource = mapEjfBZ.get(c36250oUv.fIwbmz());
        }
        if (own != null && dataSource != null) {
            Intrinsics.checkNotNullExpressionValue(dataSource.AEQbTJ, "");
            if (!r0.isEmpty()) {
                own.AhwBna(f);
                c36250oUv.invalidate();
                c36250oUv.post(new java.lang.Runnable() { // from class: o.oYr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36348oYl.copydefault(function02);
                    }
                });
                return;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void copydefault(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void EZpvd(androidx.fragment.app.Fragment fragment, InterfaceC36351oYo interfaceC36351oYo) {
        interfaceC36351oYo.OLrzqt(fragment, C36246oUr.copydefault().ODWQjV(), false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C36250oUv c36250oUv, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        KlineFastJumpManager$hidePositionLine$1 klineFastJumpManager$hidePositionLine$1;
        if (continuation instanceof KlineFastJumpManager$hidePositionLine$1) {
            klineFastJumpManager$hidePositionLine$1 = (KlineFastJumpManager$hidePositionLine$1) continuation;
            int i = klineFastJumpManager$hidePositionLine$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineFastJumpManager$hidePositionLine$1.label = i - Integer.MIN_VALUE;
            } else {
                klineFastJumpManager$hidePositionLine$1 = new KlineFastJumpManager$hidePositionLine$1(this, continuation);
            }
        }
        java.lang.Object obj = klineFastJumpManager$hidePositionLine$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineFastJumpManager$hidePositionLine$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            klineFastJumpManager$hidePositionLine$1.L$0 = c36250oUv;
            klineFastJumpManager$hidePositionLine$1.label = 1;
            if (DelayKt.delay(TooltipKt.TooltipDuration, klineFastJumpManager$hidePositionLine$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36250oUv = (C36250oUv) klineFastJumpManager$hidePositionLine$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c36250oUv.AkhnZx().clearFastKLineBean();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C36250oUv c36250oUv) {
        c36250oUv.setShowEmptyUi(true);
        c36250oUv.AkhnZx().setFastKLineMode(false);
        c36250oUv.invalidate();
    }
}
