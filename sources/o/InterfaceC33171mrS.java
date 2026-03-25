package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.core.ok_app.api.bean.TabBean;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33169mrQ;
import o.AbstractC33173mrU;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mrS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33171mrS extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.app.Activity activity, int i, @NotNull AbstractC33169mrQ abstractC33169mrQ, @NotNull AbstractC33173mrU abstractC33173mrU, Function1<? super java.lang.Integer, Unit> function1);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull LiteNavigationTabEnum liteNavigationTabEnum);

    boolean AEQbTJ(@NotNull android.app.Activity activity, boolean z, boolean z2, boolean z3);

    boolean AuCTel();

    boolean EZpvd(@NotNull android.app.Activity activity, boolean z, boolean z2, boolean z3);

    void KWHzl(Function1<? super java.util.List<TabBean>, Unit> function1);

    boolean KWHzl(@NotNull android.app.Activity activity, boolean z, boolean z2, boolean z3, android.os.Bundle bundle);

    boolean KWHzl(@NotNull android.content.Context context, int i, boolean z, int i2, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    boolean KWHzl(@NotNull android.content.Context context, boolean z, boolean z2, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    boolean KWHzl(@NotNull AbstractC33244msm abstractC33244msm);

    java.lang.Object OLrzqt(@NotNull AbstractC33244msm abstractC33244msm, @NotNull android.content.Context context, boolean z, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation);

    InterfaceC33213msH OLrzqt(@NotNull InterfaceC33213msH interfaceC33213msH);

    void OLrzqt(@NotNull android.app.Activity activity, int i, @NotNull AbstractC33169mrQ abstractC33169mrQ, @NotNull java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, Function1<? super java.lang.Integer, Unit> function1);

    android.view.View copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2);

    boolean copydefault(int i);

    boolean copydefault(@NotNull android.content.Context context, boolean z, int i, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    boolean ejfBZ();

    boolean fARcdN();

    boolean fIwbmz();

    boolean fJNWhG();

    boolean getFieldNames();

    StateFlow<java.lang.Integer> isConnected();

    boolean iwGUEr();

    void uzCIH();

    boolean valueOf();

    StateFlow<AbstractC33244msm> values();

    /* JADX INFO: renamed from: o.mrS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean switchToAppMode$default(InterfaceC33171mrS interfaceC33171mrS, android.content.Context context, int i, boolean z, int i2, android.os.Bundle bundle, Function1 function1, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToAppMode");
            }
            if ((i3 & 8) != 0) {
                i2 = 0;
            }
            int i4 = i2;
            if ((i3 & 16) != 0) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = bundle;
            if ((i3 & 32) != 0) {
                function1 = new Function1() { // from class: o.mrY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC33171mrS.Activity.EZpvd(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
            }
            return interfaceC33171mrS.KWHzl(context, i, z, i4, bundle2, function1);
        }

        public static Unit EZpvd(boolean z) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ java.lang.Object switchSubMode$default(InterfaceC33171mrS interfaceC33171mrS, AbstractC33244msm abstractC33244msm, android.content.Context context, boolean z, android.os.Bundle bundle, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchSubMode");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                bundle = null;
            }
            return interfaceC33171mrS.OLrzqt(abstractC33244msm, context, z2, bundle, continuation);
        }

        public static Unit EZpvd(int i, int i2) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.view.View getAppModeSwitchView$default(InterfaceC33171mrS interfaceC33171mrS, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, AppModeSwitchViewSource appModeSwitchViewSource, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppModeSwitchView");
            }
            if ((i & 16) != 0) {
                function2 = new Function2() { // from class: o.mrX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return InterfaceC33171mrS.Activity.EZpvd(((java.lang.Integer) obj2).intValue(), ((java.lang.Integer) obj3).intValue());
                    }
                };
            }
            return interfaceC33171mrS.copydefault(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, (Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit>) function2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getTabList$default(InterfaceC33171mrS interfaceC33171mrS, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTabList");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            interfaceC33171mrS.KWHzl((Function1<? super java.util.List<TabBean>, Unit>) function1);
        }

        public static /* synthetic */ boolean enterOKXLite$default(InterfaceC33171mrS interfaceC33171mrS, android.app.Activity activity, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterOKXLite");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            return interfaceC33171mrS.AEQbTJ(activity, z, z2, z3);
        }

        public static /* synthetic */ boolean fromLiteToPro$default(InterfaceC33171mrS interfaceC33171mrS, android.app.Activity activity, boolean z, boolean z2, boolean z3, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromLiteToPro");
            }
            boolean z4 = (i & 2) != 0 ? true : z;
            boolean z5 = (i & 4) != 0 ? true : z2;
            boolean z6 = (i & 8) != 0 ? true : z3;
            if ((i & 16) != 0) {
                bundle = null;
            }
            return interfaceC33171mrS.KWHzl(activity, z4, z5, z6, bundle);
        }

        public static /* synthetic */ boolean fromLiteToMetaX$default(InterfaceC33171mrS interfaceC33171mrS, android.app.Activity activity, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromLiteToMetaX");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            return interfaceC33171mrS.EZpvd(activity, z, z2, z3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showAnim$default(InterfaceC33171mrS interfaceC33171mrS, android.app.Activity activity, int i, AbstractC33169mrQ abstractC33169mrQ, AbstractC33173mrU abstractC33173mrU, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAnim");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if ((i2 & 4) != 0) {
                int i3 = 0;
                abstractC33169mrQ = new AbstractC33169mrQ.TaskDescription(i3, i3, 3, defaultConstructorMarker);
            }
            AbstractC33169mrQ abstractC33169mrQ2 = abstractC33169mrQ;
            if ((i2 & 8) != 0) {
                abstractC33173mrU = AbstractC33173mrU.StateListAnimator.copydefault;
            }
            interfaceC33171mrS.AEQbTJ(activity, i, abstractC33169mrQ2, abstractC33173mrU, (i2 & 16) != 0 ? null : function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean autoSwitchMode$default(InterfaceC33171mrS interfaceC33171mrS, android.content.Context context, boolean z, boolean z2, android.os.Bundle bundle, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoSwitchMode");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            if ((i & 8) != 0) {
                bundle = null;
            }
            android.os.Bundle bundle2 = bundle;
            if ((i & 16) != 0) {
                function1 = new Function1() { // from class: o.mrW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC33171mrS.Activity.copydefault(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
            }
            return interfaceC33171mrS.KWHzl(context, z, z3, bundle2, (Function1<? super java.lang.Boolean, Unit>) function1);
        }

        public static Unit copydefault(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean switchToCeFi$default(InterfaceC33171mrS interfaceC33171mrS, android.content.Context context, boolean z, int i, android.os.Bundle bundle, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToCeFi");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = bundle;
            if ((i2 & 16) != 0) {
                function1 = new Function1() { // from class: o.mrZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC33171mrS.Activity.AYXKKw(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
            }
            return interfaceC33171mrS.copydefault(context, z, i3, bundle2, (Function1<? super java.lang.Boolean, Unit>) function1);
        }

        public static Unit AYXKKw(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.mrS */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showAnimationToMode$default(InterfaceC33171mrS interfaceC33171mrS, android.app.Activity activity, int i, AbstractC33169mrQ abstractC33169mrQ, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, Function1 function1, int i2, java.lang.Object obj) {
            AbstractC33169mrQ taskDescription;
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAnimationToMode");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if ((i2 & 4) != 0) {
                int i3 = 0;
                taskDescription = new AbstractC33169mrQ.TaskDescription(i3, i3, 3, defaultConstructorMarker);
            } else {
                taskDescription = abstractC33169mrQ;
            }
            interfaceC33171mrS.OLrzqt(activity, i, taskDescription, charSequence, (i2 & 16) != 0 ? null : charSequence2, (i2 & 32) != 0 ? null : function1);
        }
    }
}
