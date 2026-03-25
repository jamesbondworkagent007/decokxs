package com.okinc.business.defi.wallet;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.DefiWalletMainActivity$deepLinkTonConnectWallet$1;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.C13754dXa;
import o.C16058eck;
import o.C18355fgo;
import o.C33069mpW;
import o.C33070mpX;
import o.C33134mqi;
import o.C52761wXj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C59449zhJ;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$deepLinkTonConnectWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ String $origin;
    final /* synthetic */ C16058eck $tonConnectManager;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ValidateCanConnectResult.ErrorType.values().length];
            try {
                iArr[ValidateCanConnectResult.ErrorType.WALLET_NOT_BACKED_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$deepLinkTonConnectWallet$1(DefiWalletMainActivity defiWalletMainActivity, C16058eck c16058eck, AbstractC12782ctV abstractC12782ctV, String str, Bundle bundle, Continuation<? super DefiWalletMainActivity$deepLinkTonConnectWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletMainActivity;
        this.$tonConnectManager = c16058eck;
        this.$wallet = abstractC12782ctV;
        this.$origin = str;
        this.$bundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$deepLinkTonConnectWallet$1(this.this$0, this.$tonConnectManager, this.$wallet, this.$origin, this.$bundle, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$deepLinkTonConnectWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault;
        ValidateCanConnectResult validateCanConnectResult;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C59449zhJ.startsWith$default(DefiWalletMainActivity.sSMYrx(this.this$0), "tc://", false, 2, null)) {
                C16058eck c16058eck = this.$tonConnectManager;
                String strSSMYrx = DefiWalletMainActivity.sSMYrx(this.this$0);
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                String str = this.$origin;
                this.label = 1;
                objCopydefault = c16058eck.copydefault(strSSMYrx, abstractC12782ctV, str, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                validateCanConnectResult = (ValidateCanConnectResult) objCopydefault;
                DefiWalletMainActivity.KWHzl(this.this$0, "");
            } else {
                if (!this.$tonConnectManager.copydefault(this.$bundle)) {
                    return Unit.INSTANCE;
                }
                C16058eck c16058eck2 = this.$tonConnectManager;
                Bundle bundle = this.$bundle;
                AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
                String str2 = this.$origin;
                this.label = 2;
                objEZpvd = c16058eck2.EZpvd(bundle, abstractC12782ctV2, str2, this);
                if (objEZpvd == objCopydefault2) {
                    return objCopydefault2;
                }
                validateCanConnectResult = (ValidateCanConnectResult) objEZpvd;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
            validateCanConnectResult = (ValidateCanConnectResult) objCopydefault;
            DefiWalletMainActivity.KWHzl(this.this$0, "");
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            validateCanConnectResult = (ValidateCanConnectResult) objEZpvd;
        }
        if (validateCanConnectResult.EZpvd()) {
            pUU.KWHzl(this.this$0.getTAG(), "deepLinkTonConnectWallet - Showing connect prompt");
            C18355fgo.KWHzl.EZpvd(this.this$0, 2, 0, "", this.$wallet.DbNXlk());
        } else {
            pUU.KWHzl(this.this$0.getTAG(), "deepLinkTonConnectWallet - Error connecting " + validateCanConnectResult.KWHzl());
            if (StateListAnimator.OLrzqt[validateCanConnectResult.KWHzl().ordinal()] == 1) {
                pUU.KWHzl(this.this$0.getTAG(), "deepLinkTonConnectWallet - Current wallet is not backed-up");
                if (this.this$0.getSupportFragmentManager().isStateSaved()) {
                    return Unit.INSTANCE;
                }
                pUU.KWHzl(this.this$0.getTAG(), "deepLinkTonConnectWallet - Show back-up dialog");
                try {
                    DefiWalletVReminderDFragment.ActionBar actionBar = DefiWalletVReminderDFragment.Companion;
                    int i2 = C52761wXj.TaskDescription.NRYds;
                    String string = this.this$0.getString(C13754dXa.FragmentManager.fmB);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDCKfqPDCfLja);
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = this.$wallet.gwTjWJ();
                    String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
                    String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountName", strAuCTel + "-" + this.$wallet.AkhnZx())));
                    String string2 = this.this$0.getString(C13754dXa.FragmentManager.scanPackages);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = actionBar.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i2, null, string, strOLrzqt, string2, "", 2, null));
                    FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    final DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                    defiWalletVReminderDFragmentEZpvd.AEQbTJ(supportFragmentManager, new Function1() { // from class: o.dWQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return DefiWalletMainActivity$deepLinkTonConnectWallet$1.invokeSuspend$lambda$1(defiWalletMainActivity, (java.lang.Integer) obj2);
                        }
                    });
                } catch (Exception e) {
                    pUU.AEQbTJ(this.this$0.getTAG(), "deepLinkTonConnectWallet - Failed to show back-up dialog", e);
                }
            } else {
                Integer numCopydefault = validateCanConnectResult.copydefault();
                if (numCopydefault != null) {
                    C33134mqi.EZpvd(numCopydefault.intValue(), 17, 0, 0);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(DefiWalletMainActivity defiWalletMainActivity, Integer num) throws Throwable {
        if (num != null && num.intValue() == 1) {
            DefiWalletMainActivity.QOLQEE(defiWalletMainActivity);
        } else if (num != null && num.intValue() == 2) {
            defiWalletMainActivity.moveTaskToBack(true);
        }
        return Unit.INSTANCE;
    }
}
