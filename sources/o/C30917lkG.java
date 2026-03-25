package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeTransactionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30917lkG {
    public final AbstractC28336kXq EZpvd;
    public final LifecycleOwner OLrzqt;
    public final MemeTransactionViewModel copydefault;

    /* JADX INFO: renamed from: o.lkG$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public C30917lkG(@NotNull AbstractC28336kXq abstractC28336kXq, @NotNull MemeTransactionViewModel memeTransactionViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(abstractC28336kXq, "");
        Intrinsics.checkNotNullParameter(memeTransactionViewModel, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.EZpvd = abstractC28336kXq;
        this.copydefault = memeTransactionViewModel;
        this.OLrzqt = lifecycleOwner;
    }

    public final void copydefault(@NotNull final TransactionType transactionType, @NotNull final TokenBase tokenBase, @NotNull final Function0<Unit> function0, @NotNull final yHO<? super DexMultiTokenInfoBean, ? super java.lang.Integer, ? super java.lang.String, Unit> yho, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.copydefault.OLrzqt().observe(this.OLrzqt, new StateListAnimator(new Function1() { // from class: o.lkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30917lkG.AEQbTJ(transactionType, function0, this, tokenBase, yho, function02, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(TransactionType transactionType, Function0 function0, C30917lkG c30917lkG, TokenBase tokenBase, yHO yho, Function0 function02, java.lang.Integer num) {
        int iOLrzqt;
        int type = transactionType.getType();
        if (num == null || num.intValue() != type) {
            return Unit.INSTANCE;
        }
        function0.invoke();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = c30917lkG.EZpvd.copydefault(tokenBase.getChainId(), tokenBase.getTokenContractAddress());
        java.lang.String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        if (transactionType == TransactionType.Buy) {
            iOLrzqt = c30917lkG.EZpvd.AEQbTJ(tokenBase.getChainId(), tokenContractAddress);
            if (c30917lkG.EZpvd.OLrzqt() != iOLrzqt) {
                c30917lkG.EZpvd.EZpvd(iOLrzqt);
            }
        } else {
            iOLrzqt = c30917lkG.EZpvd.OLrzqt();
        }
        java.lang.String strKWHzl = c30917lkG.EZpvd.KWHzl(transactionType.getType(), tokenBase.getChainId(), tokenContractAddress, iOLrzqt);
        yho.invoke(dexMultiTokenInfoBeanCopydefault, java.lang.Integer.valueOf(iOLrzqt), strKWHzl);
        c30917lkG.EZpvd.AEQbTJ(strKWHzl, false);
        if (C23313hvq.OLrzqt(strKWHzl, 0)) {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
