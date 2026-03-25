package com.okinc.business.defi.wallet.home;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.localization.util.format.DisplaySign;
import com.robinhood.ticker.TickerView;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC12782ctV;
import o.C10407bnq;
import o.C10598brV;
import o.C10614brl;
import o.C10854bwM;
import o.C13821dZn;
import o.C16595emr;
import o.C18275ffN;
import o.C33129mqd;
import o.C54870xYj;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18271ffJ;
import o.ePI;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$showWalletAssets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ ePI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$showWalletAssets$1(AbstractC12782ctV abstractC12782ctV, ePI epi, Continuation<? super DefiHomeWalletFragment$showWalletAssets$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = epi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$showWalletAssets$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletFragment$showWalletAssets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        String strOLrzqt;
        CustomChainCoinMeta customChainCoinMetaDjBIcL;
        String strEjfBZ;
        TickerView tickerView;
        Context context;
        CustomChainCoinMeta customChainCoinMetaDjBIcL2;
        String strEjfBZ2;
        CustomChainCoinMeta customChainCoinMetaDjBIcL3;
        C10854bwM c10854bwMAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(this.$wallet.DbNXlk());
            this.this$0.QVAiDq().OLrzqt(C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getGeneralChainId()));
            this.this$0.QVAiDq().AEQbTJ(C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId()));
            if (walletSelectedChainBeanKWHzl.isSingleMode()) {
                String strFIwbmz = this.$wallet.fIwbmz(this.this$0.QVAiDq().fJNWhG());
                CustomChainMeta customChainMetaEZpvd = C10598brV.AEQbTJ.EZpvd(this.this$0.QVAiDq().fJNWhG());
                this.this$0.zsXlph = strFIwbmz;
                this.this$0.AubY = C54870xYj.OLrzqt(strFIwbmz, (249 & 1) != 0 ? 0 : 0, (customChainMetaEZpvd == null || (customChainCoinMetaDjBIcL3 = customChainMetaEZpvd.djBIcL()) == null || (c10854bwMAEQbTJ = customChainCoinMetaDjBIcL3.AEQbTJ()) == null) ? 6 : c10854bwMAEQbTJ.AkhnZx(), null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                C16595emr c16595emr = this.this$0.AhwBna;
                String str = "";
                if (c16595emr != null && (tickerView = c16595emr.QOLQEE) != null && (context = tickerView.getContext()) != null && C55296xhK.OLrzqt(context)) {
                    C13821dZn c13821dZn = C13821dZn.EZpvd;
                    if (customChainMetaEZpvd != null && (customChainCoinMetaDjBIcL2 = customChainMetaEZpvd.djBIcL()) != null && (strEjfBZ2 = customChainCoinMetaDjBIcL2.ejfBZ()) != null) {
                        str = strEjfBZ2;
                    }
                    strOLrzqt = c13821dZn.OLrzqt(str + " " + this.this$0.AubY);
                } else {
                    C13821dZn c13821dZn2 = C13821dZn.EZpvd;
                    String str2 = this.this$0.AubY;
                    if (customChainMetaEZpvd != null && (customChainCoinMetaDjBIcL = customChainMetaEZpvd.djBIcL()) != null && (strEjfBZ = customChainCoinMetaDjBIcL.ejfBZ()) != null) {
                        str = strEjfBZ;
                    }
                    strOLrzqt = c13821dZn2.OLrzqt(str2 + " " + str);
                }
                pUU.copydefault(this.this$0.getTAG(), "showWalletAssets isSingleMode totalCount = " + strFIwbmz + " showText = " + strOLrzqt);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, strOLrzqt, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (this.this$0.QVAiDq().fJNWhG() == Long.MIN_VALUE) {
                    strCopydefault = this.$wallet.KWHzl("opened", true ^ C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(this.$wallet));
                } else {
                    strCopydefault = this.$wallet.copydefault("opened", this.this$0.QVAiDq().fJNWhG(), true ^ C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(this.$wallet));
                }
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, strCopydefault, null);
                this.label = 2;
                if (BuildersKt.withContext(main2, anonymousClass2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$showWalletAssets$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $showText;
        int label;
        final /* synthetic */ ePI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ePI epi, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = epi;
            this.$showText = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$showText, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C18275ffN.fetchKLineState$default(this.this$0.QbewEr(), InterfaceC18271ffJ.Application.EZpvd, null, 2, null);
                this.this$0.AYXKKw(this.$showText);
                this.this$0.djBIcL = false;
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$showWalletAssets$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $totalAssetValuation;
        int label;
        final /* synthetic */ ePI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ePI epi, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = epi;
            this.$totalAssetValuation = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$totalAssetValuation, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(this.this$0.QVAiDq().fJNWhG()) && !this.this$0.AYXKKw) {
                    C18275ffN.fetchKLineState$default(this.this$0.QbewEr(), new InterfaceC18271ffJ.ActionBar(this.$totalAssetValuation), null, 2, null);
                    this.this$0.valueOf(this.$totalAssetValuation);
                    this.this$0.djBIcL = false;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
