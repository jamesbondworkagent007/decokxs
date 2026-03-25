package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterBottomFragment;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.reminder.OKReminder;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.AbstractC6089aIk;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C43454rpb;
import o.C52761wXj;
import o.C52781wYc;
import o.C52794wYp;
import o.C55296xhK;
import o.C5632aAD;
import o.C56390yDp;
import o.C56423yEv;
import o.C56524yIo;
import o.C5679aAy;
import o.C58761zOi;
import o.C58893zTh;
import o.C6690aUB;
import o.C8206ayP;
import o.C8262azS;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.yCM;
import o.zAT;
import o.zNS;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyCrossDeviceMasterBottomFragment extends AbstractC6089aIk {
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public C8262azS gEmmrt;

    @yCM
    public C58893zTh passkeyTracker;
    public final String valueOf = "PasskeyCrossDeviceMasterBottomFragment";

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public PasskeyCrossDeviceMasterBottomFragment() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PasskeyCrossDeviceMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterBottomFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterBottomFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyCrossDeviceMasterBottomFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PasskeyCrossDeviceMasterViewModel KWHzl() {
        return (PasskeyCrossDeviceMasterViewModel) this.AYXKKw.getValue();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
        setCancelable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8262azS c8262azSOLrzqt = C8262azS.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        this.gEmmrt = c8262azSOLrzqt;
        SimpleToolBar simpleToolBar = c8262azSOLrzqt.KWHzl;
        simpleToolBar.setNavigationIconVisible(false);
        simpleToolBar.setRightIconVisible(true);
        simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeyCrossDeviceMasterBottomFragment.copydefault(this.OLrzqt);
            }
        });
        final C5679aAy c5679aAy = c8262azSOLrzqt.OLrzqt;
        C52794wYp c52794wYp = c5679aAy.AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        ImageView imageView = c5679aAy.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        Context context = c5679aAy.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/auth/common/passkey/okx_passkey_cross_device_receive.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        boolean z = KWHzl().copydefault().AEQbTJ() || (KWHzl().copydefault().EZpvd() instanceof zAT.Activity);
        if (z) {
            ConstraintLayout constraintLayout2 = c5679aAy.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            KWHzl().copydefault(false);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout constraintLayout3 = c5679aAy.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(0);
            c5679aAy.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.aIB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    PasskeyCrossDeviceMasterBottomFragment.copydefault(c5679aAy, view);
                }
            });
            KWHzl().copydefault(c5679aAy.gEmmrt.isChecked());
            c5679aAy.gEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.aIA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                    PasskeyCrossDeviceMasterBottomFragment.AEQbTJ(this.AEQbTJ, compoundButton, z2);
                }
            });
        }
        valueOf();
        KWHzl().gEmmrt();
    }

    public static final Unit copydefault(PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment) {
        passkeyCrossDeviceMasterBottomFragment.KWHzl().AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C5679aAy c5679aAy, View view) {
        c5679aAy.gEmmrt.performClick();
    }

    public static final void AEQbTJ(PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment, CompoundButton compoundButton, boolean z) {
        passkeyCrossDeviceMasterBottomFragment.KWHzl().copydefault(z);
    }

    private final void valueOf() {
        C6690aUB.KWHzl(KWHzl().AhwBna(), this, new PasskeyCrossDeviceMasterBottomFragment$observeViewModel$1(this, null));
        C6690aUB.KWHzl(KWHzl().djBIcL(), this, new PasskeyCrossDeviceMasterBottomFragment$observeViewModel$2(this, null));
        C6690aUB.KWHzl(KWHzl().KWHzl(), this, new PasskeyCrossDeviceMasterBottomFragment$observeViewModel$3(this, null));
        KWHzl().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.aIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PasskeyCrossDeviceMasterBottomFragment.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit EZpvd(PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment, Boolean bool) {
        C5679aAy c5679aAy;
        C52794wYp c52794wYp;
        C8262azS c8262azS = passkeyCrossDeviceMasterBottomFragment.gEmmrt;
        if (c8262azS != null && (c5679aAy = c8262azS.OLrzqt) != null && (c52794wYp = c5679aAy.AEQbTJ) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C58761zOi c58761zOi) {
        C8262azS c8262azS = this.gEmmrt;
        if (c8262azS != null) {
            c8262azS.OLrzqt.AkhnZx.setText(C33069mpW.copydefault(this, C8206ayP.Dialog.DUUtXg, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("scenario", c58761zOi.KWHzl().copydefault()))));
            c8262azS.OLrzqt.djBIcL.setText(c58761zOi.KWHzl().AEQbTJ());
            c8262azS.OLrzqt.values.setText(KWHzl().AEQbTJ(StringsKt__StringNumberConversionsKt.getFieldNames(c58761zOi.KWHzl().AhwBna())));
            c8262azS.OLrzqt.KWHzl.setText(c58761zOi.KWHzl().KWHzl());
            c8262azS.OLrzqt.OLrzqt.setText(c58761zOi.KWHzl().OLrzqt());
            c8262azS.OLrzqt.DbNXlk.setText(C33069mpW.copydefault(this, C8206ayP.Dialog.DGUQLI, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("deviceName", c58761zOi.KWHzl().OLrzqt()))));
            OLrzqt(c58761zOi);
            if (c58761zOi.KWHzl().EZpvd()) {
                OKReminder oKReminder = c8262azS.OLrzqt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(oKReminder, "");
                oKReminder.setVisibility(8);
                return;
            }
            ConstraintLayout constraintLayout = c8262azS.OLrzqt.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            OKReminder oKReminder2 = c8262azS.OLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
            oKReminder2.setVisibility(0);
            c8262azS.OLrzqt.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.FSMca));
            KWHzl().copydefault(false);
            if (this.AhwBna) {
                return;
            }
            this.AhwBna = true;
            OKReminder oKReminder3 = c8262azS.OLrzqt.EZpvd;
            oKReminder3.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.DGgnkA));
            oKReminder3.setMessage(C33070mpX.AYXKKw(C8206ayP.Dialog.heceqZ));
            oKReminder3.setStyle(2);
            oKReminder3.setCloseIconVisibility(false);
            C5632aAD c5632aADEZpvd = C5632aAD.EZpvd(getCustomLayoutInflater(), oKReminder3, false);
            Intrinsics.checkNotNullExpressionValue(c5632aADEZpvd, "");
            c5632aADEZpvd.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.aIC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    PasskeyCrossDeviceMasterBottomFragment.KWHzl(this.AEQbTJ, compoundButton, z);
                }
            });
            TextView textView = c5632aADEZpvd.copydefault;
            textView.setOnClickListener(new ActionBar(textView, 1000L, c5632aADEZpvd));
            ConstraintLayout root = c5632aADEZpvd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            oKReminder3.OLrzqt(root);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ C5632aAD KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, C5632aAD c5632aAD) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c5632aAD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.performClick();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ PasskeyCrossDeviceMasterBottomFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = passkeyCrossDeviceMasterBottomFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.EZpvd;
                PasskeyCrossDeviceMasterViewModel passkeyCrossDeviceMasterViewModelKWHzl = this.copydefault.KWHzl();
                Context context = c52794wYp.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                passkeyCrossDeviceMasterViewModelKWHzl.EZpvd(context);
                this.copydefault.KWHzl().EZpvd(this.copydefault.AhwBna);
            }
        }
    }

    public static final void KWHzl(PasskeyCrossDeviceMasterBottomFragment passkeyCrossDeviceMasterBottomFragment, CompoundButton compoundButton, boolean z) {
        passkeyCrossDeviceMasterBottomFragment.KWHzl().KWHzl(z);
    }

    public final void OLrzqt(C58761zOi c58761zOi) {
        C5679aAy c5679aAy;
        C52794wYp c52794wYp;
        String strAYXKKw;
        C8262azS c8262azS = this.gEmmrt;
        if (c8262azS == null || (c5679aAy = c8262azS.OLrzqt) == null || (c52794wYp = c5679aAy.AEQbTJ) == null) {
            return;
        }
        zNS znsCopydefault = c58761zOi.copydefault();
        if (znsCopydefault instanceof zNS.StateListAnimator) {
            strAYXKKw = C33069mpW.copydefault(this, C8206ayP.Dialog.DGUQLIdZmdUa, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", Integer.valueOf(((zNS.StateListAnimator) znsCopydefault).EZpvd()))));
        } else {
            if (!Intrinsics.EZpvd(znsCopydefault, zNS.ActionBar.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DGUQLIDGUQLI);
        }
        c52794wYp.setText(strAYXKKw);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }
}
