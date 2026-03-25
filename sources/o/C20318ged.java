package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.business.defi.wallet.transaction.ui.modularization.OKWTransactionModularizationViewModel$handleData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C20318ged;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ged, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20318ged extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C20325gek AEQbTJ;
    public final C20320gef EZpvd;

    public C20318ged(@NotNull C20325gek c20325gek, @NotNull C20320gef c20320gef) {
        Intrinsics.checkNotNullParameter(c20325gek, "");
        Intrinsics.checkNotNullParameter(c20320gef, "");
        this.AEQbTJ = c20325gek;
        this.EZpvd = c20320gef;
    }

    /* JADX INFO: renamed from: o.ged$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ged.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final C20318ged OLrzqt(CreationExtras creationExtras) {
            Intrinsics.checkNotNullParameter(creationExtras, "");
            return new C20318ged(new C20325gek(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null)), new C20320gef());
        }

        public final ViewModelProvider.Factory KWHzl() {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C20318ged.class), new Function1() { // from class: o.gee
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20318ged.ActionBar.OLrzqt((CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull OKWBaseTransaction<?> oKWBaseTransaction, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKWTransactionModularizationViewModel$handleData$1 oKWTransactionModularizationViewModel$handleData$1;
        TxInfoItem txInfo;
        C20318ged c20318ged;
        TxInfoItem txInfoItem;
        java.util.List<BaseModel<?>> list;
        if (continuation instanceof OKWTransactionModularizationViewModel$handleData$1) {
            oKWTransactionModularizationViewModel$handleData$1 = (OKWTransactionModularizationViewModel$handleData$1) continuation;
            int i = oKWTransactionModularizationViewModel$handleData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKWTransactionModularizationViewModel$handleData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKWTransactionModularizationViewModel$handleData$1 = new OKWTransactionModularizationViewModel$handleData$1(this, continuation);
            }
        }
        OKWTransactionModularizationViewModel$handleData$1 oKWTransactionModularizationViewModel$handleData$12 = oKWTransactionModularizationViewModel$handleData$1;
        java.lang.Object obj = oKWTransactionModularizationViewModel$handleData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKWTransactionModularizationViewModel$handleData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            PreExecTransactionRes preExecTransactionResQSLkRj = oKWBaseTransaction.QSLkRj();
            if (preExecTransactionResQSLkRj == null || (txInfo = preExecTransactionResQSLkRj.getTxInfo()) == null) {
                return Unit.INSTANCE;
            }
            if (txInfo.getModuleHandled()) {
                return Unit.INSTANCE;
            }
            java.util.List<BaseModel<?>> moduleList = txInfo.getModuleList();
            if (moduleList == null) {
                return Unit.INSTANCE;
            }
            C20325gek c20325gek = this.AEQbTJ;
            C10854bwM c10854bwMDHguZz = oKWBaseTransaction.dHguZz();
            AbstractC12782ctV abstractC12782ctVDUDNAs = oKWBaseTransaction.dUDNAs();
            ChainAddress chainAddressFERRXa = oKWBaseTransaction.fERRXa();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : moduleList) {
                if (obj2 instanceof AddressModuleModel) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList) {
                AddressModuleModel.AddressItem data = ((AddressModuleModel) obj3).getData();
                if (data != null && Intrinsics.EZpvd(data.getShowAccountNameFlag(), C56443yFo.KWHzl(true))) {
                    arrayList2.add(obj3);
                }
            }
            oKWTransactionModularizationViewModel$handleData$12.L$0 = this;
            oKWTransactionModularizationViewModel$handleData$12.L$1 = txInfo;
            oKWTransactionModularizationViewModel$handleData$12.L$2 = moduleList;
            oKWTransactionModularizationViewModel$handleData$12.label = 1;
            if (c20325gek.copydefault(c10854bwMDHguZz, abstractC12782ctVDUDNAs, chainAddressFERRXa, arrayList2, oKWTransactionModularizationViewModel$handleData$12) == objCopydefault) {
                return objCopydefault;
            }
            c20318ged = this;
            txInfoItem = txInfo;
            list = moduleList;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) oKWTransactionModularizationViewModel$handleData$12.L$2;
            txInfoItem = (TxInfoItem) oKWTransactionModularizationViewModel$handleData$12.L$1;
            c20318ged = (C20318ged) oKWTransactionModularizationViewModel$handleData$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C20320gef c20320gef = c20318ged.EZpvd;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list) {
            if (obj4 instanceof Advance) {
                arrayList3.add(obj4);
            }
        }
        c20320gef.OLrzqt(arrayList3);
        txInfoItem.setModuleHandled(true);
        return Unit.INSTANCE;
    }
}
