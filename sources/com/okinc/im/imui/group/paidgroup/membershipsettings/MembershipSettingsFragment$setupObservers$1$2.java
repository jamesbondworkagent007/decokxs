package com.okinc.im.imui.group.paidgroup.membershipsettings;

import android.widget.TextView;
import com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.SupportedCurrencies;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33069mpW;
import o.C33070mpX;
import o.C33934nLg;
import o.C34323nZs;
import o.C35399nuc;
import o.C37683oyU;
import o.C55001xbh;
import o.C55052xcf;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.nJY;
import o.pTB;
import o.sON;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MembershipSettingsFragment$setupObservers$1$2 extends SuspendLambda implements yHO<CoroutineScope, MembershipSettingsViewModel.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34323nZs this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupBillingType.values().length];
            try {
                iArr[GroupBillingType.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupBillingType.YEARLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembershipSettingsFragment$setupObservers$1$2(C34323nZs c34323nZs, Continuation<? super MembershipSettingsFragment$setupObservers$1$2> continuation) {
        super(3, continuation);
        this.this$0 = c34323nZs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, MembershipSettingsViewModel.Activity activity, Continuation<? super Unit> continuation) {
        MembershipSettingsFragment$setupObservers$1$2 membershipSettingsFragment$setupObservers$1$2 = new MembershipSettingsFragment$setupObservers$1$2(this.this$0, continuation);
        membershipSettingsFragment$setupObservers$1$2.L$0 = activity;
        return membershipSettingsFragment$setupObservers$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAYXKKw;
        String amount;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MembershipSettingsViewModel.Activity activity = (MembershipSettingsViewModel.Activity) this.L$0;
            if (activity instanceof MembershipSettingsViewModel.Activity.StateListAnimator) {
                nJY njy = this.this$0.gEmmrt;
                if (njy == null) {
                    Intrinsics.gEmmrt("");
                    njy = null;
                }
                njy.isConnected.fIwbmz();
                njy.djBIcL.setEnabled(true);
                sON sonCopydefault = ((MembershipSettingsViewModel.Activity.StateListAnimator) activity).copydefault();
                if (sonCopydefault instanceof sON.Activity) {
                    C55326xho.toastWithFailedIcon$default(C35399nuc.LoaderManager.addSocket, 0, 1, (Object) null);
                } else {
                    if (!Intrinsics.EZpvd(sonCopydefault, sON.TaskDescription.AEQbTJ)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.hBUiXU, 0, 1, (Object) null);
                }
            } else {
                if (!(activity instanceof MembershipSettingsViewModel.Activity.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                MembershipSettingsViewModel.Activity.TaskDescription taskDescription = (MembershipSettingsViewModel.Activity.TaskDescription) activity;
                SupportedCurrencies supportedCurrenciesKWHzl = taskDescription.KWHzl();
                GroupEntryBillingModel groupEntryBillingModelEZpvd = taskDescription.EZpvd();
                nJY njy2 = this.this$0.gEmmrt;
                if (njy2 == null) {
                    Intrinsics.gEmmrt("");
                    njy2 = null;
                }
                C34323nZs c34323nZs = this.this$0;
                GroupBillingType billingType = groupEntryBillingModelEZpvd != null ? groupEntryBillingModelEZpvd.getBillingType() : null;
                int i = billingType == null ? -1 : Application.KWHzl[billingType.ordinal()];
                if (i == 1) {
                    strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.UJpkuA);
                } else {
                    strAYXKKw = i != 2 ? "" : C33070mpX.AYXKKw(C35399nuc.LoaderManager.compare);
                }
                njy2.AEQbTJ.setText(strAYXKKw);
                C55001xbh c55001xbh = njy2.djBIcL;
                c55001xbh.setMaxDecimalValue(supportedCurrenciesKWHzl.getDecimalPoint());
                c55001xbh.setText((groupEntryBillingModelEZpvd == null || (amount = groupEntryBillingModelEZpvd.getAmount()) == null) ? null : C37683oyU.AEQbTJ(amount, C56443yFo.AEQbTJ(supportedCurrenciesKWHzl.getDecimalPoint())));
                c55001xbh.setHintText(C37683oyU.AEQbTJ(supportedCurrenciesKWHzl.getMinAmount(), C56443yFo.AEQbTJ(supportedCurrenciesKWHzl.getDecimalPoint())));
                njy2.gEmmrt.setText(C33069mpW.copydefault(c34323nZs, C35399nuc.LoaderManager.RgaQzq, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("lower", pTB.formatLocalized$default(supportedCurrenciesKWHzl.getMinAmount(), null, 1, null)), C56390yDp.OLrzqt("upper", pTB.formatLocalized$default(supportedCurrenciesKWHzl.getMaxAmount(), null, 1, null)), C56390yDp.OLrzqt("currency", supportedCurrenciesKWHzl.getCurrencyCode()))));
                C33934nLg c33934nLg = this.this$0.AYXKKw;
                if (c33934nLg == null) {
                    Intrinsics.gEmmrt("");
                    c33934nLg = null;
                }
                C55052xcf c55052xcf = c33934nLg.OLrzqt;
                c55052xcf.EZpvd().setVisibility(8);
                TextView textViewCopydefault = c55052xcf.copydefault();
                String currencyCode = groupEntryBillingModelEZpvd != null ? groupEntryBillingModelEZpvd.getCurrencyCode() : null;
                textViewCopydefault.setText(currencyCode != null ? currencyCode : "");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
