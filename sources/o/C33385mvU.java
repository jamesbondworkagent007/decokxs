package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.core.ok_app.modeswitch.liteSubMode.SubModeChipView$createChip$2;
import com.okinc.core.ok_app.modeswitch.liteSubMode.SubModeChipView$popupAppSubModeChangeDialog$1$1;
import com.okinc.core.ok_app.modeswitch.liteSubMode.SubModeChipView$popupLiteSubModeChangeDialog$1$1;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33385mvU {
    public static final C33385mvU copydefault = new C33385mvU();

    private C33385mvU() {
    }

    public final android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        WeakReference weakReference = new WeakReference(fragmentManager);
        pUU.EZpvd("ModeSwitch", "createChip: source=" + str);
        final C33299mto c33299mtoOLrzqt = C33299mto.OLrzqt(android.view.LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(c33299mtoOLrzqt, "");
        ConstraintLayout constraintLayout = c33299mtoOLrzqt.KWHzl;
        constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, weakReference, str, lifecycleOwner, function2));
        C33367mvC.KWHzl(lifecycleOwner, new SubModeChipView$createChip$2(c33299mtoOLrzqt, null));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.core.ok_app.modeswitch.liteSubMode.SubModeChipView$createChip$3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner2) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                super.onDestroy(lifecycleOwner2);
                pUU.EZpvd("ModeSwitch", "onDestroy: remove observers");
                c33299mtoOLrzqt.KWHzl.setOnClickListener(null);
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
        });
        ConstraintLayout root = c33299mtoOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX INFO: renamed from: o.mvU$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function2 AEQbTJ;
        public final /* synthetic */ WeakReference EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ LifecycleOwner OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ long djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, WeakReference weakReference, java.lang.String str, LifecycleOwner lifecycleOwner, Function2 function2) {
            this.KWHzl = view;
            this.djBIcL = j;
            this.EZpvd = weakReference;
            this.copydefault = str;
            this.OLrzqt = lifecycleOwner;
            this.AEQbTJ = function2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [197=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.djBIcL || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) this.EZpvd.get();
                if (fragmentManager == null) {
                    pUU.valueOf("ModeSwitch", "createChip: FragmentManager is null, cannot show dialog");
                    return;
                }
                pUU.KWHzl("ModeSwitch", "createChip: Chip clicked, source=" + this.copydefault);
                C33405mvo.KWHzl.AEQbTJ(C33367mvC.valueOf() ? ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue().KWHzl() : ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue().AEQbTJ(), this.copydefault);
                java.lang.String str = this.copydefault;
                switch (str.hashCode()) {
                    case -695753474:
                        if (str.equals("Web3Home")) {
                            if (!C33367mvC.valueOf()) {
                                C33385mvU.copydefault.EZpvd(this.OLrzqt, ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue(), fragmentManager, ModeSwitchSourceEnum.LiteHome, this.AEQbTJ);
                            } else {
                                C33385mvU.copydefault.AEQbTJ(this.OLrzqt, ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue(), fragmentManager, ModeSwitchSourceEnum.WEB3, this.AEQbTJ);
                            }
                            break;
                        }
                        break;
                    case 876879239:
                        if (str.equals("PayHome")) {
                            if (!C33367mvC.copydefault()) {
                                C33385mvU.copydefault.AEQbTJ(this.OLrzqt, ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue(), fragmentManager, ModeSwitchSourceEnum.ProPayHome, this.AEQbTJ);
                            } else {
                                C33385mvU.copydefault.EZpvd(this.OLrzqt, ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue(), fragmentManager, ModeSwitchSourceEnum.LitePayHome, this.AEQbTJ);
                            }
                            break;
                        }
                        break;
                    case 1424717517:
                        if (str.equals("LiteHome")) {
                            C33385mvU.copydefault.EZpvd(this.OLrzqt, ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl().getValue(), fragmentManager, ModeSwitchSourceEnum.LiteHome, this.AEQbTJ);
                            break;
                        }
                        break;
                    case 1593672130:
                        if (str.equals("ExchangeHome")) {
                            C33385mvU.copydefault.AEQbTJ(this.OLrzqt, ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt().getValue(), fragmentManager, ModeSwitchSourceEnum.ProExchangeHome, this.AEQbTJ);
                            break;
                        }
                        break;
                }
            }
        }
    }

    public final androidx.fragment.app.Fragment EZpvd(@NotNull final LifecycleOwner lifecycleOwner, @NotNull final AbstractC33240msi abstractC33240msi, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(abstractC33240msi, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            pUU.EZpvd("ModeSwitch", "popupLiteSubModeChangeDialog: lifecycleOwner is destroyed, source=" + modeSwitchSourceEnum);
            return null;
        }
        androidx.fragment.app.Fragment fragmentAEQbTJ = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).AEQbTJ(fragmentManager, modeSwitchSourceEnum);
        if (fragmentAEQbTJ != null) {
            FragmentKt.setFragmentResultListener(fragmentAEQbTJ, "FRAGMENT_RESULT_KEY", new Function2() { // from class: o.mvV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C33385mvU.AEQbTJ(lifecycleOwner, function2, abstractC33240msi, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
        }
        return fragmentAEQbTJ;
    }

    public static final Unit AEQbTJ(LifecycleOwner lifecycleOwner, Function2 function2, AbstractC33240msi abstractC33240msi, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("FRAGMENT_RESULT_MODE_CHANGED")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new SubModeChipView$popupLiteSubModeChangeDialog$1$1(function2, abstractC33240msi, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final androidx.fragment.app.Fragment AEQbTJ(@NotNull final LifecycleOwner lifecycleOwner, @NotNull final AbstractC33249msr abstractC33249msr, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(abstractC33249msr, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            pUU.EZpvd("ModeSwitch", "popupAppSubModeChangeDialog: lifecycleOwner is destroyed, source=" + modeSwitchSourceEnum);
            return null;
        }
        androidx.fragment.app.Fragment fragmentOLrzqt = ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt(fragmentManager, modeSwitchSourceEnum);
        if (fragmentOLrzqt != null) {
            FragmentKt.setFragmentResultListener(fragmentOLrzqt, "FRAGMENT_RESULT_KEY", new Function2() { // from class: o.mvW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C33385mvU.KWHzl(lifecycleOwner, function2, abstractC33249msr, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
        }
        return fragmentOLrzqt;
    }

    public static final Unit KWHzl(LifecycleOwner lifecycleOwner, Function2 function2, AbstractC33249msr abstractC33249msr, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("FRAGMENT_RESULT_MODE_CHANGED")) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new SubModeChipView$popupAppSubModeChangeDialog$1$1(function2, abstractC33249msr, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
