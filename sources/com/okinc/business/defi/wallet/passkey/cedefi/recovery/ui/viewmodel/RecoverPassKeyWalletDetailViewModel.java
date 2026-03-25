package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.passkey.common.bean.ChainInfo;
import com.okinc.business.defi.wallet.passkey.common.bean.EmailInfo;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C17628fMj;
import o.C17630fMl;
import o.C17631fMm;
import o.C56403yEb;
import o.InterfaceC49371unL;
import o.fLU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class RecoverPassKeyWalletDetailViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<InterfaceC49371unL<C17628fMj>> AEQbTJ;
    public final fLU EZpvd;
    public StateFlow<? extends InterfaceC49371unL<C17628fMj>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<o.fMj>>, kotlinx.coroutines.flow.StateFlow<o.unL<o.fMj>> */
    public final StateFlow<InterfaceC49371unL<C17628fMj>> copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public RecoverPassKeyWalletDetailViewModel(@NotNull fLU flu) {
        Intrinsics.checkNotNullParameter(flu, "");
        this.EZpvd = flu;
        MutableStateFlow<InterfaceC49371unL<C17628fMj>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RecoverPassKeyWalletDetailViewModel$getRecoverEmailDetailInfo$1(this, null), 3, null);
    }

    public final C17628fMj KWHzl(PasskeyWalletRecoverInfoRes passkeyWalletRecoverInfoRes) {
        List<EmailInfo> emailInfoList = passkeyWalletRecoverInfoRes.getEmailInfoList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(emailInfoList, 10));
        int i = 0;
        for (Object obj : emailInfoList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            EmailInfo emailInfo = (EmailInfo) obj;
            List<ChainInfo> chainInfoList = emailInfo.getChainInfoList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(chainInfoList, 10));
            for (ChainInfo chainInfo : chainInfoList) {
                arrayList2.add(new C17630fMl(chainInfo.getChainName(), chainInfo.getChainLogo()));
            }
            arrayList.add(new C17631fMm(i, emailInfo.getFromEmail(), arrayList2));
            i++;
        }
        return new C17628fMj(arrayList, passkeyWalletRecoverInfoRes.getToEmail(), passkeyWalletRecoverInfoRes.getSubjectContent());
    }
}
