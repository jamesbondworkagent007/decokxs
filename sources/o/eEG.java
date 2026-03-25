package o;

import androidx.fragment.app.FragmentActivity;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes18.dex */
public final class eEG {
    public final java.util.ArrayList<AbstractC12782ctV> KWHzl = new java.util.ArrayList<>();
    public int copydefault = 1;
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.copydefault = i;
    }

    public final AbstractC58260yxt<java.lang.Boolean> copydefault(java.lang.Long l, @NotNull java.util.List<ChainAddress> list) {
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ == null || (bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ.OLrzqt()) == null) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new OKWException("No device is connected", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(l, list, bluetoothDeviceModelOLrzqt.getAddress());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eEG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58260yxt judgeIfCanBeMerged$default(eEG eeg, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return eeg.EZpvd(j, (java.util.List<ChainAddress>) list);
    }

    /* JADX DEBUG: Type inference failed for r6v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Boolean> */
    public final AbstractC58260yxt<java.lang.Boolean> EZpvd(long j, java.util.List<ChainAddress> list) {
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt;
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ == null || (bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ.OLrzqt()) == null) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new OKWException("No device is connected", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        pUU.OLrzqt(">>>ledger judgeIfCanBeMerged device:" + bluetoothDeviceModelOLrzqt + " chainId:" + j);
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(j, bluetoothDeviceModelOLrzqt.getAddress(), list);
        final Function1 function1 = new Function1() { // from class: o.eEE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEG.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.eEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eEG.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean AEQbTJ(eEG eeg, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            eeg.KWHzl.clear();
            eeg.KWHzl.addAll(list);
        }
        return java.lang.Boolean.valueOf(!list.isEmpty());
    }

    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function0, "");
        DefiWalletVReminderDFragment.ActionBar actionBar = DefiWalletVReminderDFragment.Companion;
        int i = C13754dXa.Activity.fvQaOB;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromBundle);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatToken);
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(this.KWHzl);
        java.lang.String strAYXKKw3 = abstractC12782ctV != null ? abstractC12782ctV.AYXKKw() : null;
        if (strAYXKKw3 == null) {
            strAYXKKw3 = "";
        }
        DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = actionBar.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i, null, strAYXKKw, C33069mpW.OLrzqt(strAYXKKw2, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, strAYXKKw3))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendVolumeInfoChanged), "", 2, null));
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        defiWalletVReminderDFragmentEZpvd.AEQbTJ(supportFragmentManager, new Function1() { // from class: o.eEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEG.OLrzqt(function0, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull eFI efi, @NotNull Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(efi, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (!this.KWHzl.isEmpty()) {
            return KWHzl(fragmentActivity, ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(this.KWHzl)).DbNXlk(), efi, function1, function12);
        }
        return OLrzqt(fragmentActivity, efi, function1, function12);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull FragmentActivity fragmentActivity, long j, @NotNull eFJ efj, @NotNull Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(efj, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (!this.KWHzl.isEmpty()) {
            return OLrzqt(fragmentActivity, ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(this.KWHzl)).DbNXlk(), j, efj, function1, function12);
        }
        return copydefault(fragmentActivity, efj, function1, function12);
    }

    public final InterfaceC58217yxC OLrzqt(android.app.Activity activity, eFI efi, final Function1<? super AbstractC12782ctV, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        pUU.OLrzqt(">>>ledger handleAddWallet - addressInfo:" + efi);
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null;
        Intrinsics.copydefault(bluetoothDeviceModelOLrzqt);
        kotlin.Pair<InterfaceC14457dln, java.lang.Integer> pairKWHzl = KWHzl(activity);
        InterfaceC14457dln interfaceC14457dlnComponent1 = pairKWHzl.component1();
        int iIntValue = pairKWHzl.component2().intValue();
        HardwareType hardwareTypeCopydefault = HardwareType.Companion.copydefault(bluetoothDeviceModelOLrzqt.getUuid());
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        ChainAddress chainAddressCopydefault = efi.copydefault();
        java.lang.String address = bluetoothDeviceModelOLrzqt.getAddress();
        java.lang.String name = bluetoothDeviceModelOLrzqt.getName();
        if (name == null) {
            name = "";
        }
        return instance$default.AEQbTJ(chainAddressCopydefault, address, name, hardwareTypeCopydefault.name(), hardwareTypeCopydefault.ordinal(), interfaceC14457dlnComponent1, iIntValue, new Function1() { // from class: o.eED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEG.OLrzqt(function1, function12, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, Function1 function12, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            function12.invoke(new java.lang.Throwable());
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC copydefault(FragmentActivity fragmentActivity, eFJ efj, final Function1<? super AbstractC12782ctV, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        pUU.OLrzqt(">>>ledger handleAddWallet - addressInfoGroup:" + efj);
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null;
        Intrinsics.copydefault(bluetoothDeviceModelOLrzqt);
        kotlin.Pair<InterfaceC14457dln, java.lang.Integer> pairKWHzl = KWHzl(fragmentActivity);
        InterfaceC14457dln interfaceC14457dlnComponent1 = pairKWHzl.component1();
        int iIntValue = pairKWHzl.component2().intValue();
        HardwareType hardwareTypeCopydefault = HardwareType.Companion.copydefault(bluetoothDeviceModelOLrzqt.getUuid());
        java.lang.String address = bluetoothDeviceModelOLrzqt.getAddress();
        java.lang.String name = bluetoothDeviceModelOLrzqt.getName();
        C13854daT c13854daT = new C13854daT(address, null, name == null ? "" : name, hardwareTypeCopydefault.name(), hardwareTypeCopydefault, null, java.lang.System.currentTimeMillis(), null, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, null);
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        java.util.List<eFI> listCopydefault = efj.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(((eFI) it.next()).copydefault());
        }
        int iEZpvd = efj.EZpvd();
        java.lang.String address2 = bluetoothDeviceModelOLrzqt.getAddress();
        java.lang.String address3 = bluetoothDeviceModelOLrzqt.getAddress();
        java.lang.String name2 = bluetoothDeviceModelOLrzqt.getName();
        return instance$default.EZpvd(arrayList, iEZpvd, address2, address3, name2 == null ? "" : name2, hardwareTypeCopydefault.name(), c13854daT, interfaceC14457dlnComponent1, iIntValue, fragmentActivity.getSupportFragmentManager(), (1024 & 1024) != 0 ? null : null, new Function1() { // from class: o.eEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEG.gEmmrt(function1, function12, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit gEmmrt(Function1 function1, Function1 function12, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            function12.invoke(new java.lang.Throwable());
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(android.app.Activity activity, java.lang.String str, eFI efi, final Function1<? super AbstractC12782ctV, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        pUU.OLrzqt(">>>ledger handleMergeWallet:walletId:" + str + " - addressInfo:" + efi);
        kotlin.Pair<InterfaceC14457dln, java.lang.Integer> pairKWHzl = KWHzl(activity);
        return C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).OLrzqt(efi.copydefault(), C33129mqd.AYXKKw(efi.AEQbTJ()), str, pairKWHzl.component1(), pairKWHzl.component2().intValue(), new Function1() { // from class: o.eEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEG.AhwBna(function1, function12, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit AhwBna(Function1 function1, Function1 function12, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            function12.invoke(new java.lang.Throwable());
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(android.app.Activity activity, java.lang.String str, long j, eFJ efj, final Function1<? super AbstractC12782ctV, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        pUU.OLrzqt(">>>ledger handleMergeWallet:walletId:" + str + " - addressInfoGroup:" + efj);
        kotlin.Pair<InterfaceC14457dln, java.lang.Integer> pairKWHzl = KWHzl(activity);
        InterfaceC14457dln interfaceC14457dlnComponent1 = pairKWHzl.component1();
        int iIntValue = pairKWHzl.component2().intValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (eFI efi : efj.copydefault()) {
            arrayList.add(efi.copydefault());
            linkedHashMap.put(efi.copydefault().getAddress(), C33129mqd.AYXKKw(efi.AEQbTJ()));
        }
        return C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(j, (java.util.List<ChainAddress>) arrayList, (java.util.Map<java.lang.String, java.lang.String>) linkedHashMap, str, interfaceC14457dlnComponent1, iIntValue, (yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit>) ((64 & 64) != 0 ? null : null), (Function1<? super AbstractC12782ctV, Unit>) new Function1() { // from class: o.eEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEG.valueOf(function1, function12, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit valueOf(Function1 function1, Function1 function12, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            function1.invoke(abstractC12782ctV);
        } else {
            function12.invoke(new java.lang.Throwable());
        }
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<InterfaceC14457dln, java.lang.Integer> KWHzl(android.app.Activity activity) {
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "from_create")) {
            if (this.copydefault == 1) {
                return C56390yDp.OLrzqt(new C14459dlp(activity, false, 2, null), 1);
            }
            return C56390yDp.OLrzqt(new C14458dlo(activity), 2);
        }
        if (this.copydefault == 1) {
            return C56390yDp.OLrzqt(new C14459dlp(activity, false, 2, null), 3);
        }
        return C56390yDp.OLrzqt(new C14458dlo(activity), 4);
    }
}
