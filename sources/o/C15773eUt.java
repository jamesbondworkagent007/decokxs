package o;

import androidx.activity.result.ActivityResultCallback;
import com.okinc.business.defi.wallet.home.DefiAddCryptoBottomSheetFragment;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C12827cuN;
import o.C13754dXa;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eUt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C15773eUt {
    public static final C15773eUt OLrzqt = new C15773eUt();

    /* JADX INFO: renamed from: o.eUt$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DefiAddCryptoBottomSheetFragment.ButtonType.values().length];
            try {
                iArr[DefiAddCryptoBottomSheetFragment.ButtonType.FROM_EXCHANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DefiAddCryptoBottomSheetFragment.ButtonType.ON_CHAIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.eUt$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    public static final void AEQbTJ(java.lang.Integer num) {
    }

    public static final void copydefault(java.lang.Integer num) {
    }

    private C15773eUt() {
    }

    public final void AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super WalletRechargeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        DefiAddCryptoBottomSheetFragment defiAddCryptoBottomSheetFragmentCopydefault = DefiAddCryptoBottomSheetFragment.Companion.copydefault();
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        defiAddCryptoBottomSheetFragmentCopydefault.KWHzl(supportFragmentManager, "DefiAddCryptoBottomSheetFragment", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.eUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
            public final void copydefault(android.os.Bundle bundle) {
                C15773eUt.OLrzqt(abstractActivityC33041mov, bundle);
            }
        });
    }

    public static final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, android.os.Bundle bundle) {
        java.lang.String string;
        DefiAddCryptoBottomSheetFragment.ButtonType buttonTypeValueOf;
        if (bundle == null || (string = bundle.getString("button_type")) == null || (buttonTypeValueOf = DefiAddCryptoBottomSheetFragment.ButtonType.valueOf(string)) == null) {
            return;
        }
        int i = Activity.AEQbTJ[buttonTypeValueOf.ordinal()];
        if (i == 1) {
            OLrzqt.EZpvd(abstractActivityC33041mov);
        } else {
            if (i != 2) {
                return;
            }
            OLrzqt.AEQbTJ(abstractActivityC33041mov);
        }
    }

    public final void AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov) {
        yBI.subscribeBy$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1) null, new Function1() { // from class: o.eUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15773eUt.EZpvd(abstractActivityC33041mov, (AbstractC12782ctV) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.zLjUOn()) {
            C55326xho.toast$default(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HJWChPdIKEqB), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
        } else if (abstractC12782ctV.zsXlph()) {
            OLrzqt.OLrzqt(abstractActivityC33041mov);
        } else {
            OLrzqt.KWHzl(abstractActivityC33041mov, abstractC12782ctV, C21027grx.copydefault.copydefault());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, boolean z) {
        C20690gle.OLrzqt.EZpvd((10 & 1) != 0 ? null : null, (10 & 2) != 0 ? null : abstractActivityC33041mov, abstractC12782ctV.DbNXlk(), (10 & 8) != 0 ? null : null, (10 & 16) != 0 ? false : z, "", (10 & 64) != 0 ? null : new Function1() { // from class: o.eUw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15773eUt.AEQbTJ(abstractActivityC33041mov, abstractC12782ctV, (android.os.Bundle) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV, android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("is_first_time_use", false)) {
            OLrzqt.KWHzl(abstractActivityC33041mov, abstractC12782ctV, false);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov) {
        yBI.subscribeBy$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), (Function1) null, new Function1() { // from class: o.eUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15773eUt.KWHzl(abstractActivityC33041mov, (AbstractC12782ctV) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.zLjUOn()) {
            C55326xho.toast$default(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HJWChPdIKEqB), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
        } else if (abstractC12782ctV.zsXlph()) {
            OLrzqt.OLrzqt(abstractActivityC33041mov);
        } else {
            OLrzqt.copydefault(abstractActivityC33041mov, abstractC12782ctV, C21027grx.copydefault.copydefault());
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, final boolean z) {
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c21027grx.KWHzl(supportFragmentManager, abstractC12782ctV.QfsBiF(), new Function1() { // from class: o.eUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15773eUt.KWHzl(abstractActivityC33041mov, abstractC12782ctV, z, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, boolean z, int i) {
        if (dZP.OLrzqt.valueOf()) {
            C21027grx c21027grx = C21027grx.copydefault;
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c21027grx.EZpvd(supportFragmentManager, abstractActivityC33041mov, abstractActivityC33041mov.getActivityResultRegistry().register("bb", new C21118gti(), new ActivityResultCallback() { // from class: o.eUv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    C15773eUt.copydefault((java.lang.Integer) obj);
                }
            }), abstractC12782ctV.DbNXlk(), true, z);
        } else {
            InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
            if (interfaceC8106awV != null) {
                if (z) {
                    abstractActivityC33041mov.getActivityResultRegistry().register("aa", interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.eUr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.activity.result.ActivityResultCallback
                        public final void onActivityResult(java.lang.Object obj) {
                            C15773eUt.AEQbTJ(abstractActivityC33041mov, abstractC12782ctV, (java.lang.Boolean) obj);
                        }
                    }).launch(abstractActivityC33041mov);
                } else {
                    abstractActivityC33041mov.getActivityResultRegistry().register("aa", interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.eUz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.activity.result.ActivityResultCallback
                        public final void onActivityResult(java.lang.Object obj) {
                            C15773eUt.copydefault(abstractActivityC33041mov, abstractC12782ctV, (java.lang.Boolean) obj);
                        }
                    }).launch(abstractActivityC33041mov);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            OLrzqt.AEQbTJ(abstractActivityC33041mov, true, abstractC12782ctV);
        }
    }

    public static final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            OLrzqt.AEQbTJ(abstractActivityC33041mov, false, abstractC12782ctV);
        }
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov) {
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        Intrinsics.copydefault(supportFragmentManager);
        instance$default.EZpvd(supportFragmentManager, new StateListAnimator(), 1);
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, boolean z, AbstractC12782ctV abstractC12782ctV) {
        C21027grx c21027grx = C21027grx.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c21027grx.EZpvd(supportFragmentManager, abstractActivityC33041mov, abstractActivityC33041mov.getActivityResultRegistry().register("bb", new C21118gti(), new ActivityResultCallback() { // from class: o.eUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C15773eUt.AEQbTJ((java.lang.Integer) obj);
            }
        }), abstractC12782ctV.DbNXlk(), true, z);
    }
}
