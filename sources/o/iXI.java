package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24173iXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iXI implements iXH {
    public TransactionStep EZpvd;
    public boolean KWHzl;
    public TransactionStage OLrzqt;
    public java.util.List<TransactionStep> AEQbTJ = yDY.AhwBna();
    public java.util.List<TransactionStep> djBIcL = new java.util.ArrayList();
    public java.util.List<TransactionStep> copydefault = new java.util.ArrayList();

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAction.values().length];
            try {
                iArr[InvestAction.SubscriptionApprove.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAction.RedeemApprove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestAction.StartFarming.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestAction.EndFarming.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TransactionStep> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public iXI() {
    }

    public final void copydefault() {
        this.djBIcL.clear();
        this.KWHzl = false;
        java.util.List<TransactionStep> list = this.djBIcL;
        java.util.List<TransactionStep> list2 = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((TransactionStep) obj).fetchVPNInfo()) {
                arrayList.add(obj);
            }
        }
        list.addAll(arrayList);
    }

    public final int AEQbTJ() {
        return this.djBIcL.isEmpty() ^ true ? 0 : -1;
    }

    public final TransactionStep EZpvd() {
        int iAEQbTJ = AEQbTJ();
        if (iAEQbTJ < 0 || iAEQbTJ >= this.djBIcL.size()) {
            return null;
        }
        return this.djBIcL.get(iAEQbTJ);
    }

    public final C24177iXt OLrzqt(TransactionStep transactionStep, C24177iXt c24177iXt) {
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.djBIcL.size()), 1)) {
            this.djBIcL.indexOf(transactionStep);
        }
        KWHzl().size();
        this.djBIcL.size();
        return new C24177iXt(DisplayText.Companion.OLrzqt(transactionStep.AhwBna()), KWHzl(transactionStep), transactionStep.valueOf(), true, this.KWHzl, c24177iXt.KWHzl(), c24177iXt.OLrzqt(), InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf()) ? 1 : 2);
    }

    public final java.util.List<DisplayText> OLrzqt() {
        DisplayText displayTextEZpvd;
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(this.djBIcL.size()), 1) && C33129mqd.valueOf(java.lang.Integer.valueOf(KWHzl().size()), 0)) {
            return yDY.AhwBna();
        }
        java.util.List<TransactionStep> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) KWHzl(), (java.lang.Iterable) this.djBIcL);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        for (TransactionStep transactionStep : listDjBIcL) {
            boolean zFetchVPNInfo = transactionStep.fetchVPNInfo();
            if (zFetchVPNInfo) {
                displayTextEZpvd = EZpvd(transactionStep.AhwBna(), C25493ixk.FragmentManager.DGUQLIOvDItG, transactionStep.AYXKKw());
            } else {
                if (zFetchVPNInfo) {
                    throw new NoWhenBranchMatchedException();
                }
                displayTextEZpvd = EZpvd(transactionStep.AhwBna(), C25493ixk.FragmentManager.DGUQLIekVPG, transactionStep.AYXKKw());
            }
            arrayList.add(displayTextEZpvd);
        }
        return arrayList;
    }

    public final DisplayText EZpvd(java.lang.String str, int i, java.lang.String str2) {
        if (str.length() > 0) {
            return DisplayText.Companion.OLrzqt(str);
        }
        return DisplayText.Companion.KWHzl(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", str2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DisplayText KWHzl(TransactionStep transactionStep) {
        int i;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) transactionStep.djBIcL())) {
            return DisplayText.Companion.OLrzqt(transactionStep.djBIcL());
        }
        DisplayText.Companion companion = DisplayText.Companion;
        int i2 = TaskDescription.copydefault[InvestAction.Companion.copydefault(transactionStep.valueOf()).ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = C25493ixk.FragmentManager.sTzBva;
        } else if (i2 == 3) {
            i = C25493ixk.FragmentManager.vLaW;
        } else if (i2 == 4) {
            i = C25493ixk.FragmentManager.zAEkPU;
        }
        return DisplayText.Companion.fromStringResource$default(companion, i, null, 2, null);
    }

    public final C24177iXt KWHzl(C24177iXt c24177iXt) {
        DisplayText.Companion companion = DisplayText.Companion;
        return new C24177iXt(DisplayText.Companion.fromStringResource$default(companion, C25493ixk.FragmentManager.RVsVBY, null, 2, null), DisplayText.Companion.fromStringResource$default(companion, C25493ixk.FragmentManager.RVsVBY, null, 2, null), -1, true, this.KWHzl, c24177iXt.KWHzl(), c24177iXt.OLrzqt(), 4);
    }

    @Override // o.iXH
    public java.lang.Object EZpvd(@NotNull TransactionStage transactionStage, @NotNull java.util.List<TransactionStep> list, @NotNull C24177iXt c24177iXt, @NotNull Continuation<? super Result<? extends InterfaceC24173iXp>> continuation) {
        java.lang.Object actionBar;
        TransactionStep transactionStep;
        try {
            Result.Application application = Result.Companion;
            if (list.isEmpty()) {
                actionBar = new InterfaceC24173iXp.ActionBar(c24177iXt);
            } else {
                this.AEQbTJ = list;
                if (transactionStage == TransactionStage.INPUT || this.EZpvd == null || transactionStage == TransactionStage.RECEIVE_INFO_TIME_OUT) {
                    this.OLrzqt = transactionStage;
                    copydefault();
                    this.copydefault.clear();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (((TransactionStep) obj).fetchVPNInfo()) {
                            arrayList.add(obj);
                        }
                    }
                    TransactionStep transactionStep2 = this.EZpvd;
                    Intrinsics.copydefault(transactionStep2);
                    if (KWHzl(arrayList, transactionStep2) == null) {
                        java.util.List<TransactionStep> list2 = this.AEQbTJ;
                        TransactionStep transactionStep3 = this.EZpvd;
                        Intrinsics.copydefault(transactionStep3);
                        TransactionStep transactionStepKWHzl = KWHzl(list2, transactionStep3);
                        if (transactionStepKWHzl != null) {
                            C56443yFo.KWHzl(this.copydefault.add(transactionStepKWHzl));
                        }
                        copydefault();
                    }
                }
                this.EZpvd = EZpvd();
                java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) KWHzl(), (java.lang.Iterable) this.djBIcL);
                if (transactionStage == TransactionStage.RECEIVE_INFO_TIME_OUT) {
                    actionBar = new InterfaceC24173iXp.ActionBar(KWHzl(c24177iXt));
                } else if (transactionStage == TransactionStage.INPUT || (transactionStep = this.EZpvd) == null) {
                    actionBar = new InterfaceC24173iXp.ActionBar(c24177iXt);
                } else {
                    int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends TransactionStep>) ((java.util.List<? extends java.lang.Object>) listDjBIcL), transactionStep);
                    TransactionStep transactionStep4 = this.EZpvd;
                    Intrinsics.copydefault(transactionStep4);
                    actionBar = new InterfaceC24173iXp.Activity(OLrzqt(transactionStep4, c24177iXt), OLrzqt(), transactionStep, iCopydefault);
                }
            }
            return Result.m7377constructorimpl(actionBar);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final TransactionStep KWHzl(java.util.List<TransactionStep> list, TransactionStep transactionStep) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransactionStep transactionStep2 = (TransactionStep) next;
            if (transactionStep2.valueOf() == transactionStep.valueOf() && Intrinsics.EZpvd((java.lang.Object) transactionStep2.gEmmrt(), (java.lang.Object) transactionStep.gEmmrt()) && transactionStep2.AEQbTJ() == transactionStep.AEQbTJ()) {
                break;
            }
        }
        return (TransactionStep) next;
    }
}
