package com.okinc.business.defi.wallet;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.internal.fido.zzep;
import com.okinc.business.defi.wallet.DefiWalletMainActivity$deepLinkOkxConnectWallet$1;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.reown.android.push.notifications.PushMessagingService;
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
import o.C15935eaT;
import o.C18355fgo;
import o.C33069mpW;
import o.C33070mpX;
import o.C33134mqi;
import o.C52761wXj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.pUU;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$deepLinkOkxConnectWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ C15935eaT $okxConnectManager;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ValidateCanConnectResult.ErrorType.values().length];
            try {
                iArr[ValidateCanConnectResult.ErrorType.WALLET_NOT_BACKED_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$deepLinkOkxConnectWallet$1(DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, C15935eaT c15935eaT, AbstractC12782ctV abstractC12782ctV, Continuation<? super DefiWalletMainActivity$deepLinkOkxConnectWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletMainActivity;
        this.$bundle = bundle;
        this.$okxConnectManager = c15935eaT;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$deepLinkOkxConnectWallet$1(this.this$0, this.$bundle, this.$okxConnectManager, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$deepLinkOkxConnectWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        ByteString byteStringDecodeBase64;
        OKXConnectException.ErrorType errorType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 602744315, -602744300, new Object[]{this.this$0}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
            String string = this.$bundle.getString("param");
            String strUtf8 = (string == null || (byteStringDecodeBase64 = ByteString.Companion.decodeBase64(string)) == null) ? null : byteStringDecodeBase64.utf8();
            String str = strUtf8 == null ? "" : strUtf8;
            String string2 = this.$bundle.getString(PushMessagingService.KEY_TOPIC);
            String str2 = string2 == null ? "" : string2;
            C15935eaT c15935eaT = this.$okxConnectManager;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            boolean z = str.length() == 0;
            this.label = 1;
            objOLrzqt = c15935eaT.OLrzqt(str, abstractC12782ctV, z, str2, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        ValidateCanConnectResult validateCanConnectResult = (ValidateCanConnectResult) objOLrzqt;
        if (!validateCanConnectResult.EZpvd()) {
            pUU.KWHzl(this.this$0.getTAG(), "deepLinkOkxConnectWallet - Cannot show connect prompt");
            DAppConnectRequest dAppConnectRequestCopydefault = this.$okxConnectManager.copydefault();
            if (dAppConnectRequestCopydefault != null) {
                C15935eaT c15935eaT2 = this.$okxConnectManager;
                if (validateCanConnectResult.KWHzl() == ValidateCanConnectResult.ErrorType.RISKY_CONNECTION) {
                    errorType = OKXConnectException.ErrorType.RISKY_CONNECTION;
                } else {
                    errorType = OKXConnectException.ErrorType.USER_REJECTED;
                }
                c15935eaT2.KWHzl(errorType);
                c15935eaT2.copydefault(dAppConnectRequestCopydefault.getTopic());
            }
        }
        DefiWalletMainActivity.copydefault(zzep.AEQbTJ(), 933170, -933100, new Object[]{this.this$0}, zzep.AEQbTJ(), zzep.AEQbTJ(), zzep.AEQbTJ());
        if (validateCanConnectResult.EZpvd()) {
            pUU.KWHzl(this.this$0.getTAG(), "deepLinkOkxConnectWallet - Showing connect prompt");
            C18355fgo.KWHzl.EZpvd(this.this$0, 3, 0, "", this.$wallet.DbNXlk());
        } else {
            pUU.KWHzl(this.this$0.getTAG(), "deepLinkOkxConnectWallet - Error connecting " + validateCanConnectResult.KWHzl());
            if (TaskDescription.KWHzl[validateCanConnectResult.KWHzl().ordinal()] == 1) {
                pUU.KWHzl(this.this$0.getTAG(), "deepLinkOkxConnectWallet - Current wallet is not backed-up");
                if (this.this$0.getSupportFragmentManager().isStateSaved()) {
                    return Unit.INSTANCE;
                }
                pUU.KWHzl(this.this$0.getTAG(), "deepLinkOkxConnectWallet - Show back-up dialog");
                try {
                    DefiWalletVReminderDFragment.ActionBar actionBar = DefiWalletVReminderDFragment.Companion;
                    int i2 = C52761wXj.TaskDescription.NRYds;
                    String string3 = this.this$0.getString(C13754dXa.FragmentManager.fmB);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDCKfqPDCfLja);
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = this.$wallet.gwTjWJ();
                    String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
                    String strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("AccountName", strAuCTel + "-" + this.$wallet.AkhnZx())));
                    String string4 = this.this$0.getString(C13754dXa.FragmentManager.scanPackages);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = actionBar.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i2, null, string3, strOLrzqt, string4, "", 2, null));
                    FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    final DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                    defiWalletVReminderDFragmentEZpvd.AEQbTJ(supportFragmentManager, new Function1() { // from class: o.dWT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return DefiWalletMainActivity$deepLinkOkxConnectWallet$1.invokeSuspend$lambda$1(defiWalletMainActivity, (java.lang.Integer) obj2);
                        }
                    });
                } catch (Exception e) {
                    pUU.AEQbTJ(this.this$0.getTAG(), "deepLinkOkxConnectWallet - Failed to show back-up dialog", e);
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
