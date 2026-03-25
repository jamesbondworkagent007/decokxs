package o;

import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletLimitOrderAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.xZF;
import o.xZR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.day, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13885day extends AbstractC43215rlA implements InterfaceC9859bdY {
    @Override // o.InterfaceC9859bdY
    public C57567ykp values() {
        return xZR.getWSConnection$default(C11205cFp.EZpvd.QOLQEE(), true, false, false, 6, null);
    }

    /* JADX INFO: renamed from: o.day$TaskDescription */
    public static final class TaskDescription implements xZR.StateListAnimator {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58184ywW<java.lang.Boolean>> EZpvd;

        public TaskDescription(Ref.ObjectRef<InterfaceC58184ywW<java.lang.Boolean>> objectRef) {
            this.EZpvd = objectRef;
        }

        @Override // o.xZR.StateListAnimator
        public void AEQbTJ(boolean z) {
            InterfaceC58184ywW<java.lang.Boolean> interfaceC58184ywW;
            if (!z || (interfaceC58184ywW = this.EZpvd.element) == null) {
                return;
            }
            interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        }
    }

    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<java.lang.Boolean> isConnected() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final TaskDescription taskDescription = new TaskDescription(objectRef);
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.daL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C13885day.EZpvd(objectRef, taskDescription, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt()).copydefault(new InterfaceC58222yxH() { // from class: o.daH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C13885day.OLrzqt(taskDescription);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Ref.ObjectRef objectRef, TaskDescription taskDescription, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC58184ywW interfaceC58184ywW2;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        if ((!c11205cFp.QOLQEE().KWHzl().isEmpty()) && (interfaceC58184ywW2 = (InterfaceC58184ywW) objectRef.element) != null) {
            interfaceC58184ywW2.onNext(java.lang.Boolean.TRUE);
        }
        c11205cFp.QOLQEE().copydefault(taskDescription);
    }

    public static final void OLrzqt(TaskDescription taskDescription) {
        C11205cFp.EZpvd.QOLQEE().EZpvd(taskDescription);
    }

    @Override // o.InterfaceC9859bdY
    public C57567ykp KWHzl(boolean z) {
        return xZR.getWSConnection$default(C11205cFp.EZpvd.QOLQEE(), false, false, z, 2, null);
    }

    /* JADX INFO: renamed from: o.day$Application */
    public static final class Application extends WalletCoinAssetSubManager.TaskDescription {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58184ywW<C9917bed>> AEQbTJ;
        public final /* synthetic */ C13885day copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(java.lang.String str, Ref.ObjectRef<InterfaceC58184ywW<C9917bed>> objectRef, C13885day c13885day) {
            super(str, null, null, false, 14, null);
            this.AEQbTJ = objectRef;
            this.copydefault = c13885day;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            InterfaceC58184ywW<C9917bed> interfaceC58184ywW;
            Intrinsics.checkNotNullParameter(list, "");
            Ref.ObjectRef<InterfaceC58184ywW<C9917bed>> objectRef = this.AEQbTJ;
            C13885day c13885day = this.copydefault;
            for (WalletCoinAssetSubManager.SubResponse subResponse : list) {
                if (subResponse.isDefaultAddress() && (interfaceC58184ywW = objectRef.element) != null) {
                    interfaceC58184ywW.onNext(c13885day.KWHzl(subResponse));
                }
            }
        }
    }

    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<C9917bed> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Application application = new Application(str, objectRef, this);
        AbstractC58185ywX<C9917bed> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.daE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C13885day.OLrzqt(objectRef, application, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt()).copydefault(new InterfaceC58222yxH() { // from class: o.daF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C13885day.OLrzqt(application);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(Ref.ObjectRef objectRef, Application application, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        C11205cFp.EZpvd.zLjUOn().AEQbTJ(application);
    }

    public static final void OLrzqt(Application application) {
        C11205cFp.EZpvd.zLjUOn().OLrzqt(application);
    }

    public final C9917bed KWHzl(WalletCoinAssetSubManager.SubResponse subResponse) {
        return new C9917bed(subResponse.getCoinId(), subResponse.getChainId(), subResponse.getCoinAmountDec(), subResponse.getCoinAmountOriginalDec(), subResponse.getCurrencyAmountNew(), subResponse.getTokenAddress(), null, subResponse.isBaseCoin(), subResponse.getTransferableBalance(), 64, null);
    }

    /* JADX INFO: renamed from: o.day$StateListAnimator */
    public static final class StateListAnimator extends xZF.TaskDescription<WalletLimitOrderAssetSubManager.SubResponse> {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58184ywW<java.util.List<C9922bei>>> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(java.lang.String str, Ref.ObjectRef<InterfaceC58184ywW<java.util.List<C9922bei>>> objectRef) {
            super(str, null, 2, null);
            this.AEQbTJ = objectRef;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletLimitOrderAssetSubManager.SubResponse> list) {
            InterfaceC58184ywW<java.util.List<C9922bei>> interfaceC58184ywW;
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (WalletLimitOrderAssetSubManager.SubResponse subResponse : list) {
                arrayList.add(new C9922bei(subResponse.getUserAddress(), subResponse.getAddress(), subResponse.getCoinId(), subResponse.getChainId(), subResponse.getSymbol(), subResponse.getImageUrl(), subResponse.getChainName(), subResponse.getCoinAmount(), subResponse.getCurrencyAmount(), subResponse.getDecimalNum(), subResponse.getVDecimalNum(), subResponse.getHasPrice(), subResponse.getPrice(), subResponse.getHasPercent(), subResponse.getPriceChangePercent24h()));
            }
            Ref.ObjectRef<InterfaceC58184ywW<java.util.List<C9922bei>>> objectRef = this.AEQbTJ;
            if (!(!arrayList.isEmpty()) || (interfaceC58184ywW = objectRef.element) == null) {
                return;
            }
            interfaceC58184ywW.onNext(arrayList);
        }
    }

    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<java.util.List<C9922bei>> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final StateListAnimator stateListAnimator = new StateListAnimator(str, objectRef);
        AbstractC58185ywX<java.util.List<C9922bei>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.daI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C13885day.EZpvd(objectRef, stateListAnimator, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt()).copydefault(new InterfaceC58222yxH() { // from class: o.daK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C13885day.AEQbTJ(stateListAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Ref.ObjectRef objectRef, StateListAnimator stateListAnimator, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        C11205cFp.EZpvd.zsXlph().AEQbTJ(stateListAnimator);
    }

    public static final void AEQbTJ(StateListAnimator stateListAnimator) {
        C11205cFp.EZpvd.zsXlph().OLrzqt(stateListAnimator);
    }

    /* JADX INFO: renamed from: o.day$ActionBar */
    public static final class ActionBar extends WalletCoinAssetSubManager.TaskDescription {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58184ywW<C9860bdZ>> AEQbTJ;
        public final /* synthetic */ C13885day copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, Ref.ObjectRef<InterfaceC58184ywW<C9860bdZ>> objectRef, C13885day c13885day) {
            super(str, null, null, false, 14, null);
            this.AEQbTJ = objectRef;
            this.copydefault = c13885day;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            Ref.ObjectRef<InterfaceC58184ywW<C9860bdZ>> objectRef = this.AEQbTJ;
            C13885day c13885day = this.copydefault;
            for (WalletCoinAssetSubManager.SubResponse subResponse : list) {
                InterfaceC58184ywW<C9860bdZ> interfaceC58184ywW = objectRef.element;
                if (interfaceC58184ywW != null) {
                    interfaceC58184ywW.onNext(c13885day.AEQbTJ(subResponse));
                }
            }
        }
    }

    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<C9860bdZ> i_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final ActionBar actionBar = new ActionBar(str, objectRef, this);
        AbstractC58185ywX<C9860bdZ> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.daD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C13885day.KWHzl(objectRef, actionBar, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt()).copydefault(new InterfaceC58222yxH() { // from class: o.daG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C13885day.EZpvd(actionBar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(Ref.ObjectRef objectRef, ActionBar actionBar, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        C11205cFp.EZpvd.zLjUOn().AEQbTJ(actionBar);
    }

    public static final void EZpvd(ActionBar actionBar) {
        C11205cFp.EZpvd.zLjUOn().OLrzqt(actionBar);
    }

    public final C9860bdZ AEQbTJ(WalletCoinAssetSubManager.SubResponse subResponse) {
        return new C9860bdZ(subResponse.getAddress(), subResponse.getCoinId(), subResponse.getChainId(), subResponse.getCoinAmountDec(), subResponse.getCoinAmountOriginalDec(), subResponse.getCurrencyAmountNew(), subResponse.getTokenAddress(), null, subResponse.isBaseCoin(), subResponse.getTransferableBalance(), 128, null);
    }

    /* JADX INFO: renamed from: o.day$Activity */
    public static final class Activity extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58184ywW<C9921beh>> KWHzl;
        public final /* synthetic */ C13885day copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(java.lang.String str, Ref.ObjectRef<InterfaceC58184ywW<C9921beh>> objectRef, C13885day c13885day) {
            super(str, null, 2, null);
            this.KWHzl = objectRef;
            this.copydefault = c13885day;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            Ref.ObjectRef<InterfaceC58184ywW<C9921beh>> objectRef = this.KWHzl;
            C13885day c13885day = this.copydefault;
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                InterfaceC58184ywW<C9921beh> interfaceC58184ywW = objectRef.element;
                if (interfaceC58184ywW != null) {
                    interfaceC58184ywW.onNext(c13885day.OLrzqt(subResponse));
                }
            }
        }
    }

    @Override // o.InterfaceC9859bdY
    public AbstractC58185ywX<C9921beh> gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Activity activity = new Activity(str, objectRef, this);
        AbstractC58185ywX<C9921beh> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.daA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C13885day.EZpvd(objectRef, activity, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt()).copydefault(new InterfaceC58222yxH() { // from class: o.daC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C13885day.EZpvd(activity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(Ref.ObjectRef objectRef, Activity activity, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(activity);
    }

    public static final void EZpvd(Activity activity) {
        C11205cFp.EZpvd.AxsJAY().OLrzqt(activity);
    }

    public final C9921beh OLrzqt(WalletTxHistorySubManager.SubResponse subResponse) {
        return new C9921beh(subResponse.getTxId(), subResponse.getTxStatus(), subResponse.getTxType(), subResponse.getOrderId(), subResponse.getTxhash(), subResponse.getUOpHash());
    }
}
