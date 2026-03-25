package o;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C20690gle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20690gle {
    public static boolean KWHzl;
    public static final C20690gle OLrzqt = new C20690gle();
    public static final java.util.Comparator<C10525bqB> gEmmrt = new java.util.Comparator() { // from class: o.gln
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return C20690gle.copydefault((C10525bqB) obj, (C10525bqB) obj2);
        }
    };
    public static java.util.Map<java.lang.Class<?>, Triple<java.util.Set<java.lang.String>, ViewModelStore, ViewModelProvider>> copydefault = new LinkedHashMap();
    public static java.util.Map<java.lang.Class<?>, Triple<java.util.Set<java.lang.String>, ViewModelStore, ViewModelProvider>> AEQbTJ = new LinkedHashMap();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Comparator<C10525bqB> KWHzl() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        KWHzl = z;
    }

    private C20690gle() {
    }

    public static final int copydefault(C10525bqB c10525bqB, C10525bqB c10525bqB2) {
        boolean z = c10525bqB.KWHzl().fetchVPNInfo() == 196;
        boolean z2 = c10525bqB2.KWHzl().fetchVPNInfo() == 196;
        if (!z || z2) {
            return (z || !z2) ? 0 : 1;
        }
        return -1;
    }

    public final void KWHzl(final androidx.fragment.app.Fragment fragment, final FragmentActivity fragmentActivity, @NotNull final java.lang.String str, final java.lang.Long l, @NotNull final java.lang.String str2, final TransactionInfo transactionInfo, final boolean z, final Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function12 = new Function1() { // from class: o.gli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20690gle.AEQbTJ(fragment, fragmentActivity, l, str, transactionInfo, z, str2, function1, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.glg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20690gle.EZpvd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.glm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20690gle.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.glj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20690gle.KWHzl(function13, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gFI.StateListAnimator.getStartIntent$default(o.gFI$StateListAnimator, android.content.Context, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.scan.TransactionInfo, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.tx.TransactionType, java.lang.String, int, java.lang.Object):android.content.Intent */
    /* JADX DEBUG: Class process forced to load method for inline: o.giV.Application.getStartIntent$default(o.giV$Application, android.content.Context, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.scan.TransactionInfo, boolean, java.util.ArrayList, java.lang.Integer, int, java.lang.Object):android.content.Intent */
    /* JADX DEBUG: Class process forced to load method for inline: o.gjc.Application.getStartIntent$default(o.gjc$Application, android.content.Context, long, long, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, com.okinc.business.defi.biz.core.scan.TransactionInfo, int, java.lang.Object):android.content.Intent */
    public static final Unit AEQbTJ(androidx.fragment.app.Fragment fragment, FragmentActivity fragmentActivity, java.lang.Long l, java.lang.String str, TransactionInfo transactionInfo, boolean z, java.lang.String str2, final Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        android.content.Intent intentEZpvd;
        kotlin.Pair<android.content.Context, androidx.fragment.app.FragmentManager> pairEZpvd = OLrzqt.EZpvd(fragment, fragmentActivity);
        if (pairEZpvd == null) {
            return Unit.INSTANCE;
        }
        android.content.Context contextComponent1 = pairEZpvd.component1();
        androidx.fragment.app.FragmentManager fragmentManagerComponent2 = pairEZpvd.component2();
        if (l == null || l.longValue() == -1) {
            C9694baS.Companion.KWHzl(fragmentManagerComponent2, ActivityC20522giV.Companion.KWHzl(contextComponent1, "from_send", str, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : transactionInfo, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null), new Function2() { // from class: o.glk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C20690gle.gEmmrt(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        } else {
            if (!z || !abstractC12782ctV.DGOPHZ()) {
                intentEZpvd = gFI.Companion.EZpvd(contextComponent1, str, java.lang.String.valueOf(l), transactionInfo, "from_coin_detail", (96 & 32) != 0 ? "" : null, (96 & 64) != 0 ? null : null, str2);
            } else {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l);
                C9694baS.Companion.KWHzl(fragmentManagerComponent2, ActivityC20582gjc.Companion.AEQbTJ(contextComponent1, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 1L, l.longValue(), str, "from_send", false, (256 & 64) != 0 ? "" : str2, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? false : false, (256 & 512) != 0 ? null : transactionInfo), new Function2() { // from class: o.glr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C20690gle.valueOf(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                    }
                });
                intentEZpvd = null;
            }
            if (intentEZpvd != null) {
                C9694baS.Companion.KWHzl(fragmentManagerComponent2, intentEZpvd, new Function2() { // from class: o.glq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C20690gle.AhwBna(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(Function1 function1, int i, android.content.Intent intent) {
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(Function1 function1, int i, android.content.Intent intent) {
        if (i == -1 && function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(Function1 function1, int i, android.content.Intent intent) {
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(final androidx.fragment.app.Fragment fragment, FragmentActivity fragmentActivity, @NotNull java.lang.String str, int i, final Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.Pair<android.content.Context, androidx.fragment.app.FragmentManager> pairEZpvd = EZpvd(fragment, fragmentActivity);
        if (pairEZpvd == null) {
            return;
        }
        android.content.Context contextComponent1 = pairEZpvd.component1();
        C9694baS.Companion.KWHzl(pairEZpvd.component2(), ActivityC20522giV.Companion.KWHzl(contextComponent1, "from_send", str, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : yDY.copydefault(-2000L, 607L), (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : java.lang.Integer.valueOf(i)), new Function2() { // from class: o.gll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20690gle.EZpvd(function1, fragment, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, androidx.fragment.app.Fragment fragment, int i, android.content.Intent intent) {
        FragmentActivity activity;
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        if (i == -1 && fragment != null && (activity = fragment.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(androidx.fragment.app.Fragment fragment, FragmentActivity fragmentActivity, @NotNull java.lang.String str, java.lang.Long l, boolean z, @NotNull java.lang.String str2, final Function1<? super android.os.Bundle, Unit> function1) {
        android.content.Intent intentKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        kotlin.Pair<android.content.Context, androidx.fragment.app.FragmentManager> pairEZpvd = EZpvd(fragment, fragmentActivity);
        if (pairEZpvd == null) {
            return;
        }
        android.content.Context contextComponent1 = pairEZpvd.component1();
        androidx.fragment.app.FragmentManager fragmentManagerComponent2 = pairEZpvd.component2();
        if (l == null || l.longValue() == -1) {
            intentKWHzl = ActivityC20522giV.Companion.KWHzl(contextComponent1, "from_receive", str, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : z, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
        } else {
            intentKWHzl = ActivityC20997grT.Companion.AEQbTJ(contextComponent1, str, l.toString(), z, str2);
        }
        C9694baS.Companion.KWHzl(fragmentManagerComponent2, intentKWHzl, new Function2() { // from class: o.glh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20690gle.EZpvd(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, int i, android.content.Intent intent) {
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object, kotlin.Triple] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends ViewModel> T AEQbTJ(@NotNull final ComponentActivity componentActivity, @NotNull final java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(cls, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = copydefault.get(cls);
        objectRef.element = r1;
        if (r1 == 0) {
            ViewModelStore viewModelStore = new ViewModelStore();
            ?? triple = new Triple(new LinkedHashSet(), viewModelStore, new ViewModelProvider(viewModelStore, new ViewModelProvider.NewInstanceFactory(), null, 4, null));
            objectRef.element = triple;
            copydefault.put((java.lang.Class<?>) cls, (Triple<java.util.Set<java.lang.String>, ViewModelStore, ViewModelProvider>) triple);
        }
        ((java.util.Set) ((Triple) objectRef.element).getFirst()).add(componentActivity.getClass().getSimpleName());
        componentActivity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transfer.TransferUtils$getTransferViewModel$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                Intrinsics.checkNotNullParameter(event, "");
                if (event != Lifecycle.Event.ON_DESTROY || componentActivity.isChangingConfigurations()) {
                    return;
                }
                objectRef.element.getFirst().remove(componentActivity.getClass().getSimpleName());
                if (objectRef.element.getFirst().isEmpty()) {
                    objectRef.element.getSecond().clear();
                    C20690gle.copydefault.remove(cls);
                }
            }
        });
        return (T) ((ViewModelProvider) ((Triple) objectRef.element).getThird()).get(cls);
    }

    public static /* synthetic */ ViewModel getOKTransferViewModel$default(C20690gle c20690gle, ComponentActivity componentActivity, java.lang.Class cls, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c20690gle.EZpvd(componentActivity, cls, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object, kotlin.Triple] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T extends ViewModel> T EZpvd(@NotNull final ComponentActivity componentActivity, @NotNull final java.lang.Class<T> cls, boolean z) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(cls, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r1 = AEQbTJ.get(cls);
        objectRef.element = r1;
        if (z && r1 != 0) {
            ((ViewModelStore) ((Triple) r1).getSecond()).clear();
            AEQbTJ.remove(cls);
            objectRef.element = null;
        }
        if (objectRef.element == 0) {
            ViewModelStore viewModelStore = new ViewModelStore();
            ?? triple = new Triple(new LinkedHashSet(), viewModelStore, new ViewModelProvider(viewModelStore, new ViewModelProvider.NewInstanceFactory(), null, 4, null));
            objectRef.element = triple;
            AEQbTJ.put((java.lang.Class<?>) cls, (Triple<java.util.Set<java.lang.String>, ViewModelStore, ViewModelProvider>) triple);
        }
        ((java.util.Set) ((Triple) objectRef.element).getFirst()).add(componentActivity.getClass().getSimpleName());
        componentActivity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transfer.TransferUtils$getOKTransferViewModel$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                Intrinsics.checkNotNullParameter(event, "");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    objectRef.element.getFirst().remove(componentActivity.getClass().getSimpleName());
                    if (objectRef.element.getFirst().isEmpty()) {
                        objectRef.element.getSecond().clear();
                        C20690gle.AEQbTJ.remove(cls);
                    }
                }
            }
        });
        return (T) ((ViewModelProvider) ((Triple) objectRef.element).getThird()).get(cls);
    }

    public static /* synthetic */ kotlin.Pair getContextAndFragmentManager$default(C20690gle c20690gle, androidx.fragment.app.Fragment fragment, FragmentActivity fragmentActivity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fragment = null;
        }
        if ((i & 2) != 0) {
            fragmentActivity = null;
        }
        return c20690gle.EZpvd(fragment, fragmentActivity);
    }

    public final kotlin.Pair<android.content.Context, androidx.fragment.app.FragmentManager> EZpvd(androidx.fragment.app.Fragment fragment, FragmentActivity fragmentActivity) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.Object obj;
        if (fragment != null) {
            android.content.Context context = fragment.getContext();
            if (context == null) {
                return null;
            }
            supportFragmentManager = fragment.getChildFragmentManager();
            obj = context;
        } else {
            if (fragmentActivity == null) {
                return null;
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            obj = fragmentActivity;
        }
        return new kotlin.Pair<>(obj, supportFragmentManager);
    }
}
