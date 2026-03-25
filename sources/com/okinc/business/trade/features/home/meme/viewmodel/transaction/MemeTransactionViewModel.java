package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeTransactionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.C22380heK;
import o.C28293kWa;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.kUU;
import o.kXY;
import o.yBK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeTransactionViewModel extends AbstractC33073mpa {
    public final MutableLiveData<kXY> AEQbTJ;
    public final kKG AhwBna;
    public final C28293kWa EZpvd;
    public final MutableLiveData<Boolean> KWHzl;
    public final MutableLiveData<Integer> OLrzqt;
    public final kUU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kXY> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Integer> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public MemeTransactionViewModel(@NotNull kKG kkg, @NotNull C28293kWa c28293kWa, @NotNull kUU kuu) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28293kWa, "");
        Intrinsics.checkNotNullParameter(kuu, "");
        this.AhwBna = kkg;
        this.EZpvd = c28293kWa;
        this.copydefault = kuu;
        this.AEQbTJ = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
    }

    public final void AEQbTJ(int i) {
        this.copydefault.copydefault(i);
    }

    public static /* synthetic */ DexMultiTokenInfoBean getPayCurrencyInfo$default(MemeTransactionViewModel memeTransactionViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return memeTransactionViewModel.EZpvd(str, str2);
    }

    public final DexMultiTokenInfoBean EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(str).djBIcL();
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AhwBna.valueOf();
        if (interfaceC9738bbJValueOf == null) {
            this.AEQbTJ.setValue(kXY.Application.KWHzl);
            return;
        }
        if (!this.AhwBna.copydefault(interfaceC9738bbJValueOf, str2)) {
            this.AEQbTJ.setValue(kXY.Activity.OLrzqt);
            return;
        }
        AbstractC58185ywX<DexMultiTokenInfoBean> abstractC58185ywXCopydefault = c22380heK.copydefault(str).copydefault().copydefault(str3, str2, c22380heK.copydefault(str).fARcdN(), (Integer) null);
        final Function1 function1 = new Function1() { // from class: o.kXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeTransactionViewModel.OLrzqt(this.copydefault, (DexMultiTokenInfoBean) obj);
            }
        };
        InterfaceC58227yxM<? super DexMultiTokenInfoBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kXZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeTransactionViewModel.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.kYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeTransactionViewModel.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kYa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeTransactionViewModel.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MemeTransactionViewModel memeTransactionViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        memeTransactionViewModel.AEQbTJ.setValue(new kXY.ActionBar(dexMultiTokenInfoBean.getAmountNum()));
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(MemeTransactionViewModel memeTransactionViewModel, Throwable th) {
        memeTransactionViewModel.AEQbTJ.setValue(kXY.StateListAnimator.KWHzl);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault.EZpvd().KWHzl(str, str2, str3);
    }

    public final void KWHzl() {
        this.copydefault.EZpvd().EZpvd();
    }
}
