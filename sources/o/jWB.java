package o;

import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.gKO;
import o.jWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class jWB {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public int KWHzl = 1;
    public int EZpvd = 1;
    public final java.lang.String AEQbTJ = "SecurityVerifyLockScreenActivity";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    @yCM
    public jWB() {
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jWB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void copydefault(@NotNull java.util.List<HoldingAsset> list, WeakReference<android.widget.TextView> weakReference, WeakReference<android.view.View> weakReference2, WeakReference<android.widget.ImageView> weakReference3, WeakReference<android.widget.ImageView> weakReference4) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.view.View view;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(list, "");
        int iMax = java.lang.Math.max(1, (int) java.lang.Math.ceil(((double) list.size()) / ((double) 4)));
        this.EZpvd = iMax;
        if (this.KWHzl > iMax) {
            this.KWHzl = iMax;
        }
        if (weakReference != null && (textView = weakReference.get()) != null) {
            textView.setText(this.KWHzl + "/" + this.EZpvd);
        }
        boolean z = this.EZpvd > 1;
        if (weakReference2 != null && (view = weakReference2.get()) != null) {
            view.setVisibility(z ? 0 : 8);
        }
        if (z) {
            android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.dUDNAs));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
            android.content.res.ColorStateList colorStateListValueOf2 = android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.spnCvw));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "");
            if (weakReference3 != null && (imageView2 = weakReference3.get()) != null) {
                imageView2.setImageTintList(this.KWHzl > 1 ? colorStateListValueOf2 : colorStateListValueOf);
                imageView2.setEnabled(this.KWHzl > 1);
            }
            if (weakReference4 == null || (imageView = weakReference4.get()) == null) {
                return;
            }
            if (this.KWHzl < this.EZpvd) {
                colorStateListValueOf = colorStateListValueOf2;
            }
            imageView.setImageTintList(colorStateListValueOf);
            imageView.setEnabled(this.KWHzl < this.EZpvd);
        }
    }

    public final java.util.List<HoldingAsset> OLrzqt(@NotNull java.util.List<HoldingAsset> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        int i = (this.KWHzl - 1) * 4;
        int iMin = java.lang.Math.min(i + 4, list.size());
        if (i < list.size()) {
            return list.subList(i, iMin);
        }
        return yDY.AhwBna();
    }

    public final void AEQbTJ(int i) {
        this.KWHzl = java.lang.Math.max(1, java.lang.Math.min(i, this.EZpvd));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull HoldingAsset holdingAsset, @NotNull java.lang.String str, @NotNull android.content.Intent intent) {
        android.app.Activity activityAEQbTJ;
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(intent, "");
        if (C32986mnt.EZpvd.valueOf()) {
            C54819xWm c54819xWmKWHzl = C54819xWm.KWHzl();
            if (c54819xWmKWHzl == null || (activityAEQbTJ = c54819xWmKWHzl.AEQbTJ()) == 0) {
                return;
            }
            java.lang.String simpleName = activityAEQbTJ.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) this.AEQbTJ, false, 2, (java.lang.Object) null)) {
                return;
            }
            if (activityAEQbTJ instanceof FragmentActivity) {
                DexFloatWindowManager.copydefault.KWHzl(DexFloatWindowManager.DexFloatWindowMode.MEDIUM);
                gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
                androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) activityAEQbTJ).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                gKO.StateListAnimator.openMemeQuickTransaction$default(gko, supportFragmentManager, "default_trade", new TokenBase(holdingAsset.OLrzqt(), holdingAsset.fetchVPNInfo(), holdingAsset.isConnected(), null, null, holdingAsset.AkhnZx(), null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -40, null), TransactionType.Sell.getType(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                return;
            }
            gKO.StateListAnimator.goToDexTrade$default((gKO) C43251rlk.copydefault(gKO.class), activityAEQbTJ, (LifecycleOwner) activityAEQbTJ, new TradeParam(str, "inner_trade", new CoinInfo(holdingAsset.OLrzqt(), holdingAsset.fetchVPNInfo(), false, (java.lang.String) null, 12, (DefaultConstructorMarker) null), new CoinInfo(holdingAsset.OLrzqt(), holdingAsset.djBIcL(), false, (java.lang.String) null, 12, (DefaultConstructorMarker) null), holdingAsset.values(), (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Boolean) null, false, "floating_window", 0, (java.lang.String) null, 14304, (DefaultConstructorMarker) null), "Float-window", new Function1() { // from class: o.jWz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jWB.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            }, 0, new Function1() { // from class: o.jWA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jWB.EZpvd((gKW) obj);
                }
            }, 32, null);
            return;
        }
        copydefault(intent, 777);
    }

    public static final Unit AEQbTJ(boolean z) {
        DexFloatWindowManager.copydefault.KWHzl(DexFloatWindowManager.DexFloatWindowMode.MEDIUM);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(gKW gkw) {
        Intrinsics.checkNotNullParameter(gkw, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull android.content.Intent intent, @NotNull java.lang.String str, int i) {
        android.app.Activity activityAEQbTJ;
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C32986mnt.EZpvd.valueOf()) {
            C54819xWm c54819xWmKWHzl = C54819xWm.KWHzl();
            if (c54819xWmKWHzl == null || (activityAEQbTJ = c54819xWmKWHzl.AEQbTJ()) == null || StringsKt__StringsKt.contains$default((java.lang.CharSequence) activityAEQbTJ.getClass().getSimpleName(), (java.lang.CharSequence) this.AEQbTJ, false, 2, (java.lang.Object) null)) {
                return;
            }
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activityAEQbTJ, str, null, new Function1() { // from class: o.jWx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jWB.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
            return;
        }
        copydefault(intent, i);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        DexFloatWindowManager dexFloatWindowManager = DexFloatWindowManager.copydefault;
        DexFloatWindowManager.DexFloatWindowMode dexFloatWindowModeIsConnected = dexFloatWindowManager.isConnected();
        DexFloatWindowManager.DexFloatWindowMode dexFloatWindowMode = DexFloatWindowManager.DexFloatWindowMode.MEDIUM;
        if (dexFloatWindowModeIsConnected != dexFloatWindowMode) {
            dexFloatWindowManager.KWHzl(dexFloatWindowMode);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(android.content.Intent intent, int i) {
        if (C32986mnt.EZpvd.valueOf()) {
            intent.addFlags(67108864);
        }
        int i2 = Build.VERSION.SDK_INT;
        try {
            android.app.PendingIntent.getActivity(C32979mnm.EZpvd.OLrzqt(), i, intent, i2 >= 34 ? 184549376 : i2 >= 31 ? 167772160 : 134217728).send();
        } catch (java.lang.Exception unused) {
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            intent.addFlags(268435456);
            applicationOLrzqt.startActivity(intent);
        }
        DexFloatWindowManager.copydefault.KWHzl(DexFloatWindowManager.DexFloatWindowMode.MEDIUM);
    }

    public final void EZpvd(@NotNull C26213jWc c26213jWc, @NotNull android.view.View view, @NotNull jWL.Activity activity, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function1<? super HoldingAsset, Unit> function1) {
        jWN jwnOLrzqt;
        Intrinsics.checkNotNullParameter(c26213jWc, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function1, "");
        WeakReference<android.widget.ImageView> weakReferenceAkhnZx = activity.AkhnZx();
        if (C26231jWu.copydefault(c26213jWc, weakReferenceAkhnZx != null ? weakReferenceAkhnZx.get() : null)) {
            function0.invoke();
            return;
        }
        WeakReference<android.widget.ImageView> weakReferenceFetchVPNInfo = activity.fetchVPNInfo();
        if (C26231jWu.copydefault(c26213jWc, weakReferenceFetchVPNInfo != null ? weakReferenceFetchVPNInfo.get() : null)) {
            function02.invoke();
            return;
        }
        WeakReference<android.widget.TextView> weakReferenceValues = activity.values();
        if (C26231jWu.copydefault(c26213jWc, weakReferenceValues != null ? weakReferenceValues.get() : null)) {
            function03.invoke();
            return;
        }
        int iCopydefault = C26231jWu.copydefault(c26213jWc, C26231jWu.OLrzqt(view));
        if (iCopydefault < 0 || (jwnOLrzqt = activity.OLrzqt()) == null || iCopydefault >= jwnOLrzqt.getCurrentList().size()) {
            return;
        }
        java.util.List<HoldingAsset> currentList = jwnOLrzqt.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        HoldingAsset holdingAsset = (HoldingAsset) CollectionsKt___CollectionsKt.AkhnZx(currentList, iCopydefault);
        if (holdingAsset != null) {
            function1.invoke(holdingAsset);
        }
    }
}
