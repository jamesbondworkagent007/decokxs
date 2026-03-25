package com.okinc.pop.manager;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.InterfaceC46518tXh;
import o.InterfaceC46522tXl;
import o.InterfaceC46523tXm;
import o.InterfaceC58217yxC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ManageableDialogFragmentContainer implements InterfaceC46518tXh, LifecycleObserver {
    public final Function0<AbstractC58185ywX<Boolean>> AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public InterfaceC46523tXm AhwBna;
    public InterfaceC46522tXl DbNXlk;
    public final Function1<FragmentManager, DialogFragment> EZpvd;
    public final FragmentManager KWHzl;
    public boolean OLrzqt;
    public DialogFragment copydefault;
    public boolean djBIcL;
    public ResumeCheckType fetchVPNInfo;
    public boolean gEmmrt;
    public ParallelCheckResult valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public void AEQbTJ(InterfaceC58217yxC interfaceC58217yxC) {
        this.AYXKKw = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public void AEQbTJ(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public ParallelCheckResult EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public void EZpvd(@NotNull ParallelCheckResult parallelCheckResult) {
        Intrinsics.checkNotNullParameter(parallelCheckResult, "");
        this.valueOf = parallelCheckResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public InterfaceC58217yxC KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public InterfaceC46522tXl OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public void copydefault(InterfaceC46523tXm interfaceC46523tXm) {
        this.AhwBna = interfaceC46523tXm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46518tXh
    public ResumeCheckType djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC46523tXm fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentManager, ? extends androidx.fragment.app.DialogFragment> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function0<? extends o.ywX<java.lang.Boolean>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ManageableDialogFragmentContainer(@NotNull FragmentManager fragmentManager, @NotNull InterfaceC46522tXl interfaceC46522tXl, boolean z, boolean z2, @NotNull Function1<? super FragmentManager, ? extends DialogFragment> function1, @NotNull Function0<? extends AbstractC58185ywX<Boolean>> function0, @NotNull ResumeCheckType resumeCheckType) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC46522tXl, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(resumeCheckType, "");
        this.KWHzl = fragmentManager;
        this.DbNXlk = interfaceC46522tXl;
        this.OLrzqt = z;
        this.djBIcL = z2;
        this.EZpvd = function1;
        this.AEQbTJ = function0;
        this.fetchVPNInfo = resumeCheckType;
        this.valueOf = ParallelCheckResult.UNKNOWN;
    }

    @Override // o.InterfaceC46518tXh
    public void AhwBna() {
        InterfaceC46518tXh.Application.KWHzl(this);
    }

    @Override // o.InterfaceC46518tXh
    public void KWHzl(@NotNull InterfaceC46523tXm interfaceC46523tXm) {
        InterfaceC46518tXh.Application.EZpvd(this, interfaceC46523tXm);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
        return InterfaceC46518tXh.Application.copydefault(this, interfaceC46518tXh);
    }

    @Override // o.InterfaceC46518tXh
    public AbstractC58185ywX<Boolean> copydefault() {
        AEQbTJ(true);
        return this.AEQbTJ.invoke();
    }

    public void gEmmrt() {
        Lifecycle lifecycle;
        DialogFragment dialogFragment = this.copydefault;
        if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC46523tXm interfaceC46523tXmFetchVPNInfo = fetchVPNInfo();
        if (interfaceC46523tXmFetchVPNInfo == null) {
            return;
        }
        interfaceC46523tXmFetchVPNInfo.AEQbTJ(this);
    }

    @Override // o.InterfaceC46518tXh
    public void valueOf() {
        String tag;
        if (this.KWHzl.isStateSaved() || this.KWHzl.isDestroyed()) {
            InterfaceC46523tXm interfaceC46523tXmFetchVPNInfo = fetchVPNInfo();
            if (interfaceC46523tXmFetchVPNInfo == null) {
                return;
            }
            interfaceC46523tXmFetchVPNInfo.AEQbTJ(this);
            return;
        }
        DialogFragment dialogFragmentInvoke = this.EZpvd.invoke(this.KWHzl);
        this.copydefault = dialogFragmentInvoke;
        if (dialogFragmentInvoke == null) {
            InterfaceC46523tXm interfaceC46523tXmFetchVPNInfo2 = fetchVPNInfo();
            if (interfaceC46523tXmFetchVPNInfo2 == null) {
                return;
            }
            interfaceC46523tXmFetchVPNInfo2.AEQbTJ(this);
            return;
        }
        gEmmrt();
        InterfaceC46523tXm interfaceC46523tXmFetchVPNInfo3 = fetchVPNInfo();
        if (interfaceC46523tXmFetchVPNInfo3 != null) {
            interfaceC46523tXmFetchVPNInfo3.EZpvd(this);
        }
        DialogFragment dialogFragment = this.copydefault;
        if (dialogFragment == null) {
            return;
        }
        FragmentManager fragmentManager = this.KWHzl;
        if (dialogFragment == null || (tag = dialogFragment.getTag()) == null) {
            tag = "";
        }
        dialogFragment.show(fragmentManager, tag);
    }
}
