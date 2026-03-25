package com.okinc.business.invest_biz.ui.screens.univ3.zap;

import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.SingleCryptoZapFragment$updateUI$1$1$1;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27021jnN;
import o.C27024jnQ;
import o.C27056jnw;
import o.C27492jwH;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.iHS;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleCryptoZapFragment$updateUI$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amountFirst;
    final /* synthetic */ boolean $showAprLoading;
    final /* synthetic */ iHS $this_apply;
    final /* synthetic */ InvestTokenWithAmount $token;
    int I$0;
    int I$1;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ C27056jnw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCryptoZapFragment$updateUI$1$1$1(iHS ihs, C27056jnw c27056jnw, String str, InvestTokenWithAmount investTokenWithAmount, boolean z, Continuation<? super SingleCryptoZapFragment$updateUI$1$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = ihs;
        this.this$0 = c27056jnw;
        this.$amountFirst = str;
        this.$token = investTokenWithAmount;
        this.$showAprLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleCryptoZapFragment$updateUI$1$1$1(this.$this_apply, this.this$0, this.$amountFirst, this.$token, this.$showAprLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleCryptoZapFragment$updateUI$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final int selectionStart;
        Object objCopydefault;
        final EditText editText;
        boolean z;
        final int i;
        String ratePercent$default;
        C27024jnQ c27024jnQ;
        String apr;
        List<InvestTokenWithAmount> investWithTokenList;
        Object next;
        Object next2;
        String coinAmount;
        List<C27021jnN> listOLrzqt;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            EditText editTextCopydefault = this.$this_apply.copydefault.copydefault();
            boolean zHasFocus = editTextCopydefault.hasFocus();
            selectionStart = editTextCopydefault.getSelectionStart();
            int selectionEnd = editTextCopydefault.getSelectionEnd();
            this.this$0.AhwBna = this.$amountFirst;
            this.this$0.AYXKKw().gEmmrt(this.this$0.KWHzl);
            this.this$0.AYXKKw().djBIcL(this.$amountFirst);
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelAYXKKw = this.this$0.AYXKKw();
            String str = this.$amountFirst;
            InvestTokenWithAmount investTokenWithAmount = this.$token;
            boolean z2 = this.$showAprLoading;
            this.L$0 = editTextCopydefault;
            this.Z$0 = zHasFocus;
            this.I$0 = selectionStart;
            this.I$1 = selectionEnd;
            this.label = 1;
            objCopydefault = investUniv3SubscribeViewModelAYXKKw.copydefault(true, str, investTokenWithAmount, (24 & 8) != 0 ? "" : null, (24 & 16) != 0 ? null : null, (24 & 32) != 0 ? true : z2, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            editText = editTextCopydefault;
            z = zHasFocus;
            i = selectionEnd;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$1;
            int i4 = this.I$0;
            z = this.Z$0;
            editText = (EditText) this.L$0;
            C56391yDq.AEQbTJ(obj);
            selectionStart = i4;
            i = i3;
            objCopydefault = obj;
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) objCopydefault;
        if (investUniv3SubscribeReceiveInfo != null && (listOLrzqt = this.this$0.OLrzqt(investUniv3SubscribeReceiveInfo)) != null) {
            iHS ihs = this.$this_apply;
            boolean zHasFocus2 = editText.hasFocus();
            final int selectionStart2 = editText.getSelectionStart();
            final int selectionEnd2 = editText.getSelectionEnd();
            ihs.OLrzqt.setCryptoItems(listOLrzqt);
            ihs.OLrzqt.setVisibility(listOLrzqt.isEmpty() ^ true ? 0 : 4);
            boolean zHasFocus3 = editText.hasFocus();
            if (zHasFocus2 && !zHasFocus3) {
                editText.post(new Runnable() { // from class: o.jnC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        SingleCryptoZapFragment$updateUI$1$1$1.invokeSuspend$lambda$3$lambda$2(editText, selectionStart2, selectionEnd2);
                    }
                });
            }
        }
        if (investUniv3SubscribeReceiveInfo != null && (investWithTokenList = investUniv3SubscribeReceiveInfo.getInvestWithTokenList()) != null) {
            InvestTokenWithAmount investTokenWithAmount2 = this.$token;
            Iterator<T> it = investWithTokenList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) investTokenWithAmount2.getTokenAddress())) {
                    break;
                }
            }
            InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) next;
            if (investTokenWithAmount3 != null) {
                C27056jnw c27056jnw = this.this$0;
                String str2 = this.$amountFirst;
                iHS ihs2 = this.$this_apply;
                InvestTokenWithAmount investTokenWithAmount4 = this.$token;
                Iterator<T> it2 = c27056jnw.valueOf().getInvestWithTokenList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next2).getTokenAddress(), (Object) investTokenWithAmount4.getTokenAddress())) {
                        break;
                    }
                }
                InvestTokenWithAmount investTokenWithAmount5 = (InvestTokenWithAmount) next2;
                if (investTokenWithAmount5 == null || (coinAmount = investTokenWithAmount5.getCoinAmount()) == null) {
                    InvestTokenWithAmount investTokenWithAmount6 = c27056jnw.KWHzl;
                    coinAmount = investTokenWithAmount6 != null ? investTokenWithAmount6.getCoinAmount() : "0";
                }
                boolean zGEmmrt = C33129mqd.gEmmrt(coinAmount, str2);
                ihs2.copydefault.OLrzqt(investTokenWithAmount3.getCurrencyAmount());
                ihs2.copydefault.OLrzqt(coinAmount, zGEmmrt, c27056jnw.OLrzqt(investTokenWithAmount3.isBaseToken(), C33129mqd.subS$default(coinAmount, str2, null, null, null, 14, null)));
            }
        }
        MutableLiveData<String> mutableLiveDataGHZMYf = this.this$0.AYXKKw().gHZMYf();
        if (investUniv3SubscribeReceiveInfo == null || (apr = investUniv3SubscribeReceiveInfo.getApr()) == null || (ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, apr, false, 2, null)) == null) {
            ratePercent$default = "--";
        }
        mutableLiveDataGHZMYf.setValue(ratePercent$default);
        MutableLiveData<C27024jnQ> mutableLiveDataQKVWgx = this.this$0.AYXKKw().QKVWgx();
        if (investUniv3SubscribeReceiveInfo != null) {
            c27024jnQ = new C27024jnQ(investUniv3SubscribeReceiveInfo, YieldState.FILLED);
        } else {
            c27024jnQ = new C27024jnQ(null, null, 3, null);
        }
        mutableLiveDataQKVWgx.setValue(c27024jnQ);
        this.this$0.gEmmrt();
        if (z && !editText.isFocused()) {
            editText.post(new Runnable() { // from class: o.jnF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    SingleCryptoZapFragment$updateUI$1$1$1.invokeSuspend$lambda$10(editText, selectionStart, i);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(final EditText editText, final int i, final int i2) {
        editText.post(new Runnable() { // from class: o.jnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SingleCryptoZapFragment$updateUI$1$1$1.invokeSuspend$lambda$3$lambda$2$lambda$1(editText, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2$lambda$1(final EditText editText, final int i, final int i2) {
        if (!editText.isFocused()) {
            editText.requestFocus();
        }
        editText.post(new Runnable() { // from class: o.jnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SingleCryptoZapFragment$updateUI$1$1$1.invokeSuspend$lambda$3$lambda$2$lambda$1$lambda$0(i, i2, editText);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2$lambda$1$lambda$0(int i, int i2, EditText editText) {
        if (i < 0 || i2 < 0 || i > editText.getText().length() || i2 > editText.getText().length()) {
            return;
        }
        editText.setSelection(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$10(final EditText editText, final int i, final int i2) {
        editText.post(new Runnable() { // from class: o.jnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SingleCryptoZapFragment$updateUI$1$1$1.invokeSuspend$lambda$10$lambda$9(editText, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$10$lambda$9(final EditText editText, final int i, final int i2) {
        if (!editText.isFocused()) {
            editText.requestFocus();
        }
        editText.post(new Runnable() { // from class: o.jnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SingleCryptoZapFragment$updateUI$1$1$1.invokeSuspend$lambda$10$lambda$9$lambda$8(i, i2, editText);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$10$lambda$9$lambda$8(int i, int i2, EditText editText) {
        if (i < 0 || i2 < 0 || i > editText.getText().length() || i2 > editText.getText().length()) {
            return;
        }
        editText.setSelection(i, i2);
    }
}
